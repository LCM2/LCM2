package com.cm.lcm2.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cm.lcm2.service.user.UserService;
import com.cm.lcm2.vo.user.UserVO;

@RestController
@RequestMapping("/api/user")
public class UserRestController {

	@Autowired
	private UserService userService;

	@GetMapping("/sendMail")
	public String sendMail() {

		//화면에서 받은 email
		String sEmail = "fvor001@naver.com";

		//화면에 보내줄 인증코드
		String sAutoCode = "";
		try {
			sAutoCode = userService.sendMail(sEmail);
		} catch (Exception e) {
			e.printStackTrace();
		}

//		return sAutoCode;
		return "member/login";
	}

	// 추후 swagger 연동하여  Api Spec 문서 관리 예정
	// 회원가입
//	@ApiOperation(value = "태그 리스트 for Cloud", notes = "태그 클라우드에서 사용할 태그 리스트를 가지고 옵니다.")
	@PostMapping("/save")
	public void saveSignUp(@RequestBody UserVO user) throws Exception {
		if(user != null) {
			userService.save(user);
		}else {
			throw new NullPointerException("Not the save.");
		}
	}

	// 동일 ID 찾기
	@GetMapping("/findSameId")
	public UserVO findSameId(@RequestParam(value = "userId", required = true) String userId) throws Exception {
		UserVO user = null;

		if(userId != null) {
			user = userService.findSameId(userId);
		}else {
			throw new NullPointerException("Not the find.");
		}

		return user;
	}

	// 유저 목록 조회
	@GetMapping("/userList")
	public List<UserVO> userList(@PageableDefault(sort = { "userNo" }, direction = Direction.DESC, size = 5) Pageable pageable) throws Exception {

		List<UserVO> userPage = userService.findAll();
//		Page<UserVO> userPage = userService.findUserList(pageable);

		if(userPage.isEmpty()) {
			throw new NullPointerException("Not the find.");
		}

		return userPage;
	}

//	// 추후 swagger 연동하여  Api Spec 문서 관리 예정
//	// 회원가입
////	@ApiOperation(value = "태그 리스트 for Cloud", notes = "태그 클라우드에서 사용할 태그 리스트를 가지고 옵니다.")
//	@PostMapping("/deleteUser")
//	public void deleteUser(@RequestParam(value = "userId", required = true) String userId) throws Exception {
//		if(userId != null) {
//			userService.deleteUser(userId);
//		}else {
//			throw new NullPointerException("Not the save.");
//		}
//	}

	// 추후 swagger 연동하여  Api Spec 문서 관리 예정
	// 회원가입
//	@ApiOperation(value = "태그 리스트 for Cloud", notes = "태그 클라우드에서 사용할 태그 리스트를 가지고 옵니다.")
	@PostMapping("/updateUser")
	public void updateUser(@RequestParam(value = "userId", required = true) String userId,
			@RequestBody UserVO user) throws Exception {
		UserVO userVO = this.findSameId(userId);

		if(userVO != null) {
			userService.updateUser(userVO);
		}else {
			throw new NullPointerException("Not the save.");
		}
	}
	
	@GetMapping("/mybatisTest")
	public void test() throws Exception {
		List<UserVO> UserVOList = userService.test();
		for(UserVO UserVO : UserVOList) {
			System.out.println(UserVO.toString());
		}
	}
}
