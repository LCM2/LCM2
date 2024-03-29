package com.cm.lcm2.controller.clan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clan")
public class ClanController {

	@GetMapping("/teamList")
	public String teamList(Model model) {
		return "clan/teamList";
	}
	
	@GetMapping("/teamGnrt")
	public String teamGnrt(Model model) {
		return "clan/teamGnrt";
	}
	
	@GetMapping("/myTeamMain")
	public String myTeamMain(Model model) {
		return "clan/myTeamMain";
	}
	
	@GetMapping("/teamUsrMngmt")
	public String teamUsrMngmt(Model model) {
		return "clan/teamUsrMngmt";
	}
	
	@GetMapping("/teamJoinMngmt")
	public String teamJoinMngmt(Model model) {
		return "clan/teamJoinMngmt";
	}
	
	/*클랜원*/
	@GetMapping("/clanUsr")
	public String clanUsr(Model model) {
		return "clan/clanUsr";
	}
	/*가입신청서 관리*/
	@GetMapping("/joinApplMngmt")
	public String joinApplMngmt(Model model) {
		return "clan/joinApplMngmt";
	}
	/*가입대기*/
	@GetMapping("/joinWait")
	public String joinWait(Model model) {
		return "clan/joinWait";
	}
	/*수습인원*/
	@GetMapping("/prbtnUsr")
	public String prbtnUsr(Model model) {
		return "clan/prbtnUsr";
	}
	/*탈퇴인원*/
	@GetMapping("/leaveUsr")
	public String reaveUsr(Model model) {
		return "clan/leaveUsr";
	}
	/*메인*/
	@GetMapping("/main")
	public String main(Model model) {
		return "clan/main";
	}
	/*일정*/
	@GetMapping("/calendar")
	public String calendar(Model model) {
		return "clan/calendar";
	}
	
	/* 팀관리 */
	@GetMapping("/teamMng")
	public String teamMng(Model model) {
		return "clan/teamMng";
	}
	
	/* 리그 관리 */
	@GetMapping("/leagueMng")
	public String leagueMng(Model model) {
		return "clan/leagueMng";
	}
	
	/* 리그신청 관리 */
	@GetMapping("/leagueApplMng")
	public String leagueApplMng(Model model) {
		return "clan/leagueApplMng";
	}
	
	/* 기타 */
	@GetMapping("/clanMngEtc")
	public String clanMngEtc(Model model) {
		return "clan/clanMngEtc";
	}
	
	/**
	 * Desc : 클랜 > 리그
	 * @Company : LCM
	 * @Date    : 2021. 9. 2. 오후 10:59:28
	 * @Author  : hobin
	 * @param model
	 * @return
	 */
	@GetMapping("/clanLeague")
	public String clanLeague(Model model) {
		return "clan/clanLeague";
	}
	
	/**
	 * Desc : 클랜 > 내전 > 기록
	 * @Company : LCM
	 * @Date    : 2021. 9. 2. 오후 10:59:28
	 * @Author  : hobin
	 * @param model
	 * @return
	 */
	@GetMapping("/clanCwRec")
	public String clanCw(Model model) {
		return "clan/clanCwRec";
	}
	
	
	/**
	 * Desc : 클랜 > 관리 > 상점로그
	 * @Company : LCM
	 * @Date    : 2021. 9. 2. 오후 10:59:28
	 * @Author  : hobin
	 * @param model
	 * @return
	 */
	@GetMapping("/PmLog")
	public String PmLog(Model model) {
		return "clan/PmLog";
	}
	
	/**
	 * Desc : 클랜 > 관리 > 팀가입대기
	 * @Company : LCM
	 * @Date    : 2021. 9. 2. 오후 10:59:28
	 * @Author  : hobin
	 * @param model
	 * @return
	 */
	@GetMapping("/teamJoinWait")
	public String teamJoinWait(Model model) {
		return "clan/teamJoinWait";
	}
	
	
}
