package com.jamesmayke.leapdev.api.modules.course.adapters.controllers;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jamesmayke.leapdev.api.modules.course.adapters.dtos.CourseCreateRequestDTO;
import com.jamesmayke.leapdev.api.modules.course.domain.models.Course;

@RestController
@RequestMapping("/course")
public class CourseController {
    
    @PostMapping("/")
    public Course create(@RequestBody CourseCreateRequestDTO courseCreateRequestDTO) {
        return new Course.Builder()
            .withId(UUID.fromString("b947f7bb-06c5-420e-adaa-d8223cfaf4f8"))
            .withName(courseCreateRequestDTO.name())
            .withCategory(courseCreateRequestDTO.category())
            .withActive(courseCreateRequestDTO.active())
            .withCreatedAt(LocalDateTime.now())
            .withUpdatedAt(LocalDateTime.now())
            .build();
    }
}
