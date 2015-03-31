
public class MMDriver {
	
	public static void main(String args[])
	{
		Tree tree = new Tree(64, null);
		Process p = new Process(32, "Process A");
		Process p2 = new Process(32, "Process B");
		tree.allocate(p2);
		//tree.allocate(p);
		

	}

}
