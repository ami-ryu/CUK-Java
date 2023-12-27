public class Calculator {
	public void calculate(int x, int y) {
		for(int i = 0; i < 5; i++) {
			if (i > 1)
				continue;
			System.out.println(x * y);
		}
	}
	
	public void calculate(int x) {
		for(int i = 0; i < 5; i++) {
			if (i == 3)
				break;
			System.out.println(x * x);
		}
	}
}
