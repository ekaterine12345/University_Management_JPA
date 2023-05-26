package com.example.university_jpa.controllers;


import com.example.university_jpa.dtos.ApiResponse;
import com.example.university_jpa.dtos.UniversityDto;
import com.example.university_jpa.entities.BaseEntity;
import com.example.university_jpa.services.IUniversityService;
import jdk.jfr.RecordingState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/university")
public class UniversityController {

    private final IUniversityService universityService;

    @Autowired
    public UniversityController(IUniversityService universityService) {
        this.universityService = universityService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public ApiResponse addUniversity(@RequestBody UniversityDto universityDto) {
        System.out.println(universityDto);
        return this.universityService.add(universityDto);
    }

    @GetMapping
    public ApiResponse getUniversities() {
        return this.universityService.getAll();
    }

}
