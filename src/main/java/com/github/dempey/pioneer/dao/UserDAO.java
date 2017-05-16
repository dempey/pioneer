package com.github.dempey.pioneer.dao;

import com.github.dempey.pioneer.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDAO {

    private JdbcTemplate jdbcTemplate;

    public UserDAO(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void saveOrUpdate(User user) {
        if (user.getId() > 0) {
            //update
            String sql = "UPDATE users SET username == ?, password = ?, enabled = ? WHERE id = ?";
            jdbcTemplate.update(sql, user.getUsername(), user.getPassword(), user.isEnabled(), user.getId());
        }
        else {
            //insert
            String sql = "INSERT INTO users (username, password, enabled, demographics_id) " +
                    "VALUES (?, ?, ?, ?)";
            jdbcTemplate.update(sql, user.getUsername(), user.getPassword(), user.isEnabled(),
                    user.getDemographic().getId());
        }
    }

    public void delete(User user) {
        String sql = "DELETE FROM users WHERE id = ?";
        jdbcTemplate.update(sql, user.getId());
    }

    public List<User> list() {
        String sql = "SELECT * FOM users";
        List<User> users = jdbcTemplate.query(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();

                user.setId(rs.getLong("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setEnabled(rs.getBoolean("enabled"));

                return user;
            }
        });

        return users;
    }

    public User get(int id) {
        //TODO implementation
        return null;
    }
}
