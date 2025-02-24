package com.hb3nce04.career.domain.test;

import com.hb3nce04.career.core.api.Mapper;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class TestMapper implements Mapper<TestDto, TestEntity> {
    private ModelMapper modelMapper;

    public TestEntity toEntity(TestDto dto) {
        return modelMapper.map(dto, TestEntity.class);
    }

    public TestDto toDTO(TestEntity entity) {
        return modelMapper.map(entity, TestDto.class);
    }

    public TestEntity updateEntity(TestEntity entity, TestDto dto) {
        return modelMapper.map(dto, TestEntity.class);
    }
}