package me.adeir.organizamoney.services;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import me.adeir.organizamoney.dto.user.UserAddDTO;
import me.adeir.organizamoney.dto.user.UserEditDTO;
import me.adeir.organizamoney.dto.user.UserGetDTO;
import me.adeir.organizamoney.entities.User;
import me.adeir.organizamoney.mapper.UserMapper;
import me.adeir.organizamoney.repositories.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void add(UserAddDTO userAddDTO) {
		userRepository.save(UserMapper.toUser(userAddDTO));
	}
	
	public UserGetDTO edit(long id, UserEditDTO userEditDTO) {
		var user = userRepository.save(UserMapper.toUser(id, userEditDTO, userRepository));

        return UserMapper.toUserGetDTO(user);
	}
	
	public UserGetDTO get(long id) {
		return userRepository.findById(id).map(user -> UserMapper.toUserGetDTO(user)).orElse(null);
	}

	public void delete(long id) {
		userRepository.deleteById(id);
	}

	public void changeStatus(long id, boolean status) {
		User user = userRepository.findById(id).orElseThrow();
		user.setActive(status);
		
		userRepository.save(user);
	}
}
