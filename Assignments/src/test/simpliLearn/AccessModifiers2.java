package test.simpliLearn;

import org.simpliLearn.*;

public class AccessModifiers2 extends AccessModifiers{
	public static void main(String[] args) {
		//testing access modifiers from another package
		AccessModifiers2 AM = new  AccessModifiers2();
		AM.pubMethod();//can access public method from another package
		AM.proMethod();//can access protected method from subclass of another package
		//AM.defMethod();//cannot access default method from another package
	}

}
