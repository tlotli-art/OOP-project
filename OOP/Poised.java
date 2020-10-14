import java.util.Scanner;
public class Poised {
	
	// main method
	public static void main(String[] args) {
		
		
		// Object for Project
		Project riverView = new Project(8, "River View", "Apartment block", "622  Plein Str\n\t\tCape Town\n\t\tWestern Cape", 938, 60000000, 38000000, "23-08-2022");
		
		
		// Print out the string from method from Project class together with object parameters  
		System.out.println("\nProject\n");
	    System.out.println(riverView + "\n");
	    
	    
	    // Object for person
	    Person architect = new Person("Charles ward", "+27-555-3309-235", "charles@poised.com", "2714  Boundary Street\n\t\tCape Town\n\t\tWestern Cape");
	   
	    
	    // Print out the string from method from Person class together with object parameters
	    System.out.println("\nArchitect\n");
	    System.out.println(architect);
	    
	    
	    // Object for person
	    Person contractor = new Person("Chet L Mattson", "+27-83-6359-573", "chet@quehuongta.com", "1094  Grove Street\n\t\tCape Town\n\t\tWestern Cape");
	    
	    // Print out the string from method from Person class together with object parameters
	    System.out.println("\nContractor\n");
	    System.out.println(contractor);
	    
	    
	    // Object for person
	    Person customer = new Person("Anne T Karp", "+27-82-4259-543", "anne@glacia.com", "1094  4804  Gorby Lane\n\t\tEast London\n\t\tEastern Cape");
	    
	    // Print out the string from method from Person class together with object parameters
	    System.out.println("\nCustomer\n");
	    System.out.println(customer);
	    
	    
	    
	    // Scanner to read user inputs
	    try (Scanner edit = new Scanner(System.in)) {
			
	    // Display instruction for user and read user input	
	    System.out.print("\nEnter '1' to edit ");
		String choice = edit.nextLine();
			
		
		// If user chooses option, display other instruction for user and read user input
		if(choice.equals("1") ) {
			System.out.println("\nEnter '1' to edit 'Due date'\nEnter '2' to edit 'amount paid'\nEnter '3' to edit 'Contractors Details' " );
			String option = edit.nextLine();
			
			
		// If user chooses this option, display other instruction for user and read user input	
		if(option.equals("1")) {
			System.out.print("\nEnter new date: ");
			String new_date = edit.nextLine();
			
		// Replace the date with the user input on new object and display it	
		Project riverView1 = new Project(8, "River View", "Apartment block", "622  Plein Str\n\t\tCape Town\n\t\tWestern Cape", 938, 60000000, 3800000, new_date);
		System.out.println("Project\n");
		System.out.println(riverView1 + "\n");	
			
		
		
			// If user chooses this option display other instruction for user and read user input
			}else if(option.equals("2")) {
				System.out.print("Enter new Total amount paid: ");
				String new_total = edit.nextLine();
				
				// convert user input to a Long data type
				long total1 = Long.parseLong(new_total);
				
				// replace the total payed in the object with user input and display it 
				Project riverView2 = new Project(8, "River View", "Apartment block", "622  Plein Str\n\t\tCape Town\n\t\tWestern Cape", 938, 60000000, total1, "23-08-2022");
				System.out.println("Project\n");
				System.out.println(riverView2 + "\n");

				
				// If user chooses this option display other instruction for user and read user input
				}else if(option.equals("3")) {
					System.out.println("Enter Contractor's name: ");
					String name3 = edit.nextLine();
					
					
					// instruct user to enter telephone number and read it
					System.out.println("Enter Contractor's Telephone number: ");
					String tel = edit.nextLine();
					
					// instruct user to enter email and read it
					System.out.println("Enter Contractor's email address: ");
					String email = edit.nextLine();
					
					// instruct user to enter physical address and read it
					System.out.println("Enter Contractor's Physical address: ");
					String address = edit.nextLine();
					
					// replace the object with what user has entered and print it
					Person contractor3 = new Person(name3, tel, email, address);
					System.out.println("\nContractor\n");
					System.out.println(contractor3);
					
				}
				
				
			}
		}
	    
	   
	}

}
