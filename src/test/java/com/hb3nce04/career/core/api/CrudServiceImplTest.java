package com.hb3nce04.career.core.api;

import com.hb3nce04.career.core.exception.EntityNotFoundException;
import com.hb3nce04.career.data.TestData;
import com.hb3nce04.career.domain.test.TestEntity;
import com.hb3nce04.career.domain.test.TestService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CrudServiceImplTest {
    @Mock
    private CrudRepository<TestEntity, Integer> repository;

    @InjectMocks
    private TestService service;

    @Test
    public void shouldFindAll() {
        List<TestEntity> entities = List.of(TestData.TEST_ENTITY_1);

        when(repository.findAll()).thenReturn(entities);

        List<TestEntity> foundEntities = service.findAll();

        assertEquals(entities.size(), foundEntities.size());
        verify(repository, times(1)).findAll();
    }

    @Test
    public void shouldFindByIdSuccess() {
        TestEntity entity = TestData.TEST_ENTITY_1;
        Integer id = 1;

        when(repository.findById(id)).thenReturn(Optional.ofNullable(entity));

        TestEntity foundEntity = service.findById(id);

        assertEquals(entity, foundEntity);
        assert entity != null;
        assertEquals(entity.getId(), foundEntity.getId());
        verify(repository, times(1)).findById(id);
    }

    @Test
    public void shouldFindByIdFail() {
        Integer id = 1;

        when(repository.findById(id)).thenReturn(Optional.empty());

        assertThrows(EntityNotFoundException.class, () -> service.findById(id));
        verify(repository, times(1)).findById(id);
    }

    @Test
    public void shouldCreate() {
        TestEntity entity = TestData.TEST_ENTITY_1;

        when(repository.save(entity)).thenReturn(entity);

        TestEntity savedEntity = service.create(entity);

        assertEquals(entity, savedEntity);
        verify(repository, times(1)).save(entity);
    }

    // TODO: ignore ID (major issue) -> Mapping in service layer?
//    @Test
//    public void shouldUpdate() {
//        TestEntity entity = TestData.TEST_ENTITY_1;
//        TestEntity updatedEntity = TestData.TEST_ENTITY_2;
//        Integer id = 1;
//
//        when(repository.save(entity)).thenReturn(updatedEntity);
//
//        TestEntity savedEntity = service.update(id, updatedEntity);
//
//        assertEquals(entity.getId(), savedEntity.getId());
//        assertNotEquals(entity.getName(), savedEntity.getName());
//        assertEquals(entity.getNumber(), savedEntity.getNumber());
//        verify(repository, times(1)).save(entity);
//    }

    @Test
    public void shouldDelete() {
        Integer id = 1;

        service.delete(id);

        verify(repository, times(1)).deleteById(id);
    }
}
