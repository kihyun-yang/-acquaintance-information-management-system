package com.fastcampus.javaallinone.project3.mycontact.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Entity
public class Person {

    @GeneratedValue
    @Id
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private int age;

    private String hobby;

    @NonNull
    private String bloodType;

    private String address;

    private LocalDate birthday;

    private String job;

    @ToString.Exclude
    private String phoneNumber;

    @ToString.Exclude
    @OneToOne(cascade = { CascadeType.ALL }, orphanRemoval = true)
    private Block block;

}
