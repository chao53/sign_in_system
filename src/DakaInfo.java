import java.text.SimpleDateFormat;
import java.util.*;

class DakaInfo {
	String ID;
	Date sign_in_time = null;
	Date sign_out_time = null;
	
	public DakaInfo(String ID) {
		this.ID = ID;
	}
	
	public void sign_in() {
		sign_in_time = new Date();
	}
	
	public void sign_out() {
		sign_out_time = new Date();
	}
	
	public void getInfo() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
		System.out.print(sdf.format(sign_in_time) + "			");
		if(sign_out_time == null) {
			System.out.println("尚未签退");
		}
		else {
			System.out.println(sdf.format(sign_out_time));
		}
	}
	
}
