package com.example.gentrier.presentation.feature.session.active;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0002R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0018"}, d2 = {"Lcom/example/gentrier/presentation/feature/session/active/ActiveSessionViewModel;", "Landroidx/lifecycle/ViewModel;", "startSkiSessionUseCase", "Lcom/example/gentrier/domain/usecase/ski/StartSkiSessionUseCase;", "endSkiSessionUseCase", "Lcom/example/gentrier/domain/usecase/ski/EndSkiSessionUseCase;", "getActiveSessionUseCase", "Lcom/example/gentrier/domain/usecase/ski/GetActiveSessionUseCase;", "getLocationUpdatesUseCase", "Lcom/example/gentrier/domain/usecase/location/GetLocationUpdatesUseCase;", "(Lcom/example/gentrier/domain/usecase/ski/StartSkiSessionUseCase;Lcom/example/gentrier/domain/usecase/ski/EndSkiSessionUseCase;Lcom/example/gentrier/domain/usecase/ski/GetActiveSessionUseCase;Lcom/example/gentrier/domain/usecase/location/GetLocationUpdatesUseCase;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/gentrier/presentation/feature/session/active/ActiveSessionState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "clearError", "", "endSession", "observeActiveSession", "observeLocationUpdates", "startSession", "presentation_release"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class ActiveSessionViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.gentrier.domain.usecase.ski.StartSkiSessionUseCase startSkiSessionUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.gentrier.domain.usecase.ski.EndSkiSessionUseCase endSkiSessionUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.gentrier.domain.usecase.ski.GetActiveSessionUseCase getActiveSessionUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.gentrier.domain.usecase.location.GetLocationUpdatesUseCase getLocationUpdatesUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.gentrier.presentation.feature.session.active.ActiveSessionState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.gentrier.presentation.feature.session.active.ActiveSessionState> state = null;
    
    @javax.inject.Inject()
    public ActiveSessionViewModel(@org.jetbrains.annotations.NotNull()
    com.example.gentrier.domain.usecase.ski.StartSkiSessionUseCase startSkiSessionUseCase, @org.jetbrains.annotations.NotNull()
    com.example.gentrier.domain.usecase.ski.EndSkiSessionUseCase endSkiSessionUseCase, @org.jetbrains.annotations.NotNull()
    com.example.gentrier.domain.usecase.ski.GetActiveSessionUseCase getActiveSessionUseCase, @org.jetbrains.annotations.NotNull()
    com.example.gentrier.domain.usecase.location.GetLocationUpdatesUseCase getLocationUpdatesUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.gentrier.presentation.feature.session.active.ActiveSessionState> getState() {
        return null;
    }
    
    private final void startSession() {
    }
    
    public final void endSession() {
    }
    
    public final void clearError() {
    }
    
    private final void observeActiveSession() {
    }
    
    private final void observeLocationUpdates() {
    }
}