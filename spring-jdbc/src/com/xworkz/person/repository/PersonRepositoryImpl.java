package com.xworkz.person.repository;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.xworkz.person.entity.PersonEntity;
import com.xworkz.person.entity.PersonMapper;

@Component
public class PersonRepositoryImpl implements  PersonRepository{
	
	JdbcTemplate jdbcTemplate;
	
	private final String SQL_FIND_PERSON = "select * from person_info where id = ?";
	private final String SQL_DELETE_PERSON = "delete from person_info where id = ?";
	private final String SQL_UPDATE_PERSON = "update person_info set first_name = ?, last_name = ?, age  = ? where id = ?";
	private final String SQL_GET_ALL = "select * from person_info";
	private final String SQL_INSERT_PERSON = "insert into person_info(id, first_name, last_name, age) values(?,?,?,?)";
	
	public PersonRepositoryImpl(JdbcTemplate jdbcTemplate) {
		
		this.jdbcTemplate = jdbcTemplate;
	}	
	@Override
	public PersonEntity getPersonById(long id) {
		return jdbcTemplate.queryForObject(SQL_FIND_PERSON, new Object[] { id }, new PersonMapper());
	}	
	@Override
	public List<PersonEntity> getAllPerson() {
		return jdbcTemplate.query(SQL_GET_ALL, new PersonMapper());
	}
	@Override
	public boolean deletePerson(PersonEntity person) {
		return jdbcTemplate.update(SQL_DELETE_PERSON, person.getId()) > 0;
	}
	@Override
	public boolean updatePerson(PersonEntity person) {
		return jdbcTemplate.update(SQL_UPDATE_PERSON, person.getFirstName(), person.getLastName(), person.getAge(),
				person.getId()) > 0;
	}
	@Override
	public boolean createPerson(PersonEntity person) {
		return jdbcTemplate.update(SQL_INSERT_PERSON, person.getId(), person.getFirstName(), person.getLastName(),
				person.getAge()) > 0;
	}

}
