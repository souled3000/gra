package gra.busi;

import java.util.List;
import java.util.Map;

public interface ILoginService {
	boolean validate(String name,String pwd);
	List<Map<String,Object>> rooms();
}
