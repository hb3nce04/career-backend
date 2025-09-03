package io.hb3nce04.career.backend.mapper;

import org.mapstruct.Mapper;

import io.hb3nce04.career.backend.mapper.common.BaseMapper;
import io.hb3nce04.career.backend.model.dto.StudentDto;
import io.hb3nce04.career.backend.model.entity.Student;

@Mapper(config = BaseMapper.class)
public interface StudentMapper extends BaseMapper<StudentDto, Student> {
}
