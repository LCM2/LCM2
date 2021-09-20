package com.cm.lcm2.VO.clan;

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
@Table(name="CLAN_NOTICE_REPLE")
public class ClanNoticeRepleVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int clanNoticeRepleNo;
	private int clanNoticeRepleNoticeNo;
	private int clanNoticeRepleWriter;
	private String clanNoticeRepleContent;
	private int clanNoticeRepleDate;
	private int clanNoticeRepleClan;
	
}
