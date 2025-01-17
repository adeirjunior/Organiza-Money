package me.adeir.organizamoney.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Transactions extends Auditable {
    @Column(nullable = false)
    private String type; // "income" ou "expense"

    @Column(nullable = false)
    private Double amount;

    @Column(nullable = false)
    private boolean paid; // Se foi pago ou não

    @Column(nullable = false)
    private LocalDate date; // Data da transação

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Accounts account;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Categories category;

    private String description;
}
