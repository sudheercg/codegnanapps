package fi;
public class InterfImpl implements Interf1 {


	public static void main(String[] args) {
		InterfImpl i = new InterfImpl();
		i.m1(10, 20);
		i.m2();
		Interf1.m3();
	}


	public int m1(int arg1, int arg2) {
	
		return arg1+arg2;
	}


}
