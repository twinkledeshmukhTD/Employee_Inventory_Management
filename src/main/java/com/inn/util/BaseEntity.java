package com.inn.util;

import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@Setter
public class BaseEntity {

    @Basic
    @Column(name = "modificationtime", insertable = true, updatable = true)
    private Date modifiedTime;

    @Basic
    @Column(name = "creationtime", insertable = true, updatable = false)
    private Date createdTime;

    public long getModifiedTime() {
        if (modifiedTime != null) {
            return modifiedTime.getTime();
        }
        return 0;
    }

    public long getCreatedTime() {
        if (createdTime != null) {
            return createdTime.getTime();
        }
        return 0;
    }

    @PrePersist
    void onCreate() {
        Date date = new Date();
        this.setCreatedTime(date);
        this.setModifiedTime(date);

    }

    @PreUpdate
    void onUpdate() {
        Date date = new Date();
        this.setModifiedTime(date);
    }
}
