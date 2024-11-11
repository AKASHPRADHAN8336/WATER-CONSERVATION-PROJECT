package com.example.UserService.mapper;

import com.example.UserService.dto.UserDto;
import com.example.UserService.entity.User;

public class UserMapper {

    
    public User mapToUser(UserDto userDto){
        User user = new User(
                userDto.getId(),
                userDto.getUsername(),
                userDto.getPassword(),
                userDto.getRole()
        );

        return user;
    }


    public UserDto mapToUserDto(User user){
        UserDto userDto = new UserDto(
                user.getId(),
                user.getUsername(),
                user.getPassword(),
                user.getRole()
        );

        return userDto;
    }
}
