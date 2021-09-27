/**
 * 
 */
package com.cm.lcm2.dao.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cm.lcm2.mapper.UserMapper;
import com.cm.lcm2.vo.user.UserVO;

/**
 * <pre>
 * com.cm.lcm2.DAO.user
 *   |_ UserDAOImpl.java
 * </pre>
 * 
 * Desc : 
 * @Company : LCM
 * @Author  : SuChan Kim
 * @Date    : 2021. 9. 27. 오후 3:48:00
 * @Version : 
 */
@Repository
public class UserDAOImpl implements UserDAO{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<UserVO> test() throws Exception {
		return userMapper.test();
	}

}
