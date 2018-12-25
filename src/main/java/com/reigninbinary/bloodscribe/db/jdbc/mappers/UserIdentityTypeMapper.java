package com.reigninbinary.bloodscribe.db.jdbc.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.reigninbinary.bloodscribe.db.dto.UserIdentityType;
import com.reigninbinary.core.db.jdbc.mappers.ResultSetMapper;


public class UserIdentityTypeMapper implements ResultSetMapper<UserIdentityType> {

	@Override
	public UserIdentityType map(ResultSet rs) throws SQLException {
		
		UserIdentityType uit = new UserIdentityType();
		return uit;
	}
}
