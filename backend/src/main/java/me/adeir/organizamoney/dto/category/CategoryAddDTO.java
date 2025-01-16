package me.adeir.organizamoney.dto.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryAddDTO {
    private String name;
	private String username;
	private String email;
	private String password;
	private String profileImage;
}
