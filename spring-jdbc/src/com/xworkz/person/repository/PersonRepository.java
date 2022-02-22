package com.xworkz.person.repository;

import java.util.List;

import com.xworkz.person.entity.PersonEntity;

public interface PersonRepository {
PersonEntity getPersonById(long id);
List<PersonEntity> getAllPerson();

boolean deletePerson(PersonEntity person);
boolean updatePerson(PersonEntity person);
boolean createPerson(PersonEntity person);
}
