// Fig. 4.6: GradeBook.java
 // GradeBook class that solves class-average problem using
 // counter-controlled repetition.
 import java.util.Scanner; // program uses class Scanner

  class GradeBook
 {
 private String courseName; // name of course this GradeBook represents
// constructor initializes courseName
 public GradeBook( String name )
 {
 courseName = name; // initializes courseName
 } // end constructor

 // method to set the course name
 public void setCourseName( String name )
 {
 courseName = name; // store the course name
 } // end method setCourseName

 // method to retrieve the course name
 public String getCourseName()
 {
 return courseName;
 } // end method getCourseName

 // display a welcome message to the GradeBook user
 public void displayMessage()
 {
 // getCourseName gets the name of the course
 System.out.printf( "Welcome to the grade book for\n%s!\n\n",
 getCourseName() );
 } // end method displayMessage

 // determine class average based on 10 grades entered by user
	public void determineClassAverage()
		{
 // create Scanner to obtain input from command window
 Scanner input = new Scanner( System.in );

 int total; // sum of grades entered by user
int gradeCounter; // number of the grade to be entered next
int grade; // grade value entered by user
 int average; // average of grades

 // initialization phase
 total = 0; // initialize total
gradeCounter = 1; // initialize loop counter
// processing phase uses counter-controlled repetition
 while ( ) // loop 10 times
{
 System.out.print( "Enter grade: " ); // prompt
 grade = input.nextInt(); // input next grade
 total = total + grade; // add grade to total
gradeCounter = gradeCounter + 1; // increment counter by 1
} // end while
// termination phase


 // display total and average of grades
 System.out.printf( "\nTotal of all 10 grades is %d\n", total );
 System.out.printf( "Class average is %d\n", average );
 } // end method determineClassAverage
 } // end class GradeBook


// Fig. 4.7: GradeBookTest.java
 // Create GradeBook object and invoke its determineClassAverage method.

 public class GradeBookTest1
 {
 public static void main( String[] args )
 {
 // create GradeBook object myGradeBook and
 // pass course name to constructor
 GradeBook myGradeBook = new GradeBook(
 "CS101 Introduction to Java Programming" );

 myGradeBook.displayMessage(); // display welcome message
myGradeBook.determineClassAverage(); // find average of 10 grades
} // end main
 } // end class GradeBookTest