package com.example.gentrier.presentation.feature.session.active

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Stop
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.gentrier.domain.model.LocationPoint
import java.time.Duration
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ActiveSessionScreen(
    onFinishSession: (String) -> Unit,
    onCancel: () -> Unit,
    viewModel: ActiveSessionViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    val snackbarHostState = remember { SnackbarHostState() }
    var showConfirmEndDialog by remember { mutableStateOf(false) }

    LaunchedEffect(state.error) {
        state.error?.let {
            snackbarHostState.showSnackbar(it)
            viewModel.clearError()
        }
    }

    LaunchedEffect(state.sessionEnded, state.sessionId) {
        if (state.sessionEnded && state.sessionId.isNotEmpty()) {
            onFinishSession(state.sessionId)
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Active Session") },
                navigationIcon = {
                    IconButton(onClick = { onCancel() }) {
                        Icon(Icons.Default.Close, contentDescription = "Cancel")
                    }
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { showConfirmEndDialog = true },
                containerColor = MaterialTheme.colorScheme.secondary
            ) {
                Icon(
                    imageVector = Icons.Default.Stop,
                    contentDescription = "End Session",
                    tint = MaterialTheme.colorScheme.onSecondary
                )
            }
        },
        snackbarHost = { SnackbarHost(snackbarHostState) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            if (state.isLoading) {
                CircularProgressIndicator(
                    modifier = Modifier.align(Alignment.Center)
                )
            } else {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    CurrentStatsCard(
                        currentLocation = state.currentLocation, 
                        session = state.session
                    )
                    
                    Spacer(modifier = Modifier.height(16.dp))
                    
                    Card(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(200.dp)
                                .background(MaterialTheme.colorScheme.surfaceVariant),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "Map will be displayed here",
                                style = MaterialTheme.typography.bodyMedium
                            )
                            // In a real implementation, this would contain a map
                            // showing the current route
                        }
                    }
                    
                    // Session summary card
                    if (state.session != null) {
                        Spacer(modifier = Modifier.height(16.dp))
                        
                        SessionSummaryCard(session = state.session!!)
                    }
                }
            }
        }
        
        if (showConfirmEndDialog) {
            AlertDialog(
                onDismissRequest = { showConfirmEndDialog = false },
                title = { Text("End Session") },
                text = { Text("Are you sure you want to end the current ski session?") },
                confirmButton = {
                    Button(
                        onClick = {
                            showConfirmEndDialog = false
                            viewModel.endSession()
                        }
                    ) {
                        Text("End Session")
                    }
                },
                dismissButton = {
                    TextButton(onClick = { showConfirmEndDialog = false }) {
                        Text("Cancel")
                    }
                }
            )
        }
    }
}

@Composable
fun CurrentStatsCard(
    currentLocation: LocationPoint?,
    session: com.example.gentrier.domain.model.SkiSession?
) {
    Card(
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                StatItem(
                    value = formatSpeed(currentLocation?.speed ?: 0f),
                    label = "Current Speed"
                )
                
                StatItem(
                    value = formatSpeed(session?.maxSpeed ?: 0f),
                    label = "Max Speed"
                )
                
                StatItem(
                    value = formatAltitude(currentLocation?.altitude ?: 0.0),
                    label = "Altitude"
                )
            }
            
            Spacer(modifier = Modifier.height(8.dp))
            
            if (currentLocation != null) {
                Box(
                    modifier = Modifier
                        .size(12.dp)
                        .clip(CircleShape)
                        .background(MaterialTheme.colorScheme.primary)
                )
                
                Text(
                    text = "GPS Signal: Active",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.primary
                )
            } else {
                Box(
                    modifier = Modifier
                        .size(12.dp)
                        .clip(CircleShape)
                        .background(MaterialTheme.colorScheme.error)
                )
                
                Text(
                    text = "GPS Signal: Searching...",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.error
                )
            }
        }
    }
}

@Composable
fun SessionSummaryCard(session: com.example.gentrier.domain.model.SkiSession) {
    Card(
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = "Session Summary",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold
            )
            
            Spacer(modifier = Modifier.height(8.dp))
            
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text(
                        text = "Started",
                        style = MaterialTheme.typography.bodySmall
                    )
                    Text(
                        text = formatDateTime(session.startTime),
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
                
                Column {
                    Text(
                        text = "Duration",
                        style = MaterialTheme.typography.bodySmall
                    )
                    Text(
                        text = formatDuration(session.startTime, LocalDateTime.now()),
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            }
            
            Spacer(modifier = Modifier.height(12.dp))
            
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text(
                        text = "Distance",
                        style = MaterialTheme.typography.bodySmall
                    )
                    Text(
                        text = formatDistance(session.distance),
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
                
                Column {
                    Text(
                        text = "Avg Speed",
                        style = MaterialTheme.typography.bodySmall
                    )
                    Text(
                        text = formatSpeed(session.avgSpeed),
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
                
                Column {
                    Text(
                        text = "Elevation",
                        style = MaterialTheme.typography.bodySmall
                    )
                    Text(
                        text = formatElevation(session.elevationGain, session.elevationLoss),
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            }
        }
    }
}

@Composable
fun StatItem(value: String, label: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = value,
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = label,
            style = MaterialTheme.typography.bodySmall
        )
    }
}

// Helper formatting functions
fun formatSpeed(speed: Float): String {
    return "${speed.toInt()} km/h"
}

fun formatAltitude(altitude: Double): String {
    return "${altitude.toInt()} m"
}

fun formatDistance(distance: Float): String {
    return if (distance < 1000) {
        "${distance.toInt()} m"
    } else {
        String.format("%.2f km", distance / 1000)
    }
}

fun formatElevation(gain: Float, loss: Float): String {
    return "+${gain.toInt()}m/-${loss.toInt()}m"
}

fun formatDateTime(dateTime: LocalDateTime): String {
    return dateTime.format(DateTimeFormatter.ofPattern("HH:mm"))
}

fun formatDuration(start: LocalDateTime, end: LocalDateTime): String {
    val duration = Duration.between(start, end)
    val hours = duration.toHours()
    val minutes = duration.toMinutes() % 60
    val seconds = duration.seconds % 60
    
    return if (hours > 0) {
        String.format("%d:%02d:%02d", hours, minutes, seconds)
    } else {
        String.format("%02d:%02d", minutes, seconds)
    }
}