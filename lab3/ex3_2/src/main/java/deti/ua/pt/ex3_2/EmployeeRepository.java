package deti.ua.pt.ex3_2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> getEmployeesByEmail(String email);

}
