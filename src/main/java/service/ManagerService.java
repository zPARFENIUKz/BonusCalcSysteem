package service;

import entity.Employee;
import entity.Position;
import entity.Task;
import storage.EmployeeStorage;
import storage.InMemoryStorage;

import java.util.List;
import java.util.regex.Pattern;

public class ManagerService {
    private static ManagerService instance = null;
    private final EmployeeStorage employeeStorage = InMemoryStorage.getInstance();

    private ManagerService() {
    }

    public static ManagerService getInstance() {
        if (instance == null) {
            synchronized (ManagerService.class) {
                if (instance == null) {
                    instance = new ManagerService();
                }
            }
        }
        return instance;
    }

    public boolean addTask(final Task task) {
        if (task == null) throw new NullPointerException("there must be task");
        List<Employee> taskEmployees = task.getTaskEmployees();
        if (taskEmployees == null) throw new NullPointerException("there must be employees for this task");
        if (taskEmployees.stream().anyMatch(empl -> !empl.getPosition().equals(Position.LEAD))) {
            throw new IllegalArgumentException("manager can give task only for leads!");
        }

    }
}
