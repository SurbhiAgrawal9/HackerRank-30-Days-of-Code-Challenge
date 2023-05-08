import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    Student(String firstName, String lastName,int identification, int testscores[]){
        super(firstName, lastName,identification);
        this.testScores =testscores; 
    }
    
        char grading;
        
    public char calculate()
    {
        int sum =0;
        for(int i=0;i<testScores.length;i++){
            sum = sum + testScores[i];
        }
        int avg = sum/testScores.length;
        
        
        if(avg>=90 && avg<=100)
        {
            
            grading = 'O';
        } else if(avg>=80 && avg<90)
        {
            grading = 'E';
        }   if(avg>=70 && avg < 80)
        {
            grading = 'A';
        }   if(avg>= 55 && avg<70)
        {
            grading = 'P';
        }   if(avg>=40 && avg<55)
        {
            grading = 'D';
         } if(avg<40) {
                grading = 'T';
         }
             
             return grading;
        
            
            
        }
    
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}
