package newarch;

import com.zaxxer.hikari.pool.ProxyConnection;
import jakarta.servlet.MultipartConfigElement;
import newarch.model.Vision;
import org.jsoup.Jsoup;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.util.unit.DataSize;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


@SpringBootApplication
public class VisionApplication {
    private static ProxyConnection connection;

//    @Bean
//    public MultipartConfigElement multipartConfigElement() {
//        MultipartConfigFactory factory = new MultipartConfigFactory();
//        factory.setMaxFileSize(DataSize.parse("1MB"));
//        factory.setMaxRequestSize(DataSize.parse("1MB"));
//        return factory.createMultipartConfig();
//    }




    public static void main(String[] args) throws SQLException {

        SpringApplication.run(VisionApplication.class, args);

    }
}
