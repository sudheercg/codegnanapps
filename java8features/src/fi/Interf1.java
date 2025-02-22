package fi;
@FunctionalInterface
public interface Interf1 {
		// SAM - Single Abstract Method
		public int m1(int arg1, int arg2);


		default void m2() {
		System.out.println("Hello from default method");
}
public static void m3() {
		System.out.println("Hello from static method");
		}
}
