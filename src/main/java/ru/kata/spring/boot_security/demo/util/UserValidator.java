//package ru.kata.spring.boot_security.demo.util;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.validation.Errors;
//import org.springframework.validation.Validator;
//import ru.kata.spring.boot_security.demo.model.User;
//import ru.kata.spring.boot_security.demo.repository.UserRepository;
//
//@Component
//public class UserValidator implements Validator {
//
//    private final UserRepository userRepository;
//
//    @Autowired
//    public UserValidator(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    public boolean supports(Class<?> clazz) {
//        return User.class.equals(clazz);
//    }
//
//    @Override
//    public void validate(Object target, Errors errors) {
//        User user = (User) target;
//        if (userRepository.findByUserName(user.getUsername()).isPresent()) {
//            errors.rejectValue("username", "user.username.exists",
//                    "Пользователь с таким логином уже существует");
//        }
//        System.out.println();
//    }
//}
