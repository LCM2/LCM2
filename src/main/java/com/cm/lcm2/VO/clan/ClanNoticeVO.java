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
@Table(name="CLAN_NOTICE")
public class ClanNoticeVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int clanNoticeNo;
	private int clanNoticeWriter;
	private String clanNoticeTitle;
	private String clanNoticeContent;
	private int clanNoticeDate;
	private int clanNoticeClan;
	
}
