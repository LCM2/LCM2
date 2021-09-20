package com.cm.lcm2.VO.team;

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
@Table(name="TEAM")
public class TeamVO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int teamNo;
	private int teamClan;
	private String teamNm;
	private String teamNick;
	private String teamImg;
	private int teamLeader;
	private int teamDel;
	private String teamComent;
	private String teamContent;
	private int teamJoinDate;
	private int teamDelDate;
	private int teamJoin;
	private String teamColor;

}
