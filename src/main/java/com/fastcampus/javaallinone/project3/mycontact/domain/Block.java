package com.fastcampus.javaallinone.project3.mycontact.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Entity
public class Block {

    @GeneratedValue
    @Id
    private Long id;

    private String name;

    private String reason;

    private LocalDate startDate;

    private LocalDate endDate;

}
