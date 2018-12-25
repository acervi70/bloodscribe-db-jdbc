package com.reigninbinary.bloodscribe.db.jdbc.providers;

import java.util.List;

import com.reigninbinary.bloodscribe.BloodscribeException;
import com.reigninbinary.bloodscribe.db.dto.BaseLocationType;
import com.reigninbinary.bloodscribe.db.dto.GameWorldLocation;
import com.reigninbinary.bloodscribe.db.dto.GameWorldLocationType;
import com.reigninbinary.bloodscribe.db.dto.LocationDescription;
import com.reigninbinary.bloodscribe.db.dto.LocationTimeline;
import com.reigninbinary.bloodscribe.providers.LocationProvider;

public class LocationDataProvider implements LocationProvider {

	@Override
	public BaseLocationType getBaseLocationTypeById(int idLocationType) throws BloodscribeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BaseLocationType> getBaseLocationTypes() throws BloodscribeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GameWorldLocationType getGameWorldLocationTypeById(int idGameWorld, int idLocationType) throws BloodscribeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GameWorldLocationType> getLocationTypesByGameWorld(int idGameWorld) throws BloodscribeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GameWorldLocation getLocationById(int idLocation) throws BloodscribeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GameWorldLocation> getLocationsByParent(int idParentLocation) throws BloodscribeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GameWorldLocation> getLocationsByGameWorld(int idGameWorld) throws BloodscribeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GameWorldLocation> getLocationsWithNoParent(int idGameWorld) throws BloodscribeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocationDescription getLocationDescriptionById(int idDescription) throws BloodscribeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LocationDescription> getLocationDescriptions(int idLocation) throws BloodscribeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocationTimeline getLocationTimelineById(int idTimeline) throws BloodscribeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LocationTimeline> getLocationTimelines(int idLocation) throws BloodscribeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveBaseLocationType(BaseLocationType type) throws BloodscribeException {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveGameWorldLocationType(GameWorldLocationType type) throws BloodscribeException {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveGameWorldLocation(GameWorldLocation location) throws BloodscribeException {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveLocationDescription(LocationDescription descripton) throws BloodscribeException {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveLocationTimeline(LocationTimeline timeline) throws BloodscribeException {
		// TODO Auto-generated method stub

	}

}
