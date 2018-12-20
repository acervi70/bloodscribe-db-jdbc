package com.reigninbinary.bloodscribe.db.jdbc.providers;

import java.util.List;

import com.reigninbinary.core.jdbc.CoreJdbcException;

import com.reigninbinary.bloodscribe.db.dto.User;
import com.reigninbinary.bloodscribe.db.dto.UserIdentityType;
import com.reigninbinary.bloodscribe.db.dto.UserProfileItem;
import com.reigninbinary.bloodscribe.db.dto.UserProfileItemType;
import com.reigninbinary.bloodscribe.db.queries.UserDataQueries;
import com.reigninbinary.bloodscribe.providers.UserProvider;

public class UserDataProvider implements UserProvider {

	public UserDataProvider() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public User getUserById(int idUser) {
		
		try {
			return UserDataQueries.findByUserId(idUser);
		} 
		catch (CoreJdbcException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User getUserByIdentityId(String idIdentity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByEmailAddress(String emailAddress) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserProfileItem> getUserProfileItems(int idUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsers() {

		try {
			return UserDataQueries.findAll();
		} 
		catch (CoreJdbcException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<UserIdentityType> getUserIdentityTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserProfileItemType> getUserProfileItemTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveUserProfileItem(UserProfileItem profileItem) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveUserProfileItemType(UserProfileItemType profileItemType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveUserIdentityType(UserIdentityType identityType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUserProfileItem(UserProfileItem profileItem) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUserProfileItemType(UserProfileItemType profileItemType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUserIdentityType(UserIdentityType identityType) {
		// TODO Auto-generated method stub

	}

}
