package com.hb3nce04.career.domain.category;

import com.hb3nce04.career.core.api.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CategoryService extends CrudServiceImpl<CategoryDto, Category, CategoryMapper, Integer> {
    public CategoryService(CategoryRepository repository, CategoryMapper mapper) {
        super(repository, mapper);
    }
}
