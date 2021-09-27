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
@Table(name="CLAN")
public class ClanVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int clanNo;
	private String clanNm;
	private int clanMaster;
	private int clanJoin;
	private int clanDel;
	private int clanOpen;
	private int clanMain;
	private String clanLogo;
	private String clanPro;
	private String clanComent;
	
}
