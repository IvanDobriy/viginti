package com.rid.viginti.core;

public interface MutableProperty<T> extends Property<T> {
    void set(T value);
}
