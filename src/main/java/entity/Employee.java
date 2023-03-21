package entity;

import java.util.List;
import java.util.Objects;

public class Employee {
    private Long id;
    private EmployeePersonalInfo personalInfo;
    private Position position;
    private List<Task> tasks;

    public Employee(Long id, EmployeePersonalInfo personalInfo, Position position, List<Task> tasks) {
        this.id = id;
        this.personalInfo = personalInfo;
        this.position = position;
        this.tasks = tasks;
    }

    public Long getId() {
        return id;
    }

    public EmployeePersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(EmployeePersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Employee{" +
               "personalInfo=" + personalInfo +
               ", position=" + position +
               ", tasks=" + tasks +
               '}';
    }


}
