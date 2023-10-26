package deti.ua.pt.ex3_1;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity(name = "tbl_user")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @NotBlank(message = "Name is mandatory")
    private String name;
    
    @NotBlank(message = "Email is mandatory")
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(long id) {
    this.id = id;
    }

    public long getId() {
        return id;
    }


    // standard constructors / setters / getters / toString
}