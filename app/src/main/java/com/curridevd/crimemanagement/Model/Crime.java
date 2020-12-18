package com.curridevd.crimemanagement.Model;

import java.text.DateFormat;
import java.util.Date;
import java.util.UUID;

public class Crime {
	private UUID mID;
	private String mTitle;
	private Date mDate;
	private boolean isSolved;

	public Date getDate() {
		return this.mDate;
	}

	public void setDate(Date mDate) {
		this.mDate = mDate;
	}

	public boolean isSolved() {
		return isSolved;
	}

	public void setSolved(boolean solved) {
		isSolved = solved;
	}

	public Crime(String mTitle) {
		this.mID = UUID.randomUUID();
		this.mTitle = mTitle;
	}

	public Crime() {
		this.mID = UUID.randomUUID();
		this.mDate = new Date();
	}

	public UUID getID() {
		return mID;
	}

	public void setID(UUID mID) {
		this.mID = mID;
	}

	public String getTitle() {
		return mTitle;
	}

	public void setTitle(String mTitle) {
		this.mTitle = mTitle;
	}
}
