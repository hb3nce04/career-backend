package com.hb3nce04.career.domain.sector;

import com.hb3nce04.career.core.api.Mapper;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class SectorMapper implements Mapper<SectorDto, Sector> {

    private ModelMapper modelMapper;

    public Sector toEntity(SectorDto dto) {
        return modelMapper.map(dto, Sector.class);
    }

    public SectorDto toDTO(Sector entity) {
        return modelMapper.map(entity, SectorDto.class);
    }
}
