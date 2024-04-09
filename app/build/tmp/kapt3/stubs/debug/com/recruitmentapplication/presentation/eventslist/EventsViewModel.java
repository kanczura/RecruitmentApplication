package com.recruitmentapplication.presentation.eventslist;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u0017R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0018"}, d2 = {"Lcom/recruitmentapplication/presentation/eventslist/EventsViewModel;", "Landroidx/lifecycle/ViewModel;", "eventsUseCase", "Lcom/recruitmentapplication/domain/usecase/GetEventUseCase;", "dateTimeFormatter", "Lcom/recruitmentapplication/presentation/DateTimeFormatter;", "(Lcom/recruitmentapplication/domain/usecase/GetEventUseCase;Lcom/recruitmentapplication/presentation/DateTimeFormatter;)V", "_event", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/recruitmentapplication/presentation/eventslist/Event;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/recruitmentapplication/presentation/eventslist/EventViewState;", "event", "Lkotlinx/coroutines/flow/SharedFlow;", "getEvent", "()Lkotlinx/coroutines/flow/SharedFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "onEventClicked", "", "Lcom/recruitmentapplication/domain/model/Event;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class EventsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.recruitmentapplication.domain.usecase.GetEventUseCase eventsUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.recruitmentapplication.presentation.DateTimeFormatter dateTimeFormatter = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.recruitmentapplication.presentation.eventslist.EventViewState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.recruitmentapplication.presentation.eventslist.EventViewState> uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.recruitmentapplication.presentation.eventslist.Event> _event = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<com.recruitmentapplication.presentation.eventslist.Event> event = null;
    
    @javax.inject.Inject()
    public EventsViewModel(@org.jetbrains.annotations.NotNull()
    com.recruitmentapplication.domain.usecase.GetEventUseCase eventsUseCase, @org.jetbrains.annotations.NotNull()
    com.recruitmentapplication.presentation.DateTimeFormatter dateTimeFormatter) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.recruitmentapplication.presentation.eventslist.EventViewState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<com.recruitmentapplication.presentation.eventslist.Event> getEvent() {
        return null;
    }
    
    public final void onEventClicked(@org.jetbrains.annotations.NotNull()
    com.recruitmentapplication.domain.model.Event event) {
    }
}