package io.hb3nce04.career.backend.mapper;

import org.mapstruct.Mapper;

import io.hb3nce04.career.backend.mapper.common.BaseMapper;
import io.hb3nce04.career.backend.model.dto.SchoolDto;
import io.hb3nce04.career.backend.model.entity.School;

@Mapper(config = BaseMapper.class)
public interface SchoolMapper extends BaseMapper<SchoolDto, School> {
}
