package com.hb3nce04.career.domain.category;

import com.hb3nce04.career.core.api.Mapper;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class CategoryMapper implements Mapper<CategoryDto, Category> {
    private ModelMapper modelMapper;

    public Category toEntity(CategoryDto dto) {
        return modelMapper.map(dto, Category.class);
    }

    public CategoryDto toDTO(Category entity) {
        return modelMapper.map(entity, CategoryDto.class);
    }
}
