package com.example.gentrier.presentation.feature.session.detail;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\b\u0010\u0013\u001a\u00020\u0011H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0014"}, d2 = {"Lcom/example/gentrier/presentation/feature/session/detail/SessionDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "skiSessionRepository", "Lcom/example/gentrier/domain/repository/SkiSessionRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/example/gentrier/domain/repository/SkiSessionRepository;Landroidx/lifecycle/SavedStateHandle;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/gentrier/presentation/feature/session/detail/SessionDetailState;", "sessionId", "", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "clearError", "", "deleteSession", "loadSession", "presentation_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class SessionDetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.gentrier.domain.repository.SkiSessionRepository skiSessionRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.gentrier.presentation.feature.session.detail.SessionDetailState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.gentrier.presentation.feature.session.detail.SessionDetailState> state = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String sessionId = null;
    
    @javax.inject.Inject()
    public SessionDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.example.gentrier.domain.repository.SkiSessionRepository skiSessionRepository, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.gentrier.presentation.feature.session.detail.SessionDetailState> getState() {
        return null;
    }
    
    private final void loadSession() {
    }
    
    public final void deleteSession() {
    }
    
    public final void clearError() {
    }
}