package com.hb3nce04.career.domain.category;

import com.hb3nce04.career.core.api.impl.CrudServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class CategoryService extends CrudServiceImpl<CategoryDto, Category, Integer> {
    public CategoryService(CategoryRepository repository, ModelMapper mapper) {
        super(repository, mapper, CategoryDto.class, Category.class);
    }
}
