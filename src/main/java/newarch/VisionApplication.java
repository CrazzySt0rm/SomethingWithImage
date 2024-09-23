package newarch;

import com.zaxxer.hikari.pool.ProxyConnection;
import newarch.model.Vision;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


@SpringBootApplication
public class VisionApplication {
    private static ProxyConnection connection;


    public static void main(String[] args) throws SQLException {

        SpringApplication.run(VisionApplication.class, args);

    }
}
