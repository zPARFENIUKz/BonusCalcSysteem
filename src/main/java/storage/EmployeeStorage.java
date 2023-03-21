package storage;

import entity.Employee;
import entity.Position;

import java.util.List;
import java.util.Optional;

public interface EmployeeStorage {
    List<Employee> getAllEmployees();
    List<Employee> getEmployeesByPosition(final Position position);

    Optional<Employee> getEmployeeById(final Long id);

    boolean addEmployee(final Employee employee);

    boolean deleteEmployee(final Employee employee);
}
