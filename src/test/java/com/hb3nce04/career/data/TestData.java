package com.hb3nce04.career.data;

import com.hb3nce04.career.domain.test.TestDto;
import com.hb3nce04.career.domain.test.TestEntity;

public class TestData {
    public static final TestEntity TEST_ENTITY = TestEntity
            .builder()
            .id(1)
            .name("Test 1")
            .number(1)
            .build();

    public static final TestDto TEST_DTO = TestDto
            .builder()
            .id(1)
            .name("Test 1")
            .number(1)
            .build();
}