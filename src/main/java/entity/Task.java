package entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Task {
    private Long id;
    private List<Employee> taskEmployees;
    private String taskDescription;
    private LocalDateTime deadline;

    public Task(Long id, List<Employee> taskEmployees, String taskDescription, LocalDateTime deadline) {
        this.id = id;
        this.taskEmployees = taskEmployees;
        this.taskDescription = taskDescription;
        this.deadline = deadline;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Employee> getTaskEmployees() {
        return taskEmployees;
    }

    public void setTaskEmployees(List<Employee> taskEmployees) {
        this.taskEmployees = taskEmployees;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id) && Objects.equals(taskEmployees, task.taskEmployees) && Objects.equals(taskDescription, task.taskDescription) && Objects.equals(deadline, task.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, taskEmployees, taskDescription, deadline);
    }

    @Override
    public String toString() {
        return "Task{" +
               "id=" + id +
               ", taskEmployees=" + taskEmployees +
               ", taskDescription='" + taskDescription + '\'' +
               ", deadline=" + deadline +
               '}';
    }
}
