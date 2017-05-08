package com.project.myself2;


/**
 * Store information about a car.
 */
public class SideItemList1 {
	private String title;
	private int iconID;
	
	public SideItemList1(String title, int iconID) {
		super();
		this.title = title;
		this.iconID = iconID;
	}
	
	public String getItem() {
		return title;
	}

	public int getIconID() {
		return iconID;
	}

}

