/**
 * This is a ContactList class
 * @author Yanshen Lin
 * ISTE-120-03
 * Homework 13
 * @version 1.0
*/

import java.util.*;
import java.io.*;

public class ContactList
{
   /**
   Contact list file name 
   */
   private String filename;
   
   /**
   ContactList constructor accepts a String parameter
   */
   public ContactList(String inFileName)
   {
      filename = inFileName;
   }
   
   /**
      3) add a new record to the file. Open the file for writing in append mode(there is a FileWriter constructor with the appropriate parameters).
         a) prompt the user to enter data for each field in the record. Each field is a String.
            The last name is required. If the last name is the empty string(""), return to the menu.
         b) when the user has completed entering data(i.e., all the fields have been prompted), re-display the user choices
         c) do not overwrite existing data
   */
   public void new_record()
   {
    /*
      Prompt for data:
         Last name
         First name
         Phone
    */
    
      //Craete a scanner object
      Scanner kb = new Scanner(System.in);
      
      //prompt for the last name
      System.out.print("Last name: ");
      
      //input the last name
      String lastName = kb.nextLine();
      
      //the Last_name must not be empty
       if(lastName.length() >  0 )
       {
         //get the first name and the phone
         System.out.print("First name: ");
         String firstName = kb.nextLine();
         
         System.out.print("Phone: ");
         String phone = kb.nextLine(); 
          
          
          
          //create the output string
          
          
          
          
          //delare variables to hold file types
          FileWriter fWrite = null;
          
          //try to open the file for writing - append the data
          try
          {
            fWrite = new FileWriter(new File(filename), true);
            
          }
          catch(IOException ioe)
          {
            System.out.println("new_record: Exception opening the file for writing");
          }
          //try to wrtie the data
          try
          {
            fWrite.write(lastName + "," + firstName + "," + phone + "\n");
            
          }
          catch(IOException ioe)
          {
            System.out.println("new_record: Exception writing to the file");
          }
          //try to close the file
          try
          {
             fWrite.close();
             
          }
          catch(IOException ioe)
          {
            System.out.println("new_record: Exception closing the file");
          }
          
       }//end of test of Last_name
    
    }//end of new_record
    
    /**
    2) display all last names and first names in the file. 
    Open the file for reading, read each record and 
    display the field values.
      a) display all the lastName, firstName paired fields in the file; 
      display with the format lastName, firstName
      b) when all records have been displayed, display the record count  - the record count is the number of records read and should equal the number of records in the file
      c) after all the records and the count have been displayed, display the user choices
      
    */
    public void display_names()
    {
      //delare variables to hold file types
      BufferedReader br = null;
      
      
      //try to open the file for reading
      try
      {
        br = new BufferedReader(new FileReader(filename));  
         
      }
      catch(IOException ioe)
      {
         System.out.println("display_names: Exception opening the file");
      }
      /*
      try to read each record and display the field values.
      a) display all the lastName, firstName paired fields in the file; 
      display with the format lastName, firstName
      count each record that is read 
      */
      int counter = 0; //record counter
      try
      {
         //read the first record
         String line = br.readLine();
         //while the record is not null, display the record, count the record
         while(line != null)
         {
          System.out.print("\n" + line);
          counter += 1;
          line = br.readLine();
         }
         System.out.println("\n\nTotal records read: " + counter);
         
         
         
      }
      catch(IOException ioe)
      {
         System.out.println("display_names: Exception reading the file");
      }
      
      //try to close the file
      try
      {
       br.close();  
         
      }
      catch(IOException ioe)
      {
         System.out.println("display_names: Exception closing the file");
      }
      //dislay a count of the records read
      
    }//end of display_names
    
        /**
          1) search an address file for a particular last name 
          and then display the Last name, the first name, and 
          the phone for each match
          2) display the count of records which match the last name
   
       */
    public void search(String LastName)
    {
      //delare variables to hold file types
      BufferedReader fIn = null;
      
      //try to open the file for reading
      try
      {
       fIn = new BufferedReader(new FileReader(filename));  
         
      }
      catch(IOException ioe)
      {
         System.out.println("search: Exception opening the file");
      }
      
      //try to read each record
      //if the value of the Last_name field equals the value
      /*
        create a counter to count the number of
        matching records
      */
      int counter = 0;
      
      try
      {
         //read the first record
         String line = fIn.readLine();
         
         //while the record is not null
            //split the record into fields
            //test if the field equals the LastName parameter
               //display the record and increment the counter
            //read the next record
         while(line != null)
         {
          String[] info = line.split(",");
          String last = info[0];
          if(last.equals(LastName))
          {
           System.out.print(line);
           counter += 1;
          }
          else
          {
           line = fIn.readLine();
           System.out.print(line);
           counter += 1;
          }
          line = fIn.readLine();
         }
         System.out.println("\nTotal matching records found: " + counter + "\n");
         
         
      }
      catch(IOException ioe)
      {
         System.out.println("search: Exception reading the file");
      }

      // try to close the file
      try
      {
        fIn.close(); 
         
      }
      catch(IOException ioe)
      {
         System.out.println("search: Exception closing the file");
      }
      
      //dislay a count of the records found
      
      
    }//end of search

}//end of class