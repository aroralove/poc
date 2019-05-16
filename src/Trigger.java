
public class Trigger {
 public static void main(String args[]) {
	 StandardTemplate obj = new ImplementationClass();
	 StandardTemplate obj2 = new ImplementationClass();
	 Trigger.check(((ImplementationClass)obj));
 }
 
 public static void check(StandardTemplate xyz) {
	 if(xyz instanceof ImplementationClass) {
		 ((ImplementationClass) xyz).write();
	 }
 }
}
