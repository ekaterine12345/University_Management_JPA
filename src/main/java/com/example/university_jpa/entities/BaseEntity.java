package com.example.university_jpa.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.util.Date;
import java.util.Random;

@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode
@MappedSuperclass
@ToString
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity<ID extends Serializable> {

    @CreatedDate
    @Column(name = "CREATED_AT", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    protected Date createdAt;

    @LastModifiedDate
    @Column(name = "UPDATED_AT")
    @Temporal(TemporalType.TIMESTAMP)
    protected Date updatedAt;

    public enum RecordState{
        DRAFT, INACTIVE, ACTIVE, DELETE
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "RECORD_STATE")
    protected RecordState recordState;

    @Enumerated(EnumType.ORDINAL)
    @Column(name="RECORD_STATE_2")
    protected RecordState recordState_2;

    @PrePersist
    private void assignRandomRecordState() {
        RecordState[] possibleValues = {RecordState.DRAFT, RecordState.INACTIVE, RecordState.ACTIVE, RecordState.DELETE};
        int randomIndex = new Random().nextInt(possibleValues.length);
        this.recordState_2 = possibleValues[randomIndex];
    }
}
