package com.hb3nce04.career.core.api;

import com.hb3nce04.career.core.exception.EntityNotFoundException;
import com.hb3nce04.career.data.TestData;
import com.hb3nce04.career.domain.test.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CrudServiceImplTest {
    @Mock
    private TestRepository repository;

    @Mock
    private TestMapper testMapper;

    @InjectMocks
    private TestService service;

    @Test
    public void shouldFindAll() {
        List<TestEntity> entities = List.of(TestData.TEST_ENTITY);
        List<TestDto> dtos = List.of(TestData.TEST_DTO);

        when(repository.findAll()).thenReturn(entities);
        when(testMapper.toDTO(entities.getFirst())).thenReturn(dtos.getFirst());

        List<TestDto> found = service.findAll();

        assertIterableEquals(dtos, found);
        verify(repository).findAll();
    }

    @Test
    public void shouldFindByIdSuccess() {
        TestEntity entity = TestData.TEST_ENTITY;
        TestDto dto = TestData.TEST_DTO;
        Integer id = 1;

        when(testMapper.toDTO(entity)).thenReturn(dto);
        when(repository.findById(id)).thenReturn(Optional.of(entity));

        TestDto found = service.findById(id);

        assertEquals(dto, found);
        verify(repository).findById(id);
    }

    @Test
    public void shouldFindByIdFail() {
        Integer id = 1;

        when(repository.findById(id)).thenReturn(Optional.empty());

        assertThrows(EntityNotFoundException.class, () -> service.findById(id));
        verify(repository).findById(id);
    }

    @Test
    public void shouldCreate() {
        TestEntity entity = TestData.TEST_ENTITY;
        TestDto dto = TestData.TEST_DTO;

        when(testMapper.toDTO(entity)).thenReturn(dto);
        when(testMapper.toEntity(dto)).thenReturn(entity);
        when(repository.save(entity)).thenReturn(entity);

        TestDto saved = service.create(dto);

        assertEquals(dto, saved);
        verify(repository).save(entity);
    }

    @Test
    public void shouldUpdateSuccess() {
        Integer id = 1;
        TestEntity entity = TestData.TEST_ENTITY;
        TestEntity updatedEntity = TestData.TEST_ENTITY;
        TestDto dto = TestData.TEST_DTO;

        when(repository.findById(id)).thenReturn(Optional.of(entity));
        when(testMapper.updateEntity(entity, dto)).thenReturn(updatedEntity);
        when(repository.save(updatedEntity)).thenReturn(updatedEntity);
        when(testMapper.toDTO(updatedEntity)).thenReturn(dto);

        TestDto saved = service.update(id, dto);

        assertNotNull(saved);
        assertEquals(dto, saved);
        verify(repository).save(entity);
        verify(testMapper).updateEntity(entity, dto);
    }

    @Test
    public void shouldUpdateFail() {
        TestDto dto = TestData.TEST_DTO;
        Integer id = 1;

        when(repository.findById(id)).thenReturn(Optional.empty());

        assertThrows(EntityNotFoundException.class, () -> service.update(id, dto));
        verify(repository, times(0)).save(any());
    }

    @Test
    public void shouldDelete() {
        Integer id = 1;

        service.delete(id);

        verify(repository).deleteById(id);
    }
}