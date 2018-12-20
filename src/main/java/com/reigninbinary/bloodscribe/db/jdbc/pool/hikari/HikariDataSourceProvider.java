package com.reigninbinary.bloodscribe.db.jdbc.pool.hikari;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import com.reigninbinary.core.jdbc.CoreJdbcException;
import com.reigninbinary.core.jdbc.datasource.JdbcDataSourceConfig;
import com.reigninbinary.core.jdbc.datasource.JdbcDataSourceProvider;


public class HikariDataSourceProvider implements JdbcDataSourceProvider {

    private static DataSource dataSource;   
    
    static {
        HikariConfig config = new HikariConfig();
        
        config.setJdbcUrl(JdbcDataSourceConfig.getJdbcUrl());
        config.setUsername(JdbcDataSourceConfig.getJdbcUser());
        config.setPassword(JdbcDataSourceConfig.getJdbcPassword());
        
        //TODO: add to config
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        
        dataSource = new HikariDataSource(config);
    }

	@Override
	public DataSource getDataSource() throws CoreJdbcException {
		
		return dataSource;
	}
     
}
