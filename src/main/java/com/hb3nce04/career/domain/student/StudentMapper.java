package com.hb3nce04.career.domain.student;

import com.hb3nce04.career.core.api.Mapper;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class StudentMapper implements Mapper<StudentDto, Student> {

    private ModelMapper modelMapper;

    public Student toEntity(StudentDto dto) {
        return modelMapper.map(dto, Student.class);
    }

    public StudentDto toDTO(Student entity) {
        return modelMapper.map(entity, StudentDto.class);
    }
}