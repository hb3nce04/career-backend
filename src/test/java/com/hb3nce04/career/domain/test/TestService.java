package com.hb3nce04.career.domain.test;

import com.hb3nce04.career.core.api.impl.CrudServiceImpl;
import org.modelmapper.ModelMapper;

public class TestService extends CrudServiceImpl<TestDto, TestEntity, Integer> {
    public TestService(TestRepository repository, ModelMapper mapper) {
        super(repository, mapper, TestDto.class, TestEntity.class);
    }
}