package io.hb3nce04.career.backend.mapper;

import org.mapstruct.Mapper;

import io.hb3nce04.career.backend.mapper.common.BaseMapper;
import io.hb3nce04.career.backend.model.dto.StudentClassDto;
import io.hb3nce04.career.backend.model.entity.StudentClass;

@Mapper(config = BaseMapper.class)
public interface StudentClassMapper extends BaseMapper<StudentClassDto, StudentClass> {
}
