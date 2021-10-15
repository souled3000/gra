package gra.busi;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class LoginServiceImpl implements ILoginService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public boolean validate(String name, String pwd) {
		try {
			jdbcTemplate.queryForObject("select id from t_admin where name=? and pwd = ?", new Object[] { name, pwd }, Long.class);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	@Transactional(readOnly = true)
	public List<Map<String, Object>> rooms() {
		List<Map<String, Object>> result = jdbcTemplate.queryForList("select name from t_room");
		return result;
	}
}
