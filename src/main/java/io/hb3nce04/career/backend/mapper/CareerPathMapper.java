package io.hb3nce04.career.backend.mapper;

import org.mapstruct.Mapper;

import io.hb3nce04.career.backend.mapper.common.BaseMapper;
import io.hb3nce04.career.backend.model.dto.CareerPathDto;
import io.hb3nce04.career.backend.model.entity.CareerPath;

@Mapper(config = BaseMapper.class)
public interface CareerPathMapper extends BaseMapper<CareerPathDto, CareerPath> {
}
