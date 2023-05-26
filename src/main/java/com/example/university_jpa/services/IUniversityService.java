package com.example.university_jpa.services;

import com.example.university_jpa.dtos.ApiResponse;
import com.example.university_jpa.dtos.UniversityDto;

public interface IUniversityService {

    ApiResponse add(UniversityDto university);

    ApiResponse delete(Long id);

    ApiResponse deleteAll();

    ApiResponse getById(Long id);

    ApiResponse searchByName(String universityName);

    ApiResponse getAll();

    ApiResponse updateName(Long id, String newName);

    ApiResponse update(Long id, UniversityDto university);

}