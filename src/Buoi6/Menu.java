package Buoi6;

import Buoi6.db.DbConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Menu {

    /// INSERT DỮ LIỆU
    public void Them() {
        try {
            Connection connection = DbConnect.getConnection();

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    /// UPDATE tên theo id
    public void uppdate(String id, String name) {
        try {
            Connection connection = DbConnect.getConnection();
            String update = "UPDATE Product SET name = ? where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(update);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, id);
            if(preparedStatement.executeUpdate() == 1)
                System.out.println("ĐÃ UPDATE");
            else
                System.out.println("KHÔNG TỒN TẠI ID!!!!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /// SELECT theo id
    public void select(String id) {
        try {
            Connection connection = DbConnect.getConnection();
            String select = "SELECT * FROM Product WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(select);
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
