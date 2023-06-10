// Programmer: Jake Moren
// Class: CS 145 OL
// Date: 04/27/2023
// Assignment 1: Phone Book  
// Reference Material: CS145 Week 4 lecture videos
//extra credit to allow them to input the word or number to select
/*
Assingment purpose: The purpose of this assignment is to get more experience
using linked lists and making our own linked list. In this assignment we will
be making a phone book to allow the user to add, delete, search, and view contacts
in the phone book. The phone book should be different nodes that are linked together 
to make a the phone book. 
*/ 
import java.util.*; 
//program imports the scanner from the library
import java.util.Scanner; 
public class PhoneBookMain
{//start of the PhoneBookMain class
   public static void main(String[]args)

//public is an access modifier
   {//start of main method
     Scanner scannerObject = new Scanner(System.in);
     
     ListManagement BellinghamPhonebook = new ListManagement("Bellingham");
     /*initializing Phonebook contacts
     
     instatiating a new listmanagment and naming it Bellingham phone book
     we need to have the list management constructore method in this class
     becasue we are altering teh nodes with inputs ran off this class. 
      
     first name last name home address phone number */
     
     /*
     String[] contactInfo1 = {"Jason", "Borne", "409 Dog Wood", "360-354-8863"};
     MakeListNode node1 = new MakeListNode(contactInfo1, null); 
     String[] contactInfo2 = {"Michael","Jackson","HollyWood Blvd", "809-794-8575"};
     MakeListNode node2 = new MakeListNode(contactInfo2, null);
     String[] contactInfo3 = {"Steven","Shoestein","Vince Loop","425-645-9900"};
     MakeListNode node3 = new MakeListNode(contactInfo3, null);
     
     BellinghamPhonebook.addToEnd(node1); 
     BellinghamPhonebook.addToEnd(node2); 
     BellinghamPhonebook.addToEnd(node3); 
      
     -this was used for testing puproses to populate a few contacts right off the bat feel
     free to use this if you would like to-  
     */
     

    instructions();
    //this is printing out the instructions which acts as the menu of options for the user 
    
    System.out.println("please enter a command"); 
    String userAnswer = inputLoop(scannerObject, BellinghamPhonebook)
    .toLowerCase().replaceAll("\\s", "");
    while(!userAnswer.equals("quit") && !userAnswer.equals("0"))
      {//start of while loop
      System.out.println("please enter a command"); 
      userAnswer = inputLoop(scannerObject, BellinghamPhonebook)
      .toLowerCase().replaceAll("\\s", "");
      }//end of while loop   
   }//end of main method 
   
   /*
   The main method is responsible for printing out the menu that the user will be using for
   the phone book. This method shows the menu and asks the quesion what command would you 
   like to do. The users response will be saved in a variable callsed userInput that will 
   be used later in our switch case to pick out what actions are had. This method also holds a
   while loop that will loop through these options until the user inputs a 0 or a quit 
   top end the phone book program. 
   */ 
   
   public static String inputLoop(Scanner scannerObject, ListManagement BellinghamPhonebook)
   {//start of inputLoop method 
      String userAnswer = scannerObject.nextLine(); 
      while(!checkUserInput(userAnswer.toLowerCase().replaceAll("\\s", ""), BellinghamPhonebook))
      {//start of while loop
         userAnswer = scannerObject.nextLine(); 
      }//end of while loop   
      return userAnswer; 
   }//end of inputLoop method
   /*
   The inputLoop works by passing in the scanner object and the bellinghamPhonebook to 
   essentially test the input and to loop until the checkUserAnswer(different method coming up)
   comes up as a zero and end the loop. 
   */   
   
   public static void instructions()
   {//start of instructions method 
      System.out.println(" 1 - Add ");
      System.out.println(" 2 - Delete");
      System.out.println(" 3 - View Contacts");
      System.out.println(" 4 - Name Search");
      System.out.println(" 5 - Address Search");
      System.out.println(" 6 - Phone Number Search");
      System.out.println(" 7 - Edit Name ");
      System.out.println(" 8 - Edit Adress");
      System.out.println(" 9 - Edit Phone Number");
      System.out.println(" 0 - Quit");
   }//end of instructions method
   
 //I just used a set of println statement to just print oout the menu options in the instructions
      
   public static boolean checkUserInput(String userInput, ListManagement BellinghamPhonebook)
   {//start of checkUserInput 
      switch(userInput)
      {//start of switch case 
         case "1":
         case "add":
            //add to front 
            //add to end 
            //add to an index 
            //do something in the body 
            BellinghamPhonebook.addNode(); 
     
            return true; 
         case "2":
         case "delete":
            BellinghamPhonebook.delete(); 
            return true;   
         
         case "3":
         case "viewcontacts":
            BellinghamPhonebook.toString(); 
            return true;
            
         case "4":
         case "namesearch":
         //search();
            return true;
            
         case "5":
         case "addresssearch":
         //search();
            return true;
            
         case "6":
         case "phonenumbersearch":
         //search();
            return true;
            
         case "7":
         case "editname":
         //rewriteFirstName();
         //rewriteLastName();
            return true;
            
         case "8":
         case "editaddress":
         //rewriteAddress(); 
            return true;
            
         case "9":
         case "editphonenumber":
         //rewritePhoneNumver();    
            return true;
         
         case "0":
         case "quit":
         //this will cause the code switch to end and the program will end   
            return true; 
         default: 
            System.out.println("This isn't a valid input! Please type a valid command");
            return false; 
      /*
      In this method I am comparing the user input and passing it into the switch case. This 
      is telling the computer what it needs to do based off what the user inputs. I passed in the
      users input and the list manager because the methods will be used to change the phone book 
      are stored in the listmanager class. The computer also needs to know the users input so it 
      can pass a specific value into the switch case. 
      */
      
      }//end of switch case 
   }//end of check user input method  
}//end of PhoneBookMain