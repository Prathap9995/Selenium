import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;



public class Javastream {

	public static void main(String[] args) {
		Javastream j = new Javastream();
		ArrayList<String> names = new ArrayList<String>();
		names.add("Amar");
		names.add("Ponk");
		names.add("Ajja");
		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			String Actname = names.get(i);
			if (Actname.startsWith("A")) {
				count++;
			}
			System.out.println(count);
		}
		j.streamFilter();
		j.streamMap();
		j.streamCollect();
		j.assignment();
	}
//Using Stream
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Amar");
		names.add("Ponk");
		names.add("Ajja");
		names.add("Prathap");
		names.add("Shwetha");
		Long co = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(co);
		// WHere here we are moving arraylist into stream
		// Filter() will filter based upon our condition
		// -> lambda expression --->devided into two parts :- * left side specifies
		// parameter required by the expression -->s(same as looping)
		// Rightside is the lambda body which specifies actions of the lambda expression
		// -->s.condition()
			
		
		// there is no life for intermediate operation unless terminal operation
		// terminal ops willl execute inly when intm ops(filter) becomes true
		// We can create stream
		Long d = Stream.of("Amar", "Ponk", "Ajja").filter(s -> {
			s.startsWith("A"); // Terminal ops could be the body

			return false; // We should give return type here
		}).count(); // If we get the output it will be zero because our condition fails
System.out.println(d);
		
//To print all the names length is >4
names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
//From foreach we are getting output
//To print first name
names.stream().filter(n->n.length()>4).limit(1).forEach(n->System.out.println(n));  //Using limit we are limiting our output
		
	}
	
	public void streamMap() {
		
		//To print the name ends with letter a
		Stream.of("Prathap","Shwetha","Korathi","Gudiya").filter(p->p.endsWith("a")).map(p->p.toUpperCase()).forEach(p->System.out.println(p));
	//We are using map here to modify our output[manipulate]
	  //To print all the name	
		Stream.of("Prathap","Shwetha","Korathi","Gudiya").forEach(p->System.out.println(p));
	//To print in sorted order
		Stream.of("Prathap","Shwetha","Korathi","Gudiya", "Poojary").filter(p->p.startsWith("P")).sorted().map(p->p.toUpperCase()).forEach(p->System.out.println(p));
	//To get sorted output from two lists --merging
		String[] names = {"Prathap", "Shwetha", "Poojary","Subbi", "Korathi"};
		List name = Arrays.asList(names);
//One more method to define array
		List list = Arrays.asList("Barkur", "Korathi","Hosala", "Udupi");
		//Then
	Stream<String> newStream =	Stream.concat(name.stream(), list.stream());
//	newStream.sorted().forEach(p->System.out.println(p));

	//To match a string and check whether it is in the array or not
	
	boolean flag = newStream.anyMatch(p->p.equalsIgnoreCase("Korathi"));  //Here by using anymatch() we are checking
	Assert.assertTrue(flag);
	
	
	}
 public void streamCollect() {
	 //Converting back to proper string using "collect"
	List ls =  Stream.of("Prathap","Shwetha","Korathi","Gudiya").filter(p->p.startsWith("P")).map(p->p.toUpperCase())
	 .collect(Collectors.toList());

// Here we are converting into list as ls
//Then printing the first letter
	System.out.println(ls.get(0));
	
 
 }
	public void assignment() {
		Integer[] num = {3,2,2,7,5,1,9,7};
	List<Integer> number =	Arrays.asList(num);
	
	number.stream().distinct().forEach(p->System.out.println(p));  //Prints distinct
	List<Integer> newnum =  number.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(newnum.get(3));
		
	}
	
	
}


//Assignmenty ==>  {3,2,2,7,5,1,9,7}
//Print unique number
//Sort the array
//give me the 3rd index