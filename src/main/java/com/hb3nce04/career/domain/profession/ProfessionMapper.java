package com.hb3nce04.career.domain.profession;

import com.hb3nce04.career.core.api.Mapper;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class ProfessionMapper implements Mapper<ProfessionDto, Profession> {

    private ModelMapper modelMapper;

    public Profession toEntity(ProfessionDto dto) {
        return modelMapper.map(dto, Profession.class);
    }

    public ProfessionDto toDTO(Profession entity) {
        return modelMapper.map(entity, ProfessionDto.class);
    }
}