package com.cm.lcm2.vo.cw;

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
@Table(name="CW_GAME")
public class CwGameVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cwGameNo;
	private String cwGameNm;
	private int cwGameClanNo;
	private int cwGameDate;
	private String cwGameTime;
	private int cwGameWin;
	private int cwGameWriter;
	private int cwGameMvp;
	private int cwGameSeason;
	private String cwGameDelYn;
	
}
