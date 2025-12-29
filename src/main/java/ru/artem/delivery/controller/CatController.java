package ru.artem.delivery.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ru.artem.delivery.dto.CreateCatDTO;
import ru.artem.delivery.dto.ViewCatDTO;
import ru.artem.delivery.model.Cat;
import ru.artem.delivery.service.CatService;

@Slf4j
@RestController // служебная аннотация для любого контролера
@RequestMapping("/cats") //
@RequiredArgsConstructor
public class CatController {

    private final CatService catService;

    @GetMapping // GET http://localhost:7771/cats?id=10
    public ViewCatDTO getCat(@RequestParam Long id) {
        Cat cat = catService.getCat(id);
        ViewCatDTO response = new ViewCatDTO();
        response.setName(cat.getName());
        response.setCurrentOwner(cat.getCurrentOwner());
        return response;
    }

    @PostMapping // POST http://localhost:7771/cats
    public void postVoid(@RequestBody CreateCatDTO requestCat) {
        Cat cat = new Cat();
        cat.setName(requestCat.getName());
        cat.setCurrentOwner(requestCat.getCurrentOwner());
        catService.createCat(cat);
    }
}
