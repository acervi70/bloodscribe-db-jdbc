package com.reigninbinary.bloodscribe.db.jdbc.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.reigninbinary.bloodscribe.db.dto.User;
import com.reigninbinary.bloodscribe.db.tables.UserTable;
import com.reigninbinary.core.jdbc.mappers.ResultSetMapper;


public class UserDataMapper implements ResultSetMapper<User> {
	
	@Override
	public User map(ResultSet rs) throws SQLException {
		
		User user = new User();
		user.setUserId(rs.getInt(UserTable.Columns.USER_ID.label()));
		user.setIdentityId(rs.getString(UserTable.Columns.IDENTITY_ID.label()));
		user.setIdentityTypeId(rs.getInt(UserTable.Columns.IDENTITY_TYPE_ID.label()));
		user.setEmailAddress(rs.getString(UserTable.Columns.EMAIL_ADDRESS.label()));
		user.setCreatedDt(rs.getDate(UserTable.Columns.CREATED_DT.label()));
		user.setUpdatedDt(rs.getDate(UserTable.Columns.UPDATED_DT.label()));
		return user;
	}
}
