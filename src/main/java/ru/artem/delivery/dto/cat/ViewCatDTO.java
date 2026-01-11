package ru.artem.delivery.dto.cat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ViewCatDTO {
    private String name;
    private String currentOwner;
}
