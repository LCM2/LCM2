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
@Table(name="TEAM_COMMU")
public class TeamCommuVO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int teamCommuNo;
	private int teamCommuWriter;
	private String teamCommuTitle;
	private String teamCommuContent;
	private int teamCommuDate;
	private int teamCommuClan;
	private int teamCommuTeam;

}
