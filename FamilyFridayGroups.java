import java.util.*;

/***FamilyFridays Groups
 * Input:  list of names 
 * Output: Return list of Groups between 3 and 5 people each
 * @author amaha
 *
 */
public class FamilyFridayGroups {

	/**
	 * createGroups
	 * Create groups from the given list of names
	 * @param names
	 * @return groupList
	 */
	static ArrayList createGroups(LinkedList<String> names) {
		

		ArrayList<Collection> groupList = new ArrayList<>();  //List of groups
		ArrayList<String> groups = new ArrayList<>(); //Group of names
		int ctr = 0;
		
		ListIterator iterator = names.listIterator();
		
		System.out.println("names : " + names);
		
		while (iterator.hasNext()) {

		
			if (ctr <= 5) {
				String nm = iterator.next().toString();
				System.out.println("name: " + nm);
				groups.add(nm);
				ctr++;
				
			} //end if
			
			if (ctr > 4 || (!iterator.hasNext())) {
				System.out.println(groups.toString());
				groupList.add(groups);
				groups = new ArrayList<>();
			    ctr = 0;
			    
			} //end if
			
			
		} //end of while
		
		return groupList;   //return list of Groups
		
	} //end of createGroups()
	
	
	public static void main(String[] args) {

		LinkedList<String> names = new LinkedList<>();
		ArrayList<Collection> listofGroups = new ArrayList();
		
		//Add names to the list
		names.add("Evan");
		names.add("Isaac");
		names.add("Lakshmi");
		names.add("Ana");
		names.add("Jamie");
		names.add("abc");
		names.add("def");
		
		//Create Groups from the names
		listofGroups = createGroups(names);
		
		//Display groups with collection of names
		ListIterator iter = listofGroups.listIterator();
		int i = 1;
		while (iter.hasNext()) {
			System.out.println("Group " + i + ": " + iter.next());
			i++;
			
		} //end of while
		
		
		//System.out.println("Groups: " + listofGroups);
		
		
		
		
	} //end of main()
	

	
	
	
} //end of FamilyFridayGroups class
