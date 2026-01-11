package ru.artem.delivery.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.artem.delivery.dto.CreateCatDTO;
import ru.artem.delivery.dto.UpdateCatDTO;
import ru.artem.delivery.dto.ViewCatDTO;
import ru.artem.delivery.model.Cat;
import ru.artem.delivery.service.CatService;

@Slf4j
@RestController // служебная аннотация для любого контролера
@RequestMapping("/cats") //
@RequiredArgsConstructor
public class CatController {

    private final CatService catService;

    @GetMapping // GET http://localhost:7771/cats?id=1
    public ViewCatDTO getCat(@RequestParam Long id) {
        Cat cat = catService.getCat(id);
        ViewCatDTO response = new ViewCatDTO();
        response.setName(cat.getName());
        response.setCurrentOwner(cat.getCurrentOwner());
        return response;
    }

    @PostMapping // POST http://localhost:7771/cats
    public void createCat(@RequestBody CreateCatDTO requestCat) {
        Cat cat = new Cat();
        cat.setName(requestCat.getName());
        cat.setCurrentOwner(requestCat.getCurrentOwner());
        catService.createCat(cat);
    }

    @PutMapping // PUT http://localhost:7771/cats
    public void updateCat(@RequestBody UpdateCatDTO requestCat) {
        Cat cat = new Cat();
        cat.setId(requestCat.getId());
        cat.setName(requestCat.getName());
        cat.setCurrentOwner(requestCat.getCurrentOwner());
        catService.updateCat(cat);
    }

    // Передать id в DTO
    @DeleteMapping // DELETE http://localhost:7771/cats?id=1
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCat(@RequestParam Long id) {
        catService.deleteCat(id);
    }

    // сделать patch который только поля name будет обновлять
}
