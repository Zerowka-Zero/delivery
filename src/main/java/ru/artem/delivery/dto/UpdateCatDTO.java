package ru.artem.delivery.dto;

import lombok.Data;

@Data
public class UpdateCatDTO {
    private Long id;
    private String name;
    private String currentOwner;
}

