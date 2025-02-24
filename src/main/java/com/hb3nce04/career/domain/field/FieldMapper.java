package com.hb3nce04.career.domain.field;

import com.hb3nce04.career.core.api.Mapper;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class FieldMapper implements Mapper<FieldDto, Field> {
    private ModelMapper modelMapper;

    public Field toEntity(FieldDto dto) {
        return modelMapper.map(dto, Field.class);
    }

    public FieldDto toDTO(Field entity) {
        return modelMapper.map(entity, FieldDto.class);
    }

    public Field updateEntity(Field entity, FieldDto dto) { return modelMapper.map(dto, Field.class); }
}