package com.example.university_jpa.entities;

import com.example.university_jpa.dtos.UniversityDto;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "UNIVERSITIES")
public class University extends BaseEntity<Long> {

    @Id
    @Column(name = "ID")
    @SequenceGenerator(name = "universityIdSeq", sequenceName = "UNIVERSITY_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "universityIdSeq")
    private Long id;

    @Column(name = "NAME", nullable = false, updatable = true, insertable = true)
    private String name;

    @Column(name = "ADDRESS")
    private String address;

//    @Enumerated(EnumType.STRING)
//    @Column(name = "RECORD_STATE")
//    private RecordState recordState;

    public University(UniversityDto universityDto) {
        this.name = universityDto.getName();
        this.address = universityDto.getAddress();
        this.recordState = universityDto.getRecordState();
    }

}