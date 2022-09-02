package org.teignbridge.common.event;

public final class EventBus {

    public void postEvent(Event<?> event){
        event.callEvents(event);
    }

}
