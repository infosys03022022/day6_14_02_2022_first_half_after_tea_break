package infosys.demo.arrays;

public class Demo1 {

	public static void main(String[] args) {
		int num[][]=new int[3][4];
		for(int rows=0;rows<num.length;rows++) {
			for(int cols=0;cols<num[rows].length;cols++) {
				System.out.print(num[rows][cols]+"\t");
			}
			System.out.println();
		}
		

	}

}
