package io.hb3nce04.career.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.hb3nce04.career.backend.mapper.CareerPathMapper;
import io.hb3nce04.career.backend.model.dto.CareerPathDto;
import io.hb3nce04.career.backend.model.entity.CareerPath;
import io.hb3nce04.career.backend.repository.CareerPathRepository;
import io.hb3nce04.career.backend.service.common.AbstractBaseService;

@Service
public class CareerPathService extends AbstractBaseService<CareerPathDto, CareerPath, CareerPathMapper, CareerPathRepository> {
    public CareerPathService(
            CareerPathMapper mapper,
            CareerPathRepository repository) {
        super(mapper, repository);
    }

    public List<CareerPathDto> findAllByStudentId(Integer studentId) {
        return this.mapper.toDtoList(repository.findAllByStudentId(studentId));
    }
}
