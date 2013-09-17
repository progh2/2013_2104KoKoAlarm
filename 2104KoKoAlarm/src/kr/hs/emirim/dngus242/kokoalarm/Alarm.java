package kr.hs.emirim.dngus242.kokoalarm;

import com.orm.SugarRecord;

import android.content.Context;

public class Alarm extends SugarRecord<Alarm>{
	private int hour;
	private int minute;
	public Alarm(Context context){
		super(context);

	}
	
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setContent(String h,String m) {
		this.hour = Integer.parseInt(h);
		this.minute = Integer.parseInt(m);
	}
	
}
