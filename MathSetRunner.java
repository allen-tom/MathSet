
//Name - Allen Tom
//Date - 02/03/15	
//Class - Comp sci II 5th
//Lab  - Sets

import java.io.File;
import java.io.IOException;
import java.util.*;
import static java.lang.System.*;
import java.util.regex.*;

public class MathSetRunner extends MathSet
{
	public static void main(String args[]) throws IOException
	{
		Scanner scan = new Scanner(new File("mathsetdata.dat"));
		Pattern delimiters = Pattern.compile(System.getProperty("line.separator")+"|\\D");
		scan.useDelimiter(delimiters);
		
		MathSet setman = new MathSet();
		int num = scan.nextInt();
		for (int a =0; a<num; a++){ 
			 Set<Integer> first = new TreeSet<Integer>();
			 Set<Integer> second = new TreeSet<Integer>();
			 
			 while(scan.hasNextInt()){
				 first.add(scan.nextInt());
			 }
			 String str = scan.next();
			 while(scan.hasNextInt()){
				 second.add(scan.nextInt());
			 }
			 
			 setman.MathSetter(first,second);
			 out.println(setman.toString());
			 out.println("union:: " + setman.union());
			 out.println("intersection:: " + setman.intersection());
			 out.println("difference A-B:: " + setman.differenceAMinusB());
			 out.println("difference B-A:: " + setman.differenceBMinusA());
			 out.println("symmetric difference:: " + setman.symmetricDifference());
			 out.println(" ");
			 out.println(" ");
			 str = scan.next();
			 
			 
		}
	}
}
