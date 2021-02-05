package HospitalManagementSystem;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdullah
 */
public class Stockmanagement {

  private static String [] medname=new String[21];
  private static double [] medqty=new double[21];
  
  //for storing name once file is checked
  public static String [] a=new String[21];

     
     
     
// constructor 
    public Stockmanagement(String s,double n) {
    
        
        medname[0]="panadol";
        medname[1]="panadol extra";
        medname[2]="adol";
        medname[3]="brufen";
        medname[4]="aspirin";
        medname[5]="codeine";
        medname[6]="morphine";
        medname[7]="quinestar";
        medname[8]="doxylin";
        medname[9]="axomax";
        medname[10]="febrol";
        medname[11]="neubrol";
        medname[12]="doxy";
        medname[13]="iodex";
        medname[14]="hydrogen peroxide solution";
        medname[15]="piodine";
        medname[16]="prozac";
        medname[17]="zyprexa";
        medname[18]="cypralex";
        medname[19]="centrum";
        medname[20]="alive";
        
   
        readfile(s,n);
    }
    
    public static void writefile(){
         File file=new File("stock_count.txt");
         FileWriter fw=null;
        
      try {
          //try catch for file not found
          fw = new FileWriter(file, false);
      } catch (IOException ex) {
          Logger.getLogger(Stockmanagement.class.getName()).log(Level.SEVERE, null, ex);
      }
    
         PrintWriter pw = new PrintWriter(fw);
        
    //for writing in file
         for (  int i = 0; i < a.length; i++) {
            
             pw.println(a[i]+":"+medqty[i]);
        }
         
         pw.close();
    
    }
    
     public static void readfile(String s,double n){
        File file = new File("stock_count.txt");
        FileWriter FW = null;
        
        int i = 0;
        Scanner filescan = null;
            
        
        try  {

                filescan = new Scanner(file);

            //for reading and string manuplation    
                while (filescan.hasNext()) {
              
                    int space = 0;
                    String readfromfile = filescan.nextLine();
 
                     for (int z = 0; z < readfromfile.length(); z++){
                     
                         if (readfromfile.charAt(z) == ':'){ 
                             space = z;}
                     }
                     
                     
                    String name = readfromfile.substring(0, space); 
                    double qty = Double.parseDouble(readfromfile.substring(space+1, readfromfile.length()));
                    
                          
                    //storing values in a which has to be printed
                    if (s.equals(name)) {
                            a[i]=name; qty -= n;  medqty[i] = qty;  
                    }else{
                        a[i]=name;medqty[i]=qty;
                    }

                    i++;

     }
            //while loop ended    
            //writing in file    
                writefile();
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Stockmanagement.class.getName()).log(Level.SEVERE, null, ex);
                iffilenotfound();
            }
            
     }
    
    public static void iffilenotfound(){
        for(int j=0;j<medqty.length;j++){
           medqty[j]=100;
        }
    }
    
}
