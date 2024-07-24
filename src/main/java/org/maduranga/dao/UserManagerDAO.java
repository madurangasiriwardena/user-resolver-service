package org.maduranga.dao;

import org.maduranga.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

@Component
public class UserManagerDAO {

    ResolverDataSource resolverDataSource;

    @Autowired
    public void setResolverDataSource(ResolverDataSource resolverDataSource) {
        this.resolverDataSource = resolverDataSource;
    }

    public void addUser(User user) {
        try (Connection connection = resolverDataSource.getConnection()) {

            for (Map.Entry entry : user.getAttributes().entrySet()) {
                try (PreparedStatement preparedStatement
                             = connection.prepareStatement("INSERT INTO USER_REGION (USERID, ATTRIBUTE_NAME, ATTRIBUTE_VALUE, REGION) VALUES (?, ?, ?, ?)")) {
                    preparedStatement.setString(1, user.getUserid());
                    preparedStatement.setString(2, entry.getKey().toString());
                    preparedStatement.setString(3, entry.getValue().toString());
                    preparedStatement.setString(4, user.getRegion());
                    preparedStatement.executeUpdate();
                }
            }

            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String searchUserRegion(String attributeValue) {
        try (Connection connection = resolverDataSource.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT REGION FROM USER_REGION WHERE ATTRIBUTE_VALUE = ?");
            preparedStatement.setString(1, attributeValue);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getString("REGION");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
