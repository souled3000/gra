package gra.busi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HisServiceImpl implements IHisService {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
}
