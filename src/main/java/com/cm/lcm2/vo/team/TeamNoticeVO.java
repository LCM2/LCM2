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
@Table(name="TEAM_NOTICE")
public class TeamNoticeVO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int teamNoticeNo;
	private String teamNoticeTitle;
	private String teamNoticeContent;
	private int teamNoticeDate;
	private int teamNoticeWriter;
	private int teamNoticeClan;
	private int teamNoticeTeam;

}
