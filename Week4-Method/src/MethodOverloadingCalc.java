public class MethodOverloadingCalc {
	public static void calculate(int x, double y) {
		for(int i = 0; i < 5; i++) {
			if (i > 3)
				break;
			System.out.println(x * y);
		}
	}
	
	public static void calculate(int x) {
		for(int i = 0; i < 5; i++) {
			if (i == 3)
				break;
			System.out.println(x * x);
		}
	}
	
	
	public static void main(String[] args) {
		calculate(2, 2.5);
		calculate(4);
	}

}
