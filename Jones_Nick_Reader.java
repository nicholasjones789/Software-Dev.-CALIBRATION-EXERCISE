// Name: Nick Jones
// Software Developement
// Date: 8/25/2021
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Jones_Nick_Reader {
    public static void main(final String[] args) throws FileNotFoundException {

        Scanner keyboardReader = new Scanner(System.in);

        // asks user for input file name
        System.out.println("Enter the username: ");
        String userName = keyboardReader.next();

        // usernames stored into variables
        String userName1 = "davidbee"; 
        String userName2 = "Evan Callaghan"; 
        String userName3 = "Josue Chigwira"; 
        String userName4 = "Morgan Gant"; 
        String userName5 = "maddiee"; 
        String userName6 = "grant"; 
        String userName7 = "jacobh"; 
        String userName8 = "nick";
        String userName9 = "giddy_code"; 
        String userName10 = "nguyen"; 
        String userName11 = "craig"; 
        String userName13 = "jacobt"; 

        // conditions that list goals by username
        if (userName.equals(userName1)) {
             System.out.println("I am auditing this course to learn something I don't know, expand on, or enhance, some things I think I may know and get new perspectives by looking at things from other student's point of view.");
        }
        if (userName.equals(userName2)) {
            System.out.println("I want to gain a broad understanding of software development, learn how it is implemented in the real world, and learn how it can be applied in the field of data analytics. In addition to this, I aim to gain programming experience and improve upon soft skills such as communication and working as a member of a team.");
        }
        if (userName.equals(userName3)) {
            System.out.println("My goal is to be able to write software at the end of this semester. I also want to learn new things about software that I do not currently know, like what languages are easy to use to write software.");
        }
        if (userName.equals(userName4)) {
            System.out.println("I want to gain a basic understanding of what Sofware development in, how software's differ from each other and when to use a certain software and be able to compare it to Data Science. I learned this summer that as a Data Scientist it's important to know a little about each role on your team so this class will help me in the future when teamwork is needed! ");  
        }
        if (userName.equals(userName5)) {
            System.out.println("My goal statement is I want to build up my team working and communication skills. I also want to be able to use what I've learned from this class in interviews and future careers.");
        }
        if (userName.equals(userName6)) {
            System.out.println("By the end of the semester, I hope to understand all the topics that were covered in the class and expand my knowledge and skills in software development and coding so I can be prepared to be successful as I go on in my major and onto a career.");
        }
        if (userName.equals(userName7)) {
            System.out.println("In this class, I would like to become more confident with the software development process. I want to gain proficiency in timing my tasks and better judging how to divide up my work. I want to develop good actionable tasks with clear success criteria. Additionally, I want to increase my teamwork and communication skills. I would also like to get better at testing my programs. In the end, I would like to just be overall better and more confident in my work");
        }
        if (userName.equals(userName8)) {
            System.out.println("Learn to independently develope a basic program, apply myself, and meet one other person.");
        }
        if (userName.equals(userName9)) {
            System.out.println("As far as this class is concerned, success for me will be to successfully achieve the goals of this class, which are to be conversant with software development concepts and practically being able to apply what I have learned in the real world, and of course, to pass with flying colors");
        }
        if (userName.equals(userName10)) {
            System.out.println("I'm Jackson Nguyen, my goal statement for the class is to be able to write the most basic software, not giving up when solving problems especially when it come to writing code, improve teamwork and communication between each other and be able to define and breaking down tasks into subtasks to help me understand it better, to do it better. ");
        }
        if (userName.equals(userName11)) {
            System.out.println("I want to learn more about the software development process and gain more confidence in my programming abilities. I would also like to continue to work on my problem-solving and time management skills. After this course, I want to be able to create, maintain, and improve personal projects that I will feel proud of.");
        }
        if (userName.equals(userName13)) {
            System.out.println("I hope to learn a bunch of new skills and information and apply that knowledge into future circumstances. Also, I wish to not stress out over the class if I am confused on something I don’t know.");
        }        

        // asks for the week number
        System.out.println("Enter the week number: ");
        int weekNumber = keyboardReader.nextInt();

        // conditions based on week number that displays date of that monday
        if (weekNumber == 1) {
            System.out.println("8/23");
        }
        if (weekNumber == 2) {
            System.out.println("8/30");
        }
        if (weekNumber == 3) {
            System.out.println("9/6");
        }
        if (weekNumber == 4) {
            System.out.println("9/13");
        }
        if (weekNumber == 5) {
            System.out.println("9/20");
        }
        if (weekNumber == 6) {
            System.out.println("9/27");
        }
        if (weekNumber == 7) {
            System.out.println("10/4");
        }
        if (weekNumber == 8) {
            System.out.println("10/11");
        }
        if (weekNumber == 9) {
            System.out.println("10/18");
        }
        if (weekNumber == 10) {
            System.out.println("10/25");
        }
        if (weekNumber == 11) {
            System.out.println("11/1");
        }
        if (weekNumber == 12) {
            System.out.println("11/8");
        }
        if (weekNumber == 13) {
            System.out.println("11/15");
        }
        if (weekNumber == 14) {
            System.out.println("11/22");
        }
        if (weekNumber == 15) {
            System.out.println("11/29");
        }

        keyboardReader.close();
    } // end main
} // end class
