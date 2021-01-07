package learnJdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseClient {
    public static void excWrite(String sql) throws IOException {
        SampleConnectionPoolDatasource datasource = new SampleConnectionPoolDatasource();
        try(Connection conn = datasource.getConnection();
            Statement stm = conn.createStatement()){
            stm.executeUpdate(sql);
            conn.commit();
        } catch (SQLException e){
            System.out.println("error: SQLException");
            e.printStackTrace();
        }
    }
    public static ResultSet excQuery(String sql) throws IOException, SQLException {
        try (Connection conn = new SampleConnectionPoolDatasource().getConnection();
        Statement stm = conn.createStatement()){
            ResultSet resultSet = stm.executeQuery(sql);
            return resultSet;
        }
    }
}
