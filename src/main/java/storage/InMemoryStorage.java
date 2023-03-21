package storage;

import entity.Employee;
import entity.Position;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

public class InMemoryStorage implements EmployeeStorage {
    private static InMemoryStorage instance = null;
    private final List<Employee> employees = new CopyOnWriteArrayList<>();

    private InMemoryStorage() {
    }

    public static InMemoryStorage getInstance() {
        if (instance == null) {
            synchronized (InMemoryStorage.class) {
                if (instance == null) {
                    instance = new InMemoryStorage();
                }
            }
        }
        return instance;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return Collections.unmodifiableList(employees);
    }

    @Override
    public List<Employee> getEmployeesByPosition(Position position) {
        return employees.stream()
                .filter(employee -> employee.getPosition().equals(position))
                .toList();
    }

    @Override
    public Optional<Employee> getEmployeeById(Long id) {
        return employees.stream()
                .filter(employee -> employee.getId().equals(id))
                .findFirst();
    }

    @Override
    public boolean addEmployee(Employee employee) {
        if (employee == null) throw new NullPointerException("employee can't be null");
        if (employees.stream().anyMatch(empl -> empl.getId().equals(employee.getId()))) {
            return false;
        }
        employees.add(employee);
        return true;
    }

    @Override
    public boolean deleteEmployee(Employee employee) {
        return employees.removeIf(empl -> empl.getId().equals(employee.getId()));
    }
}
