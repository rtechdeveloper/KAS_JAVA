package aula04.src.infra.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnection {
    
    public Connection getConnection() {
        
        String url = "jdbc:mysql://localhost:3306/app";
        String usuario = "root";
        String pasword = "root";
        
      try {

        return DriverManager.getConnection(url, usuario, pasword);

    }catch (SQLException e) {
       throw new RuntimeException(e);
        }
    }
}

