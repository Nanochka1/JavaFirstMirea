package ru.mirea.task21.Objects;

import java.util.List;

public interface GenericObject<T>
{
    T getObject();

    List<CustomObject> getCustomObjects();
}