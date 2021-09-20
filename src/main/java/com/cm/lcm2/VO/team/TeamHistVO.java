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
@Table(name="TEAM_HIST")
public class TeamHistVO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int teamHistNo;
	private int teamHistUserNo;
	private int teamHistClanNo;
	private int teamHistTeamNo;
	private int teamHistDel;
	private int teamHistRight;

}
