package com.hb3nce04.career.domain._class;

import com.hb3nce04.career.core.api.Mapper;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class ClassMapper implements Mapper<ClassDto, Class> {
    private ModelMapper modelMapper;

    public Class toEntity(ClassDto dto) {
        return modelMapper.map(dto, Class.class);
    }

    public ClassDto toDTO(Class entity) { return modelMapper.map(entity, ClassDto.class); }

    public Class updateEntity(Class entity, ClassDto dto) { return modelMapper.map(dto, Class.class); }
}