package com.main.dao;

import java.util.jar.Attributes.Name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.main.entity.User;

@Repository
public class UserDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public boolean insertUser(User user) {

		boolean Status = false;

		try {
			String insert_sql_query = "insert into users(name, email, gender, city) values(?,?,?,?)";
			int count = jdbcTemplate.update(insert_sql_query, user.getName(), user.getEmail(), user.getGender(),
					user.getCity());

			if (count > 0) {
				Status = true;
			} else {
				Status = false;
			}
		} catch (Exception e) {
			Status = false;
			e.printStackTrace();
		}

		return Status;
	}

}
