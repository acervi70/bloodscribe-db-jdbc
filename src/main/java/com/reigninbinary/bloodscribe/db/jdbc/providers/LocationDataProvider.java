package com.reigninbinary.bloodscribe.db.jdbc.providers;

import java.util.List;

import com.reigninbinary.bloodscribe.db.dto.BaseLocationType;
import com.reigninbinary.bloodscribe.db.dto.GameWorldLocation;
import com.reigninbinary.bloodscribe.db.dto.GameWorldLocationType;
import com.reigninbinary.bloodscribe.db.dto.LocationDescription;
import com.reigninbinary.bloodscribe.db.dto.LocationTimeline;
import com.reigninbinary.bloodscribe.providers.LocationProvider;

public class LocationDataProvider implements LocationProvider {

	public LocationDataProvider() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public BaseLocationType getBaseLocationTypeById(int idLocationType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BaseLocationType> getBaseLocationTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GameWorldLocationType getGameWorldLocationTypeById(int idGameWorld, int idLocationType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GameWorldLocationType> getLocationTypesByGameWorld(int idGameWorld) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GameWorldLocation getLocationById(int idLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GameWorldLocation> getLocationsByParent(int idParentLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GameWorldLocation> getLocationsByGameWorld(int idGameWorld) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GameWorldLocation> getLocationsWithNoParent(int idGameWorld) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocationDescription getLocationDescriptionById(int idDescription) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LocationDescription> getLocationDescriptions(int idLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocationTimeline getLocationTimelineById(int idTimeline) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LocationTimeline> getLocationTimelines(int idLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveBaseLocationType(BaseLocationType type) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveGameWorldLocationType(GameWorldLocationType type) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveGameWorldLocation(GameWorldLocation location) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveLocationDescription(LocationDescription descripton) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveLocationTimeline(LocationTimeline timeline) {
		// TODO Auto-generated method stub

	}

}
