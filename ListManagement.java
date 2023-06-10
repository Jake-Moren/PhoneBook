// Programmer: Jake Moren
// Class: CS 145 OL
// Date: 04/27/2023
// Assignment 1: Phone Book  
// Reference Material: CS145 Week 4 lecture videos 
import java.util.*; 
//program imports the scanner from the library
import java.util.Scanner; 
public class ListManagement
/* Class purpose: The purpose of this class is to house the methods that will
be altering and changing the list. This is the list management class. */
{//start of the ListManagement class 
   private String name; 
   private MakeListNode front; 
   private Scanner scannerObject = new Scanner(System.in); 
   //we will be using the list node front to get location of the list
   //we also have the attribute string name 
   public ListManagement(String name)
   {//start of listManagement constructor method 
      this.front = null;//setting front to null 
      this.name = name; //setting this name to varible name
   }//end of constructor method
   //no return because this is the constructor method
   //method to set place in the list (neutral beginning)  
   
   public void addNode()
   {//start of addNode method
      MakeListNode newNode = new MakeListNode(gatherNodeInfo(), null); //an isolated node  
      if(this.front == null)
      {//start of if statement
         //if the phonebook is empty, we make the first node this new node 
         this.front = newNode; 
      }//end of if statement
      else
      {//start of else statement
         addToFront(newNode); 
      }//end of else statement 
   }//end of addNode method 
   /*This is making a new node and then gather the info. (asking all the quesitons to add
   a new contact to the list) then the node is added to the front by setting the front node
   to value of next of the just created node. */
   
   protected void addToEnd(MakeListNode newNode)
   {//start of addToEnd method 
      MakeListNode currentNode = this.front; 
      if(currentNode == null)
      {//start of if statement 
         this.front = newNode; 
      }//end of if statement
      else
      {//start of else statement
         while(currentNode.next != null)
         {//start of while statement 
            currentNode = currentNode.next; 
         }//end of shile statement
         currentNode.next = newNode; 
      }//end of else statement
   }//end of addToEnd method  
   /* This is a similar to the add method, this method just has some additional
   traversing to do through the list. we can see that if current node is equal to nuu
   or the last node then make that node point next to the node that was just created */
   
   private void addToFront(MakeListNode newNode)
   {//start of addToFront method 
      newNode.next = this.front; 
      this.front = newNode; 
   }//end of addToFront method
   //this one is simpler becasue we are just assigning the new note to be the front of the list
   //we passed in the new node method that we are using earlier in the MakeListNode class. 
   
   private String[] gatherNodeInfo()
   {//start of gatherNodeInfo
      System.out.println("first name: "); 
      String firstName = scannerObject.nextLine(); 
      System.out.println("last name: "); 
      String lastName = scannerObject.nextLine();
      System.out.println("home address: "); 
      String homeAddress = scannerObject.nextLine();
      System.out.println("phone number: "); 
      String phoneNumber = scannerObject.nextLine();
      String[] nodeInfo = {firstName, lastName, homeAddress, phoneNumber};
      return nodeInfo; 
   }//end of gatherNodeInfo 
   /* This is a series of print statements and system.ins to take in the user input
   on several questions and save them under a variable that represents the input.
   Then when all of teh data fields are filled in they are assembled into 
   an array named nodeInfo. This is waht will be returned and printed out when this viewed*/ 
   
   //lookForNode("Batman Robin");
   public MakeListNode nodeNameSearch(String name)
   {//start of nodeNameSearch
      System.out.println("What Name would you like to look at?");
      String userInput = scannerObject.nextLine();     
      String targetName = userInput.toLowerCase().replaceAll("\\s", ""); 
      return null; 
   }//end of nodeNameSearch 
   //method to pass in the name of contact and it would be stored and used to perform 
   //a search for the contact then the index of the array could be used to pull out specifics
   //pull address, phone number, and more
   
   public String toString()
   {//start of toString method 
      MakeListNode currentNode = this.front; 
      if(currentNode == null)
      {//check if phonebook is empty 
         System.out.println("empty phoneBook!");
      }//end of if statement
      while(currentNode != null )
      {//start of while statement
         System.out.println(currentNode.toString()); 
         currentNode = currentNode.next; //this evalates to null 
      }//end of while statement
      return ""; 
   }//end of toString method 
   /* This method uses an if statement and a while loop to print out the phone book, 
   it uses an if statemetn to see if the first node is null and if it is then the 
   book is empty and if the book has a next then it will continue to print out
   to the end of the book.*/

   public void delete()
   {//start of method to delete       
      System.out.println("What is the name of the node you wish to delete?"); 
      String targetName = scannerObject.nextLine().toLowerCase().replaceAll("\\s", ""); 
      //take teh name of the contact that wants to be deleted 
      //input is stored under target name is stored with no spaces and no caps
      MakeListNode currentNode = this.front; 
      if(currentNode != null)
      {//start of if statement
         if(currentNode.giveSterilizedName().equals(targetName))
         {//deleting if targetNode is this.front;this is a nested if statement 
            //severing the tie
            this.front = currentNode.next; 
            currentNode.next = null; 
         }//end of nested if statement
         else
         {//start of else statement
           while(currentNode.next != null)
           {//start of while loop
               if(currentNode.next.giveSterilizedName().equals(targetName))
               {//we've found the target node start of the nested if statement
                  MakeListNode targetNode = currentNode.next; 
                  MakeListNode newLink = targetNode.next; 
                  //severing the tie 
                  targetNode.next = null; 
                  currentNode.next = newLink; 
               }//end of nested if statement
               else
               {//start of nested else statement
                  currentNode = currentNode.next; //traverse the linked list. 
               }//end of else statement  
            }//end of while loop
         }//end of else statement
      }//end of initial if statement
      else
      {//start of else statement
         System.out.println("the linked list is empty"); 
      }//end of else statement 
   }//end of delete method 
   /* This method takes the target input or the name that is going to be deleted 
   and looks throught the list to find it. The code doest this through a series of 
   if then statements and a while loop. The first if statement is if the current
   node is not equal to null then continue. In other words this is saying if 
   there is any thing in the phone book then continue. If there is a node then it will
   compare the target name (user input) to the name. If they match then  it will set 
   the node before it to null, this will sever tie and it will no longer populate. */
  
  
  /* public void search() 
   {//start of search method 
      System.out.println("What is the name of the node you wish to search?"); 
      String targetName = scannerObject.nextLine().toLowerCase().replaceAll("\\s", "");
      while(currentNode.next != null)
      {//start of while loop
               if(currentNode.next.giveSterilizedName().equals(targetName))
               {//start of if statement
               System.out.println(currentNode);
               }//end of if statement
      }//end of while loop
   }//end of search method 
   
   I commented this out because I could not get the search aspect to work for this assignment.
   I was thinking for the name that they wanted to display when they pass in the the name 
   I would save it as a variable then use it in a while loop to compare it to the nodes,
   that are expected to hold the name. Then when the the while loop matches the user input 
   and the node then to print out the toStrng of said list.  
   */
   
}//end of ListManagement class