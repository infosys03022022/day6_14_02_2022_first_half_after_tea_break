package infosys.demo.arrays;

public class Demo5 {
// Jagged array
	public static void main(String[] args) {
		int num[][]={{1}, {3,4}, {7,8,9}};
		for(int rows[] : num) {
			for(int col : rows) {
				System.out.print(col+"\t");
			}
			System.out.println();
		}
		

	}

}
