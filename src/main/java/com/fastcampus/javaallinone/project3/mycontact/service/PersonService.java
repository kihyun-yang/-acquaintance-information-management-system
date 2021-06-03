package com.fastcampus.javaallinone.project3.mycontact.service;

import com.fastcampus.javaallinone.project3.mycontact.domain.Person;
import com.fastcampus.javaallinone.project3.mycontact.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> getPeopleExcludeBlocks() {

        return personRepository.findByBlockIsNull();
    }

    public List<Person> getPeopleByName(String name) {

        return personRepository.findByName(name);
    }

    @Transactional(readOnly = true)
    public Person getPerson(Long id) {
        Person person = personRepository.findById(id).get();

        log.info("person : {}", person);

        return person;
    }
}
