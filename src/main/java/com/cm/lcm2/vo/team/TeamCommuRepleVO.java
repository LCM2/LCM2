package com.cm.lcm2.vo.team;

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
@Table(name="TEAM_COMMU_REPLE")
public class TeamCommuRepleVO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int teamCommuRepleNo;
	private int teamCommuRepleCommuNo;
	private String teamCommuRepleContent;
	private int teamCommuRepleWriter;
	private int teamCommuRepleDate;
	private int teamCommuRepleClan;
	private int teamCommuRepleTeam;

}
