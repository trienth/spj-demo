package com.tbb.spj.entity;

import com.tbb.spj.config.CustomRevisionListener;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;

@Data
@Entity
@Table(name = "revision_info")
@RevisionEntity(CustomRevisionListener.class) // Thêm listener
public class CustomRevisionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @RevisionNumber
    private Long revId;

    @RevisionTimestamp
    private Long revTimestamp;

    private String username; // Thêm trường tùy chỉnh (người thay đổi)
}
