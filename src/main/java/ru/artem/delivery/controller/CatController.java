package ru.artem.delivery.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.artem.delivery.dto.cat.CreateCatDTO;
import ru.artem.delivery.dto.cat.UpdateCatDTO;
import ru.artem.delivery.dto.cat.ViewCatDTO;
import ru.artem.delivery.model.Cat;
import ru.artem.delivery.repository.CatRepository;
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
        return ViewCatDTO.builder()
                .name(cat.getName())
                .currentOwner(cat.getCurrentOwner())
                .build();
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

    @DeleteMapping // DELETE http://localhost:7771/cats?id=1
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCat(@RequestParam Long id) {
        catService.deleteCat(id);
    }

    // сделать patch который только поля name будет обновлять
}
