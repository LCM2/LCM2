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
@Table(name="CW_RIGHT")
public class CwRightVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int no;
	private int user;
	private int clan;
	private int userRight;
	
}
