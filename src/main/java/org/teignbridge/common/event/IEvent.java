package org.teignbridge.common.event;

public interface IEvent<T> {

    void run(T event);

}
