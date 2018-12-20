package com.reigninbinary.bloodscribe.db.jdbc.pool.dbcp;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

import com.reigninbinary.core.jdbc.CoreJdbcException;
import com.reigninbinary.core.jdbc.datasource.JdbcDataSourceConfig;
import com.reigninbinary.core.jdbc.datasource.JdbcDataSourceProvider;


public class DbcpDataSourceProvider implements JdbcDataSourceProvider {

	private static BasicDataSource dataSource;
    
    static {
    	dataSource = new BasicDataSource();
        
    	dataSource.setUrl(JdbcDataSourceConfig.getJdbcUrl());
    	dataSource.setUsername(JdbcDataSourceConfig.getJdbcUser());
    	dataSource.setPassword(JdbcDataSourceConfig.getJdbcPassword());
    	
    	// TODO: config these
    	dataSource.setMinIdle(5);
    	dataSource.setMaxIdle(10);
    	dataSource.setMaxOpenPreparedStatements(100);
    }

	@Override
	public DataSource getDataSource() throws CoreJdbcException {
		
		return dataSource;
	}
}
