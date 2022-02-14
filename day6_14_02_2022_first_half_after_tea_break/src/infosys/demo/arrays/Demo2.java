package infosys.demo.arrays;

public class Demo2 {

	public static void main(String[] args) {
		int num[][]={{1,2,3}, {3,4,6}, {7,8,9}};
		for(int rows=0;rows<num.length;rows++) {
			for(int cols=0;cols<num[rows].length;cols++) {
				System.out.print(num[rows][cols]+"\t");
			}
			System.out.println();
		}
		

	}

}
