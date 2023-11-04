# README da aula

## Ex3.1

### The “UserController” class gets an instance of “userRepository” through its constructor; how is this new repository instantiated?

We create a new private implementation of the `UserRepository`. This allows to Springboot to do its instaciation:
```java
@Autowired
public UserController(UserRepository userRepository) {
    this.userRepository = userRepository;
}
```

### List the methods invoked in the “userRepository” object by the “UserController”. Where are these methods defined?

The methods are:
* userRepository.save(user); <\br>
* userRepository.findAll(); <\br>
* userRepository.findById(id): <\br>
* userRepository.delete(user); <\br>

They are in the `CrudRepository` imported by import `org.springframework.data.repository.CrudRepository`; 

### Where is the data being saved?

The data is stored in the `private UserRepository userRepository`;

## Where is the rule for the “not empty” email address defined?
#
In `User.java` file in:

```java
@NotBlank(message = "Email is mandatory")
private String email;
```

## Ex3.2

Image is anexed in this directory for exercise 3.2g)

### Ex3.2 h) 
```java
@Override
public List<Employee> getEmployeesByEmail(String email) {
    return employeeRepository.getEmployeesByEmail(email);
}
```
and
```java
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> getEmployeesByEmail(String email);
}
```
