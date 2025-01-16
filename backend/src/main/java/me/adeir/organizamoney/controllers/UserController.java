package me.adeir.organizamoney.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import me.adeir.organizamoney.dto.user.UserAddDTO;
import me.adeir.organizamoney.dto.user.UserEditDTO;
import me.adeir.organizamoney.dto.user.UserGetDTO;
import me.adeir.organizamoney.services.UserService;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/")
	public void createUser(@RequestBody UserAddDTO userAddDTO) {
        userService.add(userAddDTO);
    }

    @GetMapping("/{id}")
    public UserGetDTO getUser(@PathVariable String id) {
        return userService.get(Long.parseLong(id));
    }

    @PutMapping("/{id}")
    public UserGetDTO editUser(@PathVariable String id, @RequestBody UserEditDTO entity) {
        return userService.edit(Long.parseLong(id), entity);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
        //TODO: process DELETE request
        
    }
}
