package com.reigninbinary.bloodscribe.db.jdbc.providers;

import java.util.List;

import com.reigninbinary.bloodscribe.BloodscribeException;
import com.reigninbinary.bloodscribe.db.dto.GameWorld;
import com.reigninbinary.bloodscribe.db.dto.GameWorldDescription;
import com.reigninbinary.bloodscribe.providers.GameWorldProvider;

public class GameWorldDataProvider implements GameWorldProvider {

	@Override
	public GameWorld getGameWorldById(int idGameWorld)  throws BloodscribeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GameWorld> getGameWorldsByUser(int idUser)  throws BloodscribeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GameWorldDescription getGameWorldDescriptionById(int idDescription)  throws BloodscribeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GameWorldDescription> getGameWorldDescriptions(int idGameWorld)  throws BloodscribeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveGameWorld(GameWorld gameWorld)  throws BloodscribeException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveGameWorldDescription(GameWorldDescription description)  throws BloodscribeException {
		// TODO Auto-generated method stub
		
	}
}
