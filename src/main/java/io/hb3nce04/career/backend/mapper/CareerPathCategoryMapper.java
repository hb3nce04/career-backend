package io.hb3nce04.career.backend.mapper;

import org.mapstruct.Mapper;

import io.hb3nce04.career.backend.mapper.common.BaseMapper;
import io.hb3nce04.career.backend.model.dto.CareerPathCategoryDto;
import io.hb3nce04.career.backend.model.entity.CareerPathCategory;

@Mapper(config = BaseMapper.class)
public interface CareerPathCategoryMapper extends BaseMapper<CareerPathCategoryDto, CareerPathCategory> {
}
