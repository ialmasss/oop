package week2;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour, int minute, int second) {
		setTime(hour, minute, second);
	}
	
	private void setTime(int hour, int minute, int second) {
		if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
			throw new IllegalArgumentException("Error");
		}
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public String toUniversal() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	public String toStandard() {
		int h = hour % 12;
		if(h == 0) h = 12;
		String ampm = hour < 12 ? "AM" :  "PM";
		return String.format("%02d:%02d:%02d %s", h, minute, second, ampm);
	}
	
	public void add(Time t) {
		int s = this.second + t.second;
		int m = this.minute + t.minute + s / 60;
		int h = this.hour + t.hour + m / 60;
		
		this.second = s % 60;
		this.minute = m % 60;
		this.hour = h % 24;
		
	}

	public static void main(String[] args) {
		Time t = new Time(23, 5, 6);
		System.out.println(t.toUniversal());
		System.out.println(t.toStandard());
		
		Time t2 = new Time(4, 15, 35);
		t.add(t2);
		System.out.println(t.toUniversal());
	}

}
