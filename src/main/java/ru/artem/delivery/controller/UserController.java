//package ru.artem.delivery.controller;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import ru.artem.delivery.dto.ViewUserDTO;
//import ru.artem.delivery.model.User;
//import ru.artem.delivery.service.UserService;
//
//@RestController
//@RequestMapping("/users") // глобальный путь
//@RequiredArgsConstructor // создает конструктор с final переменными
//public class UserController {
//
//    private final UserService userService; // DI бина
//
//    @GetMapping // путь к методу конкретному
//    public ViewUserDTO getUser() {
//        User user = userService.getUser();
//
//        ViewUserDTO response = new ViewUserDTO();
//        response.setName(user.getName());
//        response.setSurname(user.getSurname());
//        response.setEmail(user.getEmail());
//        response.setPhone(user.getPhone());
//
//        return response;
//    }
//}
