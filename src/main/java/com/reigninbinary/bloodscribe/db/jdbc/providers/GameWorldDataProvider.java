package com.reigninbinary.bloodscribe.db.jdbc.providers;

import java.util.List;

import com.reigninbinary.bloodscribe.db.dto.GameWorld;
import com.reigninbinary.bloodscribe.db.dto.GameWorldDescription;
import com.reigninbinary.bloodscribe.providers.GameWorldProvider;

public class GameWorldDataProvider implements GameWorldProvider {

	public GameWorldDataProvider() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public GameWorld getGameWorldById(int idGameWorld) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GameWorld> getGameWorldsByUser(int idUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GameWorldDescription getGameWorldDescriptionById(int idDescription) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GameWorldDescription> getGameWorldDescriptions(int idGameWorld) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveGameWorld(GameWorld gameWorld) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveGameWorldDescription(GameWorldDescription description) {
		// TODO Auto-generated method stub
		
	}
}
