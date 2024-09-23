package com.evergent.coreJAVA.OOPS;

class PersonData{
	public void myPersonData() {
		System.out.println("PersonData Class Method");
	}
}

class PersonInfo extends PersonData{
	public void myDetails() {
		System.out.println("PersonInfo Class Method");
	}
}
public class MultiLevelInheritanceDemo extends PersonInfo {
	public void show() {
		System.out.println("Local Method");
	}

	public static void main(String[] args) {
		MultiLevelInheritanceDemo mi= new MultiLevelInheritanceDemo();
		mi.myPersonData();
		mi.myDetails();
		mi.show();

	}

}
