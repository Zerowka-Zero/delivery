package ru.artem.delivery.dto.cat;

import lombok.Data;

@Data
public class CreateCatDTO {
    private String name;
    private String currentOwner;
}