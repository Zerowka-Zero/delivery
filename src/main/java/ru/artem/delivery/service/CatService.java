package ru.artem.delivery.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.artem.delivery.model.Cat;
import ru.artem.delivery.repository.CatRepository;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CatService {

    private final CatRepository catRepository;

    public Cat getCat(Long id) {
        return catRepository.getReferenceById(id);
    }

    @Transactional
    public void createCat(Cat cat) {
        catRepository.save(cat);
    }


}
