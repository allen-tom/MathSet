//� A+ Computer Science  -  www.apluscompsci.com
//Name - Allen Tom
//Date - 02/03/15
//Class -  Comp Sci II
//Lab  -  Sets

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import static java.lang.System.*;

public class MathSet
{
	private Set<Integer> one;
	private Set<Integer> two;
	
	public MathSet()
	{
		
	}

	public Set<Integer> MathSet01(Set<Integer> uno, Set<Integer> dos)
	{
		one = uno;
		two = dos;
		
		return null;
	}

	public MathSet(String o, String t)
	{
	}

	public Set<Integer> union()
	{
		Set<Integer> union = new TreeSet<Integer>(one);
		union.addAll(two);
		return union;
	}

	public Set<Integer> intersection()
	{
		Set<Integer> intersection = new TreeSet<Integer>(one);
		intersection.retainAll(two);
		return intersection;
	}

	public Set<Integer> differenceAMinusB()
	{
		Set<Integer> diffAB = new TreeSet<Integer>(one);
		diffAB.removeAll(two);
		return diffAB;
	}

	public Set<Integer> differenceBMinusA()
	{
		Set<Integer> diffBA = new TreeSet<Integer>(two);
		diffBA.removeAll(one);
		return diffBA;
	}
	
	public Set<Integer> symmetricDifference()
	{	
		Set<Integer> symDiff = new TreeSet<Integer>(one);
		Set<Integer> tmp = new TreeSet<Integer>(two);
		symDiff.removeAll(two);
		tmp.removeAll(one);
		symDiff.addAll(tmp);
		return symDiff;
	}	
	
	public String toString()
	{
		return "Set one " + one + "\n" +	"Set two " + two +  "\n";
	}
}