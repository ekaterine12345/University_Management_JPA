package com.example.university_jpa.services.impl;

import com.example.university_jpa.dtos.ApiResponse;
import com.example.university_jpa.dtos.UniversityDto;
import com.example.university_jpa.entities.University;
import com.example.university_jpa.repositories.UniversityRepository;
import com.example.university_jpa.services.IUniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniversityServiceImpl implements IUniversityService {
    private final UniversityRepository universityRepository;

    @Autowired
    public UniversityServiceImpl(UniversityRepository universityRepository){
        this.universityRepository = universityRepository;
    }

    @Override
    public ApiResponse add(UniversityDto universityDto) {
        if (universityDto == null) {
            return new ApiResponse().addError("universityDto", "object is null");
        }
        University university = new University(universityDto);
        System.out.println("IMPL = "+universityDto);
        University insertedUniversity = this.universityRepository.save(university);
        return new ApiResponse("university", insertedUniversity);
    }

    @Override
    public ApiResponse delete(Long id) {
//        University university = universitiesUtils.deleteById(id);
//        if (university == null) {
//            return new ApiResponse().addError("id", "invalid id");
//        }
        return new ApiResponse("university", null);
    }

    @Override
    public ApiResponse deleteAll() {
        return null;
    }

    @Override
    public ApiResponse getById(Long id) {
        return null;
    }

    @Override
    public ApiResponse searchByName(String universityName) {
        return null;
    }

    @Override
    public ApiResponse getAll() {
        return new ApiResponse("universities", this.universityRepository.findAll());
    }

    @Override
    public ApiResponse updateName(Long id, String newName) {
        return null;
    }

    @Override
    public ApiResponse update(Long id, UniversityDto university) {
        return null;
    }

}