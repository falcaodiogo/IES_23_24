package deti.ua.pt.ex3_2;

import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/employees")
public class EmployeeControler {

    private EmployeeService employeeService;

    // build create Emplyee REST API
    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        Employee savedEmployee = employeeService.createEmployee(employee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    // build get employee by id REST API
    // http://localhost:8080/api/employees/1
    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long employeeId){
        Employee employee = employeeService.getEmployeeById(employeeId);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    // Build Get All employees REST API
    // http://localhost:8080/api/employees
    // @GetMapping
    // public ResponseEntity<List<Employee>> getAllEmployees(){
    //     List<Employee> employees = employeeService.getAllEmployees();
    //     return new ResponseEntity<>(employees, HttpStatus.OK);
    // // }@GetMapping
    // public ResponseEntity<List<Employee>> getAllEmployees(){
    //     List<Employee> employees = employeeService.getAllEmployees();
    //     return new ResponseEntity<>(employees, HttpStatus.OK);
    // // }

    // Build Update Employee REST API
    @PutMapping("{id}")
    // http://localhost:8080/api/employees/1
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Long employeeId,
                                           @RequestBody Employee employee){
        employee.setId(employeeId);
        Employee updatedEmployee = employeeService.updateEmployee(employee);
        return new ResponseEntity<>(updatedEmployee, HttpStatus.OK);
    }

    // Build Delete Employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long employeeId){
        employeeService.deleteEmployee(employeeId);
        return new ResponseEntity<>("Employee successfully deleted!", HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees(@RequestParam(value = "email", required = false) String email) {
        List<Employee> employees;
        if (email != null) {
            // Filter employees by email
            employees = employeeService.getEmployeesByEmail(email);
        } else {
            // Get all employees
            employees = employeeService.getAllEmployees();
        }
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

}
