package com.fh.entity.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class TableSearch {

	       private Integer draw;
	       
	       private Integer start;
	       
	       private Integer length;

	       private Integer classifyId;

	       private Integer attrId;
	       private String name;
	       private Integer sex;
	       @DateTimeFormat(pattern = "yyyy-MM-dd")
	       private Date chuxing;
	       @DateTimeFormat(pattern = "yyyy-MM-dd")
	       private Date daodadate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getAttrId() {
		return attrId;
	}

	public void setAttrId(Integer attrId) {
		this.attrId = attrId;
	}

	public Integer getDraw() {
		return draw;
	}

	public void setDraw(Integer draw) {
		this.draw = draw;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getClassifyId() {
		return classifyId;
	}

	public void setClassifyId(Integer classifyId) {
		this.classifyId = classifyId;
	}

	public Date getChuxing() {
		return chuxing;
	}

	public void setChuxing(Date chuxing) {
		this.chuxing = chuxing;
	}

	public Date getDaodadate() {
		return daodadate;
	}

	public void setDaodadate(Date daodadate) {
		this.daodadate = daodadate;
	}
}
