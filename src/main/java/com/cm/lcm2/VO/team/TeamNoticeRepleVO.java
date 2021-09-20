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
@Table(name="TEAM_NOTICE_REPLE")
public class TeamNoticeRepleVO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int teamNoticeRepleNo;
	private int teamNoticeRepleNoticeNo;
	private String teamNoticeRepleContent;
	private int teamNoticeRepleWriter;
	private int teamNoticeRepleDate;
	private int teamNoticeRepleClan;
	private int teamNoticeRepleTeam;

}
