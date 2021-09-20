package com.cm.lcm2.VO.cw;

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
@Table(name="CW_LOG")
public class CwLogVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cwLogNno;
	private int cwLogYype;
	private int cwLogClanNo;
	private int cwLogUserNo;
	private int cwLogGameNo;
	private int cwLogWindef;
	private String cwLogBigo;
	private int cwLogScore;
	private String cwLogDelYn;
	
}
