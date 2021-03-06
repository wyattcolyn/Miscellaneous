import java.util.ArrayList;
import java.util.Comparator;

// Assignment #: Arizona State University CSE205 #8
//         Name: Wyatt Colyn
//    StudentID: 121-547-4364
//      Lecture: TTh 4:30 - 5:45 p.m
//  Description: A comparator is passed in and an arraylist is sorted accordingly
public class Sorts {

	public static void sort(ArrayList<Food> foodList, Comparator<Food> xComparator)
	{
		Food temp;
		
		for(int i = 0; i < (foodList.size()-1); i++)
				{
			for(int j = (i+1); j < foodList.size(); j++)
			{
				if (xComparator.compare(foodList.get(i),foodList.get(j)) == 1)
				{
					temp = foodList.get(i);
					foodList.set(i,foodList.get(j));
					foodList.set(j, temp);
				}
			}
				}
	}
}