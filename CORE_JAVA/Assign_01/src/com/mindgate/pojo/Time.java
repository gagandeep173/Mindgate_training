package com.mindgate.pojo;

public class Time {
	private int hours;
	private int minutes;

	public static void main(String[] args) {
		int hours;
		int minutes;
		Time t1 = new Time();
		t1.settime(1,20);
		Time t2 =new Time();
		t2.settime(1, 30);
		Time t3 = t2.sum(t1);
		t3.showtime();
	}
	

	public void settime(int hours, int minutes) {
		this.hours=hours;
		this.minutes=minutes;
	}

	 public void showtime() {
System.out.println("hours:"+ hours + "  minutes:" + minutes);
	}

	public Time sum(Time Time) {
		Time t = new Time();
		int totalhours = this.hours+Time.hours;
		int totalminutes = this.minutes+Time.minutes;
		t.settime(totalhours, totalminutes);
		return t;
	}
}
