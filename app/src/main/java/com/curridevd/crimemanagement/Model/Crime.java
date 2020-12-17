package com.curridevd.crimemanagement.Model;

import java.util.UUID;

public class Crime {
	private UUID mID;
	private String mTitle;

	public Crime( String mTitle) {
		this.mID = UUID.randomUUID();
		this.mTitle = mTitle;
	}

	public Crime (){
		this.mID = UUID.randomUUID();
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
