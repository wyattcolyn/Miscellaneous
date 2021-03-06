import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

// Assignment #: Arizona State University CSE205 #8
//         Name: Wyatt Colyn
//    StudentID: 121-547-4364
//      Lecture: TTh 4:30 - 5:45 p.m
//  Description: This class implements several functionalities for the GroceryStore 
public class GroceryStore implements Serializable{

	ArrayList<Food> foodList;

public GroceryStore()
{
	foodList = new ArrayList<Food>();
}

public int idExists(int foodId)																
{																							
	for(int i=0;i<foodList.size();i++)			
	{
		if(foodId == foodList.get(i).getId())
			return 1;
	}
	return -1;
}
public int categAndNameExists(String nCategory, String nName)
{     					  		
																												 
	for(int i=0;i<foodList.size();i++)			
	{
		if(foodList.get(i).getCategory().equals(nCategory) && foodList.get(i).getName().equals(nName))
			return 1;
	}
	return -1;																																									
}
public boolean addFoodById(String category, String name, int id)
{			
	for(int i=0;i<foodList.size();i++)
	{
		if(foodList.get(i).getId() == id)
		return false;
	}				
	Food food1 = new Food(category, name, id);
	foodList.add(food1);
	return true;																							
}
public boolean removeById(int id)	
{
	for(int i=0;i<foodList.size();i++)
	{
		if(foodList.get(i).getId() == id)
		{
		foodList.remove(i);
		return true;
		}
	}
	return false;																																			
}
public boolean removeByCategAndName(String category, String name)
{
	for(int i=0;i<foodList.size();i++)
	{
		if(foodList.get(i).getCategory().equals(category) && foodList.get(i).getName().equals(name))
		{
		foodList.remove(i);
		return true;
		}
	}
	return false;																						
}
public void sortByCategAndName()
{
	CategAndNameComparator can = new CategAndNameComparator();		
	//Collections.sort(foodList, can);
	Sorts.sort(foodList, can);
																								
}
public void sortById()
{
	IdComparator idc = new IdComparator();	
	//Collections.sort(foodList, idc);
	Sorts.sort(foodList, idc);
}
public String listFood()
{
	for(int i=0;i<foodList.size();i++)
		System.out.println("Category: " + foodList.get(i).getCategory() + "\t\tName: " + foodList.get(i).getName() + "\t\tID: " + foodList.get(i).getId());
	return "";					
	    //System.out.println("Category: " + foodList.get(foodList.size()-1).getCategory() + "\t\tName: " + foodList.get(foodList.size()-1).getName() + "\t\tID: " + foodList.get(foodList.size()-1).getId());
}																																
public void closeGroceryStore()
{
	foodList.clear();																						 
}
}