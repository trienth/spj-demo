package com.tbb.spj.config;

import com.tbb.spj.entity.CustomRevisionEntity;
import org.hibernate.envers.RevisionListener;
import org.springframework.security.core.context.SecurityContextHolder;

public class CustomRevisionListener implements RevisionListener {
    @Override
    public void newRevision(Object revisionEntity) {
        CustomRevisionEntity customRevisionEntity = (CustomRevisionEntity) revisionEntity;
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        customRevisionEntity.setUsername(username);
    }
}
