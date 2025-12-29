package ru.artem.delivery.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.artem.delivery.model.Cat;

@Repository
public interface CatRepository extends JpaRepository<Cat, Long> {
}
