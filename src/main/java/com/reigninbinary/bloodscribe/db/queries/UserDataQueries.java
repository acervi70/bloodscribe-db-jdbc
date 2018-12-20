package com.reigninbinary.bloodscribe.db.queries;

import java.util.ArrayList;
import java.util.List;

import com.reigninbinary.core.jdbc.CoreJdbcException;
import com.reigninbinary.core.jdbc.params.IntegerParam;
import com.reigninbinary.core.jdbc.params.PreparedStatementParam;
import com.reigninbinary.core.jdbc.queries.CoreJdbcQuery;

import com.reigninbinary.bloodscribe.db.dto.User;
import com.reigninbinary.bloodscribe.db.jdbc.mappers.UserDataMapper;


public class UserDataQueries {

	public static List<User> findAll() throws CoreJdbcException {
		
		final String QUERY = "select * from users";
		
		return CoreJdbcQuery.executeQuery(QUERY, new UserDataMapper());
	}
	
	public static User findByUserId(int idUser) throws CoreJdbcException {
		
		final String QUERY = "select * from users where user_id = ?";
		
		List<PreparedStatementParam> params = new ArrayList<>();
		params.add(new IntegerParam(1, Integer.valueOf(idUser)));
		
		List<User> users = CoreJdbcQuery
				.executeQuery(QUERY, params, new UserDataMapper());
		
		if (users.size() > 0) {
			return users.get(0);
		}
		return null;
	}
}
