package com.reigninbinary.bloodscribe.db.jdbc.queries;

import java.util.ArrayList;
import java.util.List;

import com.reigninbinary.core.db.CoreDatabaseException;
import com.reigninbinary.core.db.jdbc.params.IntegerParam;
import com.reigninbinary.core.db.jdbc.params.PreparedStatementParam;
import com.reigninbinary.core.db.jdbc.queries.CoreJdbcQuery;
import com.reigninbinary.bloodscribe.db.dto.User;
import com.reigninbinary.bloodscribe.db.dto.UserIdentityType;
import com.reigninbinary.bloodscribe.db.dto.UserProfileItem;
import com.reigninbinary.bloodscribe.db.dto.UserProfileItemType;
import com.reigninbinary.bloodscribe.db.jdbc.mappers.UserDataMapper;
import com.reigninbinary.bloodscribe.db.jdbc.mappers.UserIdentityTypeMapper;
import com.reigninbinary.bloodscribe.db.jdbc.mappers.UserProfileItemMapper;
import com.reigninbinary.bloodscribe.db.jdbc.mappers.UserProfileItemTypeMapper;


public class UserDataQueries {

	public static List<User> findAllUsers() throws CoreDatabaseException {
		
		final String QUERY = "select * from users";
		
		return CoreJdbcQuery.executeQuery(QUERY, new UserDataMapper());
	}
	
	public static User findUserByUserId(int idUser) throws CoreDatabaseException {
		
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
	
	public static User findUserByIdentityId(String idIdentity) throws CoreDatabaseException {
		
		final String QUERY = "select * from users where identity_id = ?";
		
		List<PreparedStatementParam> params = new ArrayList<>();
		params.add(new IntegerParam(1, Integer.valueOf(idIdentity)));
		
		List<User> users = CoreJdbcQuery
				.executeQuery(QUERY, params, new UserDataMapper());
		
		if (users.size() > 0) {
			return users.get(0);
		}
		return null;
	}
	
	public static User findUserByEmailAddress(String emailAddress) throws CoreDatabaseException {
		
		final String QUERY = "select * from users where email_address = ?";
		
		List<PreparedStatementParam> params = new ArrayList<>();
		params.add(new IntegerParam(1, Integer.valueOf(emailAddress)));
		
		List<User> users = CoreJdbcQuery
				.executeQuery(QUERY, params, new UserDataMapper());
		
		if (users.size() > 0) {
			return users.get(0);
		}
		return null;
	}

	public List<UserProfileItem> findProfileItemsByUserId(int idUser) throws CoreDatabaseException {
		
		final String QUERY = "select * from user_profile_items where user_id = ?";
		
		List<PreparedStatementParam> params = new ArrayList<>();
		params.add(new IntegerParam(1, Integer.valueOf(idUser)));
		
		return CoreJdbcQuery.executeQuery(QUERY, params, new UserProfileItemMapper());
	}

	public List<UserIdentityType> findAllUserIdentityTypes() throws CoreDatabaseException {
		
		final String QUERY = "select * from user_identity_types";
		
		return CoreJdbcQuery.executeQuery(QUERY, new UserIdentityTypeMapper());
	}

	public List<UserProfileItemType> getUserProfileItemTypes() throws CoreDatabaseException {
		
		final String QUERY = "select * from user_profile_item_types";
		
		return CoreJdbcQuery.executeQuery(QUERY, new UserProfileItemTypeMapper());
	}

	public void saveUser(User user) throws CoreDatabaseException {
		// TODO Auto-generated method stub

	}

	public void saveUserProfileItem(UserProfileItem profileItem) throws CoreDatabaseException {
		// TODO Auto-generated method stub

	}

	public void saveUserProfileItemType(UserProfileItemType profileItemType) throws CoreDatabaseException {
		// TODO Auto-generated method stub

	}

	public void saveUserIdentityType(UserIdentityType identityType) throws CoreDatabaseException {
		// TODO Auto-generated method stub

	}

	public void deleteUser(User user) throws CoreDatabaseException {
		// TODO Auto-generated method stub

	}

	public void deleteUserProfileItem(UserProfileItem profileItem) throws CoreDatabaseException {
		// TODO Auto-generated method stub

	}

	public void deleteUserProfileItemType(UserProfileItemType profileItemType) throws CoreDatabaseException {
		// TODO Auto-generated method stub

	}

	public void deleteUserIdentityType(UserIdentityType identityType) throws CoreDatabaseException {
		// TODO Auto-generated method stub

	}
}
