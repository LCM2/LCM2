package com.cm.lcm2.model;

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
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int USER_NO;
	private String USER_ID;
	private String USER_PW;
	private String USER_EMAIL;
	private int USER_AGE;
	private String USER_NICK;
	private int USER_POSITION;
	private int USER_CLAN;
	private int USER_CLAN_JOIN;
	private int USER_JOIN;
	private int USER_RIGHT;
	private int USER_EMAIL_FLAG;
	private int USER_TEAM;
	private int USER_TEAM_JOIN;
	
	
}
