package me.adeir.organizamoney.dto.category;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryEditDTO {
    private String name;
	private String username;
	private String email;
	private String profileImage;
}