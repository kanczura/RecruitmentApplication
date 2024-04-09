package com.recruitmentapplication.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/recruitmentapplication/data/repository/EventRepositoryImpl;", "Lcom/recruitmentapplication/domain/repository/EventRepository;", "eventApi", "Lcom/recruitmentapplication/data/network/EventApi;", "(Lcom/recruitmentapplication/data/network/EventApi;)V", "getEvents", "", "Lcom/recruitmentapplication/domain/model/Event;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class EventRepositoryImpl implements com.recruitmentapplication.domain.repository.EventRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.recruitmentapplication.data.network.EventApi eventApi = null;
    
    @javax.inject.Inject()
    public EventRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.recruitmentapplication.data.network.EventApi eventApi) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getEvents(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.recruitmentapplication.domain.model.Event>> $completion) {
        return null;
    }
}