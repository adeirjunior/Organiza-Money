package me.adeir.organizamoney.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.adeir.organizamoney.util.Auditable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Categories extends Auditable {
    @Column(nullable = false, unique = true)
    private String name;

    private String description;
}
