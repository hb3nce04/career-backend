package io.hb3nce04.career.backend.mapper;

import org.mapstruct.Mapper;

import io.hb3nce04.career.backend.mapper.common.BaseMapper;
import io.hb3nce04.career.backend.model.dto.UserDto;
import io.hb3nce04.career.backend.model.entity.User;

@Mapper(config = BaseMapper.class)
public interface UserMapper extends BaseMapper<UserDto, User> {
}
