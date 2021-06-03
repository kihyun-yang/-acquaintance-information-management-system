package com.fastcampus.javaallinone.project3.mycontact.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Block {

    @GeneratedValue
    @Id
    private Long id;

    @NonNull
    private String name;

    private String reason;

    private LocalDate startDate;

    private LocalDate endDate;

}
