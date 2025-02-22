package com.hb3nce04.career.domain.category;

import com.hb3nce04.career.core.api.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CategoryService extends CrudServiceImpl<Category, Integer> {
    public CategoryService(CategoryRepository repository) {
        super(repository);
    }
}
