public class Tester {
	public static int findSum(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			display();
			sum = sum + i;
		}
		return sum;
	}
	private static void display() {
		String str="Infosys";
		System.out.println("Hello"+str);
		
	}
	public static void main(String args[]) {
		System.out.println(findSum(5));
		System.out.println("Done!!!!!");
	}
}
