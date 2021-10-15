package gra.busi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gra.o.Item;
@Repository
public class CurrentServiceImpl implements ICurrentService {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	
	
	public List<Item> getCurItems(int curPageNo) {
		
		return null;
	}

}
