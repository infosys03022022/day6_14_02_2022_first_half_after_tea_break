package infosys.demo.arrays;

public class CommandLineDemo1 {

	public static void main(String[] args) {
	System.out.println(args.length);
   // If we don't pass any command line argument, size will be 0 
	for(String str : args)
	{
		System.out.println(str);
	}
	System.out.println("-----------------------");
	for(int i=0;i<args.length;i++)
	{
		System.out.println(args[i]);
	}
	}

}
