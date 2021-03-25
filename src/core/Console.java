package core;

import java.io.*;
import java.util.*;

@SuppressWarnings("unused")
public class Console {
	
	private final static String INPUT_FILE = "sampleGraph1.txt";
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scanner = null;
		ProblemInstance pi = new ProblemInstance();
		
		try {
			scanner = new Scanner(new File("input" + File.separator + args[0]));
		}
		catch (IndexOutOfBoundsException e) {
			scanner = new Scanner(new File("src" + File.separator + "input" + File.separator + INPUT_FILE));
		}
		
		FileSystem fsys = new FileSystem(scanner, pi);
		pi.simulate();
		scanner.close();
		
	}

}
