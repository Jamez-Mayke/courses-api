package com.jamesmayke.leapdev.api.modules.course.adapters.dtos;

public record CourseCreateRequestDTO(
    String name,
    String category,
    boolean active
) {
    
}
