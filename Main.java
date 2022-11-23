
public class Main {
	public static void main(String[]args) {
		Lliving_thing l1=new Man();
		//we are creating object using Lliving_things interface for man class
		//we implemented the abstraction using interface
		l1.eat();//calling eat 
		l1.talk();//calling talk implemented using inheritance
	}
}
