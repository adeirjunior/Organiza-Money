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
public class Users extends Auditable {
    @Column(nullable = false)
    private String name;

    private String username;
    private String email;
    private String password;

    private String profileImage;

    private boolean active;
}
