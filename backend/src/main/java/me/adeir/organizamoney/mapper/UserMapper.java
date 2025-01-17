package me.adeir.organizamoney.mapper;

import me.adeir.organizamoney.dto.user.UserAddDTO;
import me.adeir.organizamoney.dto.user.UserEditDTO;
import me.adeir.organizamoney.dto.user.UserGetDTO;
import me.adeir.organizamoney.entities.Users;
import me.adeir.organizamoney.repositories.UserRepository;

public class UserMapper {
    public static Users toUser(UserAddDTO userAddDTO) {
        Users usuario = new Users();
        usuario.setName(userAddDTO.getName());
        usuario.setUsername(userAddDTO.getUsername());
        usuario.setEmail(userAddDTO.getEmail());
        usuario.setPassword(userAddDTO.getPassword());
        usuario.setProfileImage(userAddDTO.getProfileImage());

        return usuario;
    }

    public static Users toUser(Long id, UserEditDTO userEditDTO, UserRepository userRepository) {
        Users usuario = userRepository.findById(id).orElseThrow();
        usuario.setName(userEditDTO.getName());
        usuario.setUsername(userEditDTO.getUsername());
        usuario.setEmail(userEditDTO.getEmail());
        usuario.setProfileImage(userEditDTO.getProfileImage());

        return usuario;
    }

    public static UserGetDTO toUserGetDTO(Users user) {
        UserGetDTO userGetDTO = new UserGetDTO();
        userGetDTO.setName(user.getName());
        userGetDTO.setUsername(user.getPassword());
        userGetDTO.setEmail(user.getEmail());
        userGetDTO.setProfileImage(user.getProfileImage());
        userGetDTO.setActive(user.isActive());

        return userGetDTO;
    }
}
