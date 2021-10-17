package gra.busi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import gra.o.Item;
@Repository
public class SigninServiceImpl implements ISigninService {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Transactional
	public void save(Item item) {
		try{
			String sql = "insert into t_item (factorystaff,factory,dept,deptstaff,adm,room,signintime,presignouttime) values (?,?,?,?,?,?,?,?)";
			jdbcTemplate.update(sql,item.getFactorystaff(),item.getFactory(),item.getDept(),item.getDeptstaff(),item.getAdm(),item.getRoom(),item.getSignintime().getTime(),item.getPresignouttime().getTime());
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
