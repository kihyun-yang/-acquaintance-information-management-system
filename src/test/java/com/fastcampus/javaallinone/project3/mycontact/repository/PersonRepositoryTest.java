package com.fastcampus.javaallinone.project3.mycontact.repository;

import com.fastcampus.javaallinone.project3.mycontact.domain.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class PersonRepositoryTest {

    @Autowired
    private PersonRepository personRepository;

    @Test
    void crud() {
        Person person = new Person();
        person.setName("martin");
        person.setAge(10);
        person.setBloodType("A");

        personRepository.save(person);

        System.out.println(personRepository.findAll());
        List<Person> peoples = personRepository.findAll();

        assertThat(peoples.size()).isEqualTo(1);
        assertThat(peoples.get(0).getName()).isEqualTo("martin");
        assertThat(peoples.get(0).getAge()).isEqualTo(10);
        assertThat(peoples.get(0).getBloodType()).isEqualTo("A");
    }

    @Test
    void hashCodeAndEquals() {
        Person person1 = new Person("martin", 10);
        Person person2 = new Person("martin", 10);

        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }

}