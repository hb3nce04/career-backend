package com.hb3nce04.career.domain.user;

import com.hb3nce04.career.core.api.Mapper;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class UserMapper implements Mapper <UserDto, User>{
    private ModelMapper modelMapper;

    public User toEntity(UserDto dto) { return modelMapper.map(dto, User.class); }

    public UserDto toDTO(User entity) { return modelMapper.map(entity, UserDto.class); }

    public User updateEntity(User entity, UserDto dto) { return modelMapper.map(dto, User.class); }
}
