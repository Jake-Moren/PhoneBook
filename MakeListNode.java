// Programmer: Jake Moren
// Class: CS 145 OL
// Date: 04/27/2023
// Assignment 1: Phone Book  
// Reference Material: CS145 Week 4 lecture videos 
import java.util.*; 
//program imports the scanner from the library
import java.util.Scanner; 
public class MakeListNode
/*
Class purpose statement: 
The purpose of this class is to give the core needs to make the list nodes, 
I also ended up having some of the methods to edit the nodes in this class. To 
make the nodes you also need to be able traverse the node links path to move 
from node to node. I also worked on the printing of each node through this class. 
*/
{//start of the MakeListNode class 
   
   private String firstName; 
   private String lastName; 
   private String homeAddress; 
   private String phoneNumber; 
   protected MakeListNode next;
   private Scanner userInput = new Scanner(System.in);
   //making the class attributes the variables that are going to be stored in my linked list
   //We will also be using the scanner input to ask questions and take inputs  

   public MakeListNode(String[] newContactInfo, MakeListNode nextNode)
   {//start of constructor method
      this.firstName = newContactInfo[0]; 
      this.lastName = newContactInfo[1];
      this.homeAddress = newContactInfo[2];
      this.phoneNumber = newContactInfo[3];
      this.next = nextNode; 
   }//end of MakeListNode method  
   //this is the creating of the node by assigning the variables defined in the
   //class attributes to a specif index in a arrays then setting the data value to next
   //to allow the linked list to exist
   
   public void linkNode(MakeListNode nextNode)
   {//start of linkNode method
      this.next = nextNode; 
   }//end of linkNode method
   //this method is passing in the makelistnode and next node to set the new node as next 
   //(this is how the nodes are able to be linked). When the new node is next 
   //it makes a clear path form node to node and there for "linked" 
   
   public String toString()
   {//start of toString method
      String format = "FirstName: " + this.firstName + ", LastName: " + this.lastName +
      ", Address: " + this.homeAddress + ", Phone Number: " + this.phoneNumber;
      return format; 
   }//end of toString method
   
   /* This is the toString method to print out the contacts we are using the class 
   variables and adding them to the what they represent and print it out to the console */ 
   
   public String giveSterilizedName()
   {//start of giveSterilizedName
      String fullName = this.firstName + this.lastName; 
      return fullName.toLowerCase(); 
   }//end of givesterilizedName
   /* This method is to take the first name and last name and turn it into a variable 
   full name the full name also has no capital letters and no spaces, this is done for ease
   of the computer and for the user. When the computer is comparing and passing it will make it 
   less likely to break the code. */
   
   public  void rewriteFirstName()
   {//start of rewrite last name 
      System.out.println("What would you like the new first name to be?");
      String userAnswer = userInput.nextLine();
      this.firstName = userAnswer; 
   //take input and assinet it to the userinput 
   }//end of rewriteFirstName method
   /* I was thinking of setting accessign the array and re assigning the name 
   by setting it equal to the new input essentially changing its value that way 
   I did not get to adding this into my code. */ 
   
   public void rewriteLastName()
   {//start of rewriteLastName method
   System.out.println("What last name would you like to change?");
   
   System.out.println("What would you like the new last name to be?");
   
   }//end of rewriteLastName method 
   
   public void rewriteAddress()
   {//start of rewriteAddress
   System.out.println("What address would you like to would you like to change?");
   
   System.out.println("What would you like to be the new address?");
   
   }//end of rewriteAddress 
   
   
   public void rewritePhoneNumber()
   {//start of rewritePhoneNumber method
   System.out.println("What phone number would you like to change?");
   
   System.out.println("What would you like the new phone number to be?");
   
   }//end of rewritePhoneNumber method
   /* I did not get around to working out an edit method you can see the direction
   I was heading in with my name change method. */
}//end of  MakeListNode class

//make an indvidual node
//list management to change and move nodes add more nodes/remove nodes
