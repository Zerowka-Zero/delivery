package ru.artem.delivery.dto.cat;

import lombok.Data;

@Data
public class UpdateCatDTO {
    private Long id;
    private String name;
    private String currentOwner;
}

