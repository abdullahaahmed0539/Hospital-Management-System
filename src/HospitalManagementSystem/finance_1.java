package HospitalManagementSystem;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Abdullah
 */
public class finance_1{
    public static void finances(String s , String y){
    
        switch(s){
            case "medicine: ":
                stockfinances(y);
                totalfinances(s,y);
                break;
            case "appointment: ":
                appointmentfinances(y);
                totalfinances(s,y);
                break;
              
                
        }
    }    
        
        public static void stockfinances(String y){
         File file=new File("stockfinance.txt");
         FileWriter fw=null;
         try
        {
        fw = new FileWriter(file, true);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
        } catch (IOException ex) {
            Logger.getLogger(Stockmanagement.class.getName()).log(Level.SEVERE, null, ex);
        }
         PrintWriter pw=new PrintWriter(fw);
         pw.println("medicine: "+y);
         pw.close();
        
        }
        
        public static void appointmentfinances(String y){
        
        File file=new File("apointmentfinance.txt");
         FileWriter fw=null;
         try
        {
        fw = new FileWriter(file, true);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
        } catch (IOException ex) {
            Logger.getLogger(Stockmanagement.class.getName()).log(Level.SEVERE, null, ex);
        }
         PrintWriter pw=new PrintWriter(fw);
         pw.println("appointment: "+y);
         pw.close();
        }
        
        
        
         public static void totalfinances(String s,String y){
        
        File file=new File("totalfinance.txt");
         FileWriter fw=null;
         try
        {
        fw = new FileWriter(file, true);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
        } catch (IOException ex) {
            Logger.getLogger(Stockmanagement.class.getName()).log(Level.SEVERE, null, ex);
        }
         PrintWriter pw=new PrintWriter(fw);
         pw.println(s+y);
         pw.close();
        }
         
    
    
    
}
