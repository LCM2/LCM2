package com.cm.lcm2.VO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="USER")
public class UserVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userNo;
	private String userId;
	private String userPw;
	private String userEmail;
	private int userAge;
	private String userNick;
	private int userPosition;
	private int userClan;
	private int userClanJoin;
	private int userJoin;
	private int userRight;
	private int userEmailFlag;
	private int userTeam;
	private int userTeamJoin;
	
	
}
