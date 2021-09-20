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
@Table(name="CLAN_COMMU_REPLE")
public class ClanCommuRepleVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int clanCommuRepleNo;
	private int clanCommuRepleCommuNo;
	private int clanCommuRepleWriter;
	private String clanCommuRepleContent;
	private int clanCommuRepleDate;
	private int clanCommuRepleClan;
	
}
