package me.adeir.organizamoney.dto.transaction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionEditDTO {
    private String name;
	private String username;
	private String email;
	private String profileImage;
}