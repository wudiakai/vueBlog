package com.xxx;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class VueBlogApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() {
        Connection connection = null;
        try {
            Class<? extends DataSource> aClass = dataSource.getClass();
            System.out.println(aClass);
            connection = dataSource.getConnection();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
