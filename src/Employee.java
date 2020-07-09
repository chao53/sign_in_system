
class Employee {

	String ID;
	private String name;
	
	public Employee(String ID, String name) {
		this.ID = ID;
		this.name = name;
	}
	
	public void toString2() {
		System.out.println("ID:" + ID + "\t" + "姓名:" + name);
	}

}
