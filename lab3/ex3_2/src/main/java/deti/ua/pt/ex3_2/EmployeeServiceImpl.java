package deti.ua.pt.ex3_2;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long employeeId) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(employeeId);
        return optionalEmployee.get();
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    } 

    @Override
    public Employee updateEmployee(Employee employee) {
        Employee existingeEmployee = employeeRepository.findById(employee.getId()).get();
        existingeEmployee.setName(employee.getName());
        existingeEmployee.setRole(employee.getRole());
        existingeEmployee.setEmail(employee.getEmail());
        Employee updatedEmployee = employeeRepository.save(existingeEmployee);
        return updatedEmployee;
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        employeeRepository.deleteById(employeeId);
    }

    @Override
    public List<Employee> getEmployeesByEmail(String email) {
        return employeeRepository.getEmployeesByEmail(email);
    }

}
