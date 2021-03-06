import java.util.Comparator;

// Assignment #: Arizona State University CSE205 #8
//         Name: Wyatt Colyn
//    StudentID: 121-547-4364
//      Lecture: TTh 4:30 - 5:45 p.m
//  Description: sorts by category and name
public class CategAndNameComparator implements Comparator<Food>
{

	 public int compare(Food first, Food second)
	 {
		 String id1 = first.getCategory();
		 String id2 = second.getCategory();
		 String name1 = first.getName();
		 String name2 = second.getName();
		 if(id1.compareTo(id2) > 0)
			 return 1;
		 if(id1.compareTo(id2) < 0)
			 return -1;
		 if(id1.compareTo(id2) == 0)
		 {
			 if(name1.compareTo(name2) > 0)
				 return 1;
			 if(name1.compareTo(name2) < 0)
				 return -1;
			 if(name1.compareTo(name2) == 0)
				 return 0;
		 }
			 
		 return 0;
	 }
}