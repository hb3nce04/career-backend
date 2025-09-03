package io.hb3nce04.career.backend.mapper;

import org.mapstruct.Mapper;

import io.hb3nce04.career.backend.mapper.common.BaseMapper;
import io.hb3nce04.career.backend.model.dto.ProfessionDto;
import io.hb3nce04.career.backend.model.entity.Profession;

@Mapper(config = BaseMapper.class)
public interface ProfessionMapper extends BaseMapper<ProfessionDto, Profession> {
}
