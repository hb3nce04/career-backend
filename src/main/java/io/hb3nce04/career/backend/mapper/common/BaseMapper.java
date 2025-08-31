package io.hb3nce04.career.backend.mapper.common;

import java.util.List;

import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import io.hb3nce04.career.backend.model.entity.common.BaseEntity;

@MapperConfig(
        componentModel = "spring",
        unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE
)
public interface BaseMapper<D, E extends BaseEntity> {
    D toDto(E entity);

    @Mapping(target = "id", ignore = true)
    E toEntity(D dto);

    List<D> toDtoList(List<E> entityList);

    @Mapping(target = "id", ignore = true)
    void updateEntity(
            D dto,
            @MappingTarget E entity);
}
