package com.example.university_jpa.dtos;

import com.example.university_jpa.entities.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class UniversityDto {
    private String name;
    private String address;
    private BaseEntity.RecordState recordState;
}