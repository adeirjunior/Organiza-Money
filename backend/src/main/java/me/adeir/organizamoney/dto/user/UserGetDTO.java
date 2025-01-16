package me.adeir.organizamoney.dto.user;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserGetDTO {
    private Long id;
    private String name;
	private String username;
	private String email;
	private String password;
	private String profileImage;
    private boolean active;
}
