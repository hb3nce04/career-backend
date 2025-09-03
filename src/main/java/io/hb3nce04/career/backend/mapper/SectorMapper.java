package io.hb3nce04.career.backend.mapper;

import org.mapstruct.Mapper;

import io.hb3nce04.career.backend.mapper.common.BaseMapper;
import io.hb3nce04.career.backend.model.dto.SectorDto;
import io.hb3nce04.career.backend.model.entity.Sector;

@Mapper(config = BaseMapper.class)
public interface SectorMapper extends BaseMapper<SectorDto, Sector> {
}
