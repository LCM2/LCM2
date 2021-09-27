package com.cm.lcm2.vo.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="USER_HIST")
public class UserHistVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userHistNo;
	private int userHistUserNo;
	private String userHistUserNick;
	private int userHistUserClan;
	private int userHistUserRight;
	private int userHistPoint;
	private int userHistElo;
	private int userHistUserDel;
	private int userHistDelDate;
	private int userHistJoinDate;
	private int userHistGge;
	private int userHistPosition;
	private int userHistShip;
	
}
