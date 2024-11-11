package com.example.UserService.mapper;

import com.example.UserService.dto.UserDto;
import com.example.UserService.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface autoUserMapper {

    autoUserMapper MAPPER = Mappers.getMapper(autoUserMapper.class);

    User mapToUser(UserDto userDto);

    UserDto mapToUserDto(User user);

}
