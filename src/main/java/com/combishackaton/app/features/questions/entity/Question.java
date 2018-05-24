package com.combishackaton.app.features.questions.entity;

import com.combishackaton.app.common.model.BaseEntity;
import com.combishackaton.app.common.model.TimeEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "questions")
@Data
public class Question extends TimeEntity {

    @Column(name = "description")
    private String description;

}
