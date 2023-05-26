package com.example.university_jpa.repositories;

import com.example.university_jpa.entities.University;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface UniversityRepository extends JpaRepository<University, Long> {
    List<University> getByAddressAndName(String address, String name);
    List<University> findByIdAndCreatedAt(Long id , Date createdAt);
    Optional<University> findById(Long id);
}
