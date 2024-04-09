package com.recruitmentapplication.presentation.schedulelist;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lcom/recruitmentapplication/presentation/schedulelist/ScheduleListViewModel;", "Landroidx/lifecycle/ViewModel;", "scheduleUseCase", "Lcom/recruitmentapplication/domain/usecase/GetScheduleUseCase;", "(Lcom/recruitmentapplication/domain/usecase/GetScheduleUseCase;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/recruitmentapplication/presentation/schedulelist/ScheduleViewState;", "job", "Lkotlinx/coroutines/Job;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "getSchedule", "", "startUpdates", "stopUpdates", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class ScheduleListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.recruitmentapplication.domain.usecase.GetScheduleUseCase scheduleUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.recruitmentapplication.presentation.schedulelist.ScheduleViewState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.recruitmentapplication.presentation.schedulelist.ScheduleViewState> state = null;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job job;
    
    @javax.inject.Inject()
    public ScheduleListViewModel(@org.jetbrains.annotations.NotNull()
    com.recruitmentapplication.domain.usecase.GetScheduleUseCase scheduleUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.recruitmentapplication.presentation.schedulelist.ScheduleViewState> getState() {
        return null;
    }
    
    private final void getSchedule() {
    }
    
    private final void startUpdates() {
    }
    
    private final void stopUpdates() {
    }
}