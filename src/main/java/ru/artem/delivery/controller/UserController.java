package ru.artem.delivery.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users") // глобальный путь
@RequiredArgsConstructor // создает конструктор с final переменными
public class UserController {

}
