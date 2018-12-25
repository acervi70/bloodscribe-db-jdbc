package com.reigninbinary.bloodscribe.db.jdbc.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.reigninbinary.bloodscribe.db.dto.UserProfileItem;
import com.reigninbinary.bloodscribe.db.tables.UserProfileItemsTable;
import com.reigninbinary.core.db.jdbc.mappers.ResultSetMapper;


public class UserProfileItemMapper implements ResultSetMapper<UserProfileItem> {

	@Override
	public UserProfileItem map(ResultSet rs) throws SQLException {
		
		UserProfileItem item = new UserProfileItem();
		item.setItemId(rs.getInt(UserProfileItemsTable.Columns.ITEM_ID.label()));
		item.setItemValue(rs.getString(UserProfileItemsTable.Columns.ITEM_VALUE.label()));
		item.setUserId(rs.getInt(UserProfileItemsTable.Columns.USER_ID.label()));
		item.setUserProfileItemTypeId(rs.getInt(UserProfileItemsTable.Columns.ITEM_TYPE_ID.label()));
		return null;
	}

}
