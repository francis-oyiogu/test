package org.example.oop.services;

import org.example.oop.domain.Teacher;
import org.example.oop.services.IService.TeachingService;

public class TeachingServiceImpl implements TeachingService {
    @Override
    public Teacher teach(Teacher teacher) {
        return teacher;
    }
}
