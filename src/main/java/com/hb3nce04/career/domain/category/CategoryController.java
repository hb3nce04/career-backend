package com.hb3nce04.career.domain.category;

import com.hb3nce04.career.core.api.CrudService;
import com.hb3nce04.career.core.api.impl.CrudControllerImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("categories")
public class CategoryController extends CrudControllerImpl<CategoryDto, Category, CategoryMapper, Integer> {
    public CategoryController(CrudService<Category, Integer> service, CategoryMapper mapper) {
        super(service, mapper);
    }
}
