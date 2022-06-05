/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project.managment.system;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class employee { 
    public boolean write (String query , String FilePath , boolean appendType)
    {
        PrintWriter writer = null;
        try
        {
          System.out.println("\n writing in : "+FilePath);
          writer = new PrintWriter(new FileWriter(new File (FilePath),appendType) );
          writer.println(query);
          System.out.println(".....done ...!");
          return true ;
        }
        catch(IOException e)
                {
                   System.out.println(e);
                }
        finally
        {
           writer.close();
        }
        return false;
    
    }
  
    //Creating properties of Employee class   
  String name, email; 
  private String password;
  int id, number_of_vacation=15;
  long startTime;
  long endTime;
  int penalities;
  String []seprated ;
      // red info from file 
  void readingInfo (String FilePath, int id,int c)
     {
         int i = 1;
        Scanner Reader= null;
    System.out.println("Reading from : "+FilePath);
        try {
            Reader =new Scanner(new File (FilePath));
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        
        while (Reader.hasNext()&& i<=c)
        {
          
          String Line = Reader . nextLine();
          
            seprated = Line.split("#");
          if(seprated[0].equals(this.id))
          {
              if(i==1)
              {
              setid(Integer.parseInt(seprated[0]));
              setName(seprated[1]);
              setEmail(seprated[2]);
              setPenalities(Integer.parseInt(seprated[0]));
              }
           else if (i==2)
           {
              String[] vac;
              vac = Line.split("#");
           }
            else if (i==3)
           {
              String[] task;
              task = Line.split("#");
           }
          }
          
          i++;
        }
          
        
        }

//Getter and setters for getting and setting properties  
public int getid() {  
    return id;  
}  
public void setid(int emp_id) {  
    this.id = id;  
}  
  
  
public String getName() {  
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
}  

public String getEmail() {  
    return email;  
}  
public void setEmail(String email) {  
    this.email = email;  
}  
public int  getPenalities (int penalities)
 {
    return penalities;
 }
 public void  setPenalities (int penalities)
 {
    this.penalities=penalities;
 }
//Overriding toString() method  
public String toString() {  
    return "Employee [id = " + id + ", name = " + name  + ", email = " + email + 
            ", penalities = " + penalities +"]";  
    }  
      

   
    
    // calculate  wrking hours 
    //enter start time 
    long WorkingHours (long startTime , long endTime)
    {
       this.startTime=startTime;
       this.endTime=endTime;
       long hours=((endTime-startTime)*7)*4;
        
     
     return hours;
    }
    
    // request a vaction 
    void  request_vacation (String reason, String FilePath )
    {
       
        write (reason , FilePath , false);
    }
    
    // view assigned tasks 
    void view_assigned_tasks( String FilePath)
    {
      readingInfo ( FilePath,id,3);
    }

    

   
}
