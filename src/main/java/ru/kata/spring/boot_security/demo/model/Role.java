//package ru.kata.spring.boot_security.demo.model;
//
//import org.springframework.security.core.GrantedAuthority;
//
//import javax.persistence.*;
//import java.util.HashSet;
//import java.util.Set;
//
//@Entity
//@Table(name = "role")
//public class Role implements GrantedAuthority {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private long id;
//
//    @Column(name = "role")
//    private String role;
//
//    @ManyToMany(mappedBy = "roles")
//    private Set<User> users = new HashSet<>();
//
//    public Role() {
//    }
//
//    public Role(String role) {
//        this.role = role;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getRole() {
//        return role;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }
//
//    @Override
//    public String getAuthority() {
//        return this.role;
//    }
//
//}
