package org.simpliLearn;

//anonymous inner class
abstract class AnonymousInnerClass{
	public abstract void print();
}

public class InnerClasses {
	private String msg="Hello World";

	//regular inner class
	class inner{
		void hello() {
			System.out.println(msg);
		}
	}

	//method local inner class
	void methodOne() {
		class inner1{
			void display() {
				System.out.println("Method local inner class");
			}
		}
		inner1 in1 = new inner1();
		in1.display();
	}

	public static void main(String[] args) {

		//accessing regular inner class
		InnerClasses out = new InnerClasses();
		InnerClasses.inner in = out.new inner();
		in.hello();

		//accessing method local inner class
		out.methodOne();
		
		//anonymous inner class
		AnonymousInnerClass ai = new AnonymousInnerClass() {
			
			public void print() {
				System.out.println("This is an anonymous inner class");
				
			}
		};
		ai.print();
	}
}
