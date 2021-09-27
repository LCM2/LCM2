package com.cm.lcm2.vo.cw;

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
@Table(name="CW_GAME_PLAYER")
public class CwGamePlayerVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int no;
	private int userNo;
	private int clanNo;
	private int killU;
	private int death;
	private int assist;
	private int champ;
	private int elo;
	private int orderU;
	private int gameNo;
	private String delYn;
	private int region;
	
}
