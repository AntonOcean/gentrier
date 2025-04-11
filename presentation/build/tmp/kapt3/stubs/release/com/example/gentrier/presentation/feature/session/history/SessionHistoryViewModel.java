package com.example.gentrier.presentation.feature.session.history;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\rH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000f"}, d2 = {"Lcom/example/gentrier/presentation/feature/session/history/SessionHistoryViewModel;", "Landroidx/lifecycle/ViewModel;", "getAllSessionsUseCase", "Lcom/example/gentrier/domain/usecase/ski/GetAllSessionsUseCase;", "(Lcom/example/gentrier/domain/usecase/ski/GetAllSessionsUseCase;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/gentrier/presentation/feature/session/history/SessionHistoryState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "clearError", "", "loadSessions", "presentation_release"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class SessionHistoryViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.gentrier.domain.usecase.ski.GetAllSessionsUseCase getAllSessionsUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.gentrier.presentation.feature.session.history.SessionHistoryState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.gentrier.presentation.feature.session.history.SessionHistoryState> state = null;
    
    @javax.inject.Inject()
    public SessionHistoryViewModel(@org.jetbrains.annotations.NotNull()
    com.example.gentrier.domain.usecase.ski.GetAllSessionsUseCase getAllSessionsUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.gentrier.presentation.feature.session.history.SessionHistoryState> getState() {
        return null;
    }
    
    private final void loadSessions() {
    }
    
    public final void clearError() {
    }
}