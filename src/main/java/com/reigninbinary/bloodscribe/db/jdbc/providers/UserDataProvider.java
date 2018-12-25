package com.reigninbinary.bloodscribe.db.jdbc.providers;

import java.util.List;

import com.reigninbinary.bloodscribe.BloodscribeException;
import com.reigninbinary.bloodscribe.db.dto.User;
import com.reigninbinary.bloodscribe.db.dto.UserIdentityType;
import com.reigninbinary.bloodscribe.db.dto.UserProfileItem;
import com.reigninbinary.bloodscribe.db.dto.UserProfileItemType;
import com.reigninbinary.bloodscribe.db.jdbc.queries.UserDataQueries;
import com.reigninbinary.bloodscribe.providers.UserProvider;
import com.reigninbinary.core.db.CoreDatabaseException;

public class UserDataProvider implements UserProvider {

	@Override
	public List<User> getUsers() throws BloodscribeException {

		try {
			return UserDataQueries.findAllUsers();
		} 
		catch (CoreDatabaseException e) {			
			
			throw new BloodscribeException(e);
		}
	}
	@Override
	public User getUserById(int idUser) throws BloodscribeException {
		
		try {
			return UserDataQueries.findUserByUserId(idUser);
		} 
		catch (CoreDatabaseException e) {
			
			throw new BloodscribeException(e);
		}
	}

	@Override
	public User getUserByIdentityId(String idIdentity) throws BloodscribeException {
		
		try {
			return UserDataQueries.findUserByIdentityId(idIdentity);
		} 
		catch (CoreDatabaseException e) {
			
			throw new BloodscribeException(e);
		}
	}

	@Override
	public User getUserByEmailAddress(String emailAddress) throws BloodscribeException {
		
		try {
			return UserDataQueries.findUserByEmailAddress(emailAddress);
		} 
		catch (CoreDatabaseException e) {
			
			throw new BloodscribeException(e);
		}
	}

	@Override
	public List<UserProfileItem> getUserProfileItems(int idUser) throws BloodscribeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserIdentityType> getUserIdentityTypes() throws BloodscribeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserProfileItemType> getUserProfileItemTypes() throws BloodscribeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveUser(User user) throws BloodscribeException {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveUserProfileItem(UserProfileItem profileItem) throws BloodscribeException {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveUserProfileItemType(UserProfileItemType profileItemType) throws BloodscribeException {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveUserIdentityType(UserIdentityType identityType) throws BloodscribeException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(User user) throws BloodscribeException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUserProfileItem(UserProfileItem profileItem) throws BloodscribeException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUserProfileItemType(UserProfileItemType profileItemType) throws BloodscribeException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUserIdentityType(UserIdentityType identityType) throws BloodscribeException {
		// TODO Auto-generated method stub

	}

}
