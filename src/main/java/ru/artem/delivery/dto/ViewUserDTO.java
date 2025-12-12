package ru.artem.delivery.dto;

import lombok.Data;

@Data
public class ViewUserDTO {
    private String name;
    private String surname;
    private String email;
    private String phone;
}
