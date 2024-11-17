package org.trash_hunter.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Classe identique a DataBaseConnection mais moins optimisé
 */
public class DatabaseConnectionManager {
    private final String url;
    private final Properties properties;
    public DatabaseConnectionManager(String host,String databaseName,String username, String password) {
        this.url="jdbc:mariadb://"+host+"/"+databaseName;
        this.properties=new Properties();
        this.properties.setProperty("user",username);
        this.properties.setProperty("password",password);
    }

    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(this.url,this.properties);
    }


}