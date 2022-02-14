package infosys.demo.arrays;

public class Demo3 {

	public static void main(String[] args) {
		int num[][]={{1,2,3}, {3,4,6}, {7,8,9}};
		for(int rows[] : num) {
			for(int col : rows) {
				System.out.print(col+"\t");
			}
			System.out.println();
		}
		

	}

}
