/**
 * 
 */
package com.cm.lcm2.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cm.lcm2.VO.user.UserVO;

/**
 * <pre>
 * com.cm.lcm2.mapper
 *   |_ UserMapper.java
 * </pre>
 * 
 * Desc : 
 * @Company : LCM
 * @Author  : SuChan Kim
 * @Date    : 2021. 9. 27. 오후 3:50:49
 * @Version : 
 */
@Mapper
public interface UserMapper {

	List<UserVO> test() throws Exception;

}
