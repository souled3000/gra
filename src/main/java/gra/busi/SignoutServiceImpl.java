package gra.busi;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class SignoutServiceImpl implements ISignoutService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional
	public void signout(Long id) {
		try{
			String sql = "update t_item set status = 1 , signouttime = ? where id = ?";
			jdbcTemplate.update(sql,new Date().getTime(),id);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
}
