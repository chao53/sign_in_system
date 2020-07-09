import java.util.*;

class Company {
	ArrayList<Employee> Em_list = new ArrayList<Employee>();
	ArrayList<DakaInfo> Da_list = new ArrayList<DakaInfo>();

	public Company() {
		Employee ta1 = new Employee("001", "Mike");
		Employee ta2 = new Employee("002", "Bobi");
		Employee ta3 = new Employee("003", "Will");
		Em_list.add(ta1);
		Em_list.add(ta2);
		Em_list.add(ta3);

	}

	public void sign_in(String ID) {
		int j1 = 0;
		for (int i1 = 0; i1 < Em_list.size(); i1++) {
			if (Em_list.get(i1).ID.equals(ID)) {
				int j2 = 0;
				for(int i2 = 0; i2 < Da_list.size(); i2++) {
					if(Da_list.get(i2).ID.equals(ID) && Da_list.get(i2).sign_out_time == null) {
						j1 = 1;
						j2 = 1;
					}
				}
				if(j2 == 1) {
					System.out.println("尚未签退");
				}
				else {
					DakaInfo info = new DakaInfo(ID);
					info.sign_in();
					Da_list.add(info);
					j1 = 1;
					System.out.println("签到成功");
				}
			}
		}
		if (j1 == 0) {
			System.out.println("查无此人");
		}
	}

	public void sign_out(String ID) {
		int j1 = 0;
		for (int i1 = 0; i1 < Em_list.size(); i1++) {
			if (Em_list.get(i1).ID.equals(ID)) {
				int j2 = 0;
				for (int i2 = 0; i2 < Da_list.size(); i2++) {
					if (Da_list.get(i2).ID.equals(ID) && Da_list.get(i2).sign_out_time == null) {
						Da_list.get(i2).sign_out();
						System.out.println("签退成功");
						j2 = 1;
					}
					if (j2 == 0) {
						System.out.println("尚未签到");
					}
				}
				j1 = 1;
			}
		}
		if (j1 == 0) {
			System.out.println("查无此人");
		}
	}

	public void sign_info() {
		for (int i1 = 0; i1 < Em_list.size(); i1++) {
			Em_list.get(i1).toString2();
			System.out.println("签到时间						签退时间");
			for(int i2 = 0; i2 < Da_list.size(); i2++) {
				if(Em_list.get(i1).ID.equals(Da_list.get(i2).ID)) {
					Da_list.get(i2).getInfo();
				}
			}
		}
	}
}
