package ru.artem.delivery.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cat") // имя таблицы
public class Cat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false) // по какому полю будет искать в бд и ограничения
    private String name;

    @Column(name = "current_owner")
    private String currentOwner;
}