package com.xworkz.person.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PersonMapper implements RowMapper<PersonEntity>{

	@Override
	public PersonEntity mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		PersonEntity person = new PersonEntity();
		person.setId(resultSet.getLong("Id"));
		person.setAge(resultSet.getInt("Age"));
		person.setFirstName(resultSet.getString("First_name"));
		person.setLastName(resultSet.getString("Last_name"));
		return person;
	}
	
}
