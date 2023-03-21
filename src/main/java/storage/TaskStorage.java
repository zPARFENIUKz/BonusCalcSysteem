package storage;

import entity.Task;

import java.util.Optional;

public interface TaskStorage {
    boolean addTask(final Task task);
    boolean removeTask(final Task task);

    Optional.
}