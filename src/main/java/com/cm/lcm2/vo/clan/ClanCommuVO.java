package com.cm.lcm2.vo.clan;

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
@Table(name="CLAN_COMMU")
public class ClanCommuVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int clanCommuNo;
	private int clanCommuWriter;
	private String clanCommuTitle;
	private String clanCommuContent;
	private int clanCommuDate;
	private int clanCommuClan;
	
}
