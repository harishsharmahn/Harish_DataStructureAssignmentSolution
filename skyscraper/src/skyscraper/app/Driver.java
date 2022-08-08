package skyscraper.app;
import java.util.Scanner;
import java.util.Stack;
import java.io.IOException;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Map;

import skyscraper.service.ConstructionOrder; 
public class Driver {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the total no of floors in the building");
		
		int noOfFloor = sc.nextInt();

	    int[] floors = new int[noOfFloor];
		
	   
		for(int i=0; i<noOfFloor; i++)  
		{  
		System.out.println("enter the floor size given on day : "+(i+1));
		floors[i] = sc.nextInt(); 
		}  
		System.out.println();
		
		ConstructionOrder service = new ConstructionOrder();
		service.printConstructionTable(floors, noOfFloor);
		sc.close();
	}
}
