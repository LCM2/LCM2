package com.cm.lcm2.vo.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="USER")
public class UserVO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_no", updatable = false, nullable = false)
	private int userNo;
	@Column(name = "user_id", updatable = false, nullable = false)
	private String userId;
	@Column(name = "user_pw", updatable = false, nullable = false)
	private String userPw;
	@Column(name = "user_email", updatable = false, nullable = false)
	private String userEmail;
	@Column(name = "user_age", updatable = false, nullable = false)
	private int userAge;
	@Column(name = "user_nick", updatable = false, nullable = false)
	private String userNick;
	@Column(name = "user_position", updatable = false, nullable = false)
	private int userPosition;
	@Column(name = "user_clan", updatable = false, nullable = false)
	private int userClan;
	@Column(name = "user_clan_join", updatable = false, nullable = false)
	private int userClanJoin;
	@Column(name = "user_join", updatable = false, nullable = false)
	private int userJoin;
	@Column(name = "user_right", updatable = false, nullable = false)
	private int userRight;
	@Column(name = "user_email_flag", updatable = false, nullable = false)
	private Integer userEmailFlag;
	@Column(name = "user_team", updatable = false, nullable = false)
	private int userTeam;
	@Column(name = "user_team_join", updatable = false, nullable = false)
	private int userTeamJoin;


}
