package com.cm.lcm2.controller;

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
		return "clan/clanUsr";
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
	@GetMapping("/reaveUsr")
	public String reaveUsr(Model model) {
		return "clan/reaveUsr";
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
}
