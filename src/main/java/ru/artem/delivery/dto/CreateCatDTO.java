package ru.artem.delivery.dto;

import lombok.Data;

@Data
public class CreateCatDTO {
    private String name;
    private String currentOwner;
}
