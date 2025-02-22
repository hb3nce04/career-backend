package com.hb3nce04.career.domain.test;

import com.hb3nce04.career.core.api.impl.CrudServiceImpl;
import org.springframework.data.repository.CrudRepository;

public class TestService extends CrudServiceImpl<TestEntity, Integer> {
    public TestService(CrudRepository<TestEntity, Integer> repository) {
        super(repository);
    }
}