package com.hb3nce04.career.data;

import com.hb3nce04.career.domain.test.TestEntity;

public class TestData {
    public static final TestEntity TEST_ENTITY_1 = TestEntity
            .builder()
            .id(1)
            .name("Test 1")
            .number(1)
            .build();
}
