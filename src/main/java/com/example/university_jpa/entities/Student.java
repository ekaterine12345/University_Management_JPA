package com.example.university_jpa.entities;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "STUDENTS")
public class Student extends BaseEntity<Long>{

    @Id
    @Column(name = "ID")
    @SequenceGenerator(name = "studentIdSeq", sequenceName = "STUDENT_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "studentIdSeq")
    private Long id;

    @Column(name = "NAME", nullable = false, updatable = true, insertable = true)
    private String name;

    @ManyToOne
    private University university;
}
