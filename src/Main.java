import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company gongsi = new Company();
		Scanner in = new Scanner(System.in);
		int j = 1;
		for (; j == 1;) {
			System.out.println("****************************************************"
					+ "*************************************************************");
			System.out.println("----员工打卡系统----\r\n"
					+ "输入  0--------退出\r\n"
					+ "输入  1--------签到\r\n"
					+ "输入  2--------签退\r\n" 
					+ "输入  3--------查看签到信息\r\n" 
					+ "请输入想执行的操作：");
			try {
				switch (Integer.parseInt(in.nextLine())) {
				case 0:
					j = 0;
					System.out.println("再见!");
					break;
				case 1:
					System.out.println("请输入ID:");
					String ID = in.nextLine();
					gongsi.sign_in(ID);
					break;
				case 2:
					System.out.println("请输入ID:");
					ID = in.nextLine();
					gongsi.sign_out(ID);
					break;
				case 3:
					gongsi.sign_info();
					break;
				default:
					System.out.println("无效信息,请重新输入");
				}
			} catch (java.lang.NumberFormatException e) {
				System.out.println("无效信息,请重新输入");
			}

		}

	}

}
