/**
 * 
 */
package com.cm.lcm2.dao.user;

import java.util.List;

import com.cm.lcm2.vo.user.UserVO;

/**
 * <pre>
 * com.cm.lcm2.DAO.user
 *   |_ UserDAO.java
 * </pre>
 * 
 * Desc : 
 * @Company : LCM
 * @Author  : SuChan Kim
 * @Date    : 2021. 9. 27. 오후 3:47:39
 * @Version : 
 */
public interface UserDAO {

	List<UserVO> test() throws Exception;

	void insertTest(UserVO user) throws Exception;

}
