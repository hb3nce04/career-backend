package com.hb3nce04.career.domain.test;

import com.hb3nce04.career.core.api.impl.CrudServiceImpl;

public class TestService extends CrudServiceImpl<TestDto, TestEntity, TestMapper, Integer> {
    public TestService(TestRepository repository, TestMapper mapper) {
        super(repository, mapper);
    }
}