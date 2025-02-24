package com.hb3nce04.career.domain.school;

import com.hb3nce04.career.core.api.Mapper;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class SchoolMapper implements Mapper<SchoolDto, School> {
    private ModelMapper modelMapper;

    @Override
    public School toEntity(SchoolDto dto) {
        return modelMapper.map(dto, School.class);
    }

    @Override
    public SchoolDto toDTO(School entity) {
        return modelMapper.map(entity, SchoolDto.class);
    }

    public School updateEntity(School entity, SchoolDto dto) { return modelMapper.map(dto, School.class); }
}
