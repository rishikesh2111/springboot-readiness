package com.learn.hibernate.HibernateDemo.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
//import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

//@Component
public class ConnectionFactory {

    private static String url;

    @Value("spring.datasource.username")
    private String username;

    @Value("spring.datasource.password")
    private String password;

   // private static BasicDataSource dataSource;
   private static HikariDataSource dataSource;
    private ConnectionFactory(){

    }
    public static Connection getConnection()throws SQLException {
        if(dataSource == null){
            dataSource = new HikariDataSource();
            dataSource.setJdbcUrl(url);
            dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
            dataSource.setUsername("root");
            dataSource.setPassword("passw0rd");
        }
        return dataSource.getConnection();
    }

    public String getUrl() {
        return url;
    }

    @Value("spring.datasource.url")
    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
