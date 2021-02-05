/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagementSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Objects;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
//import static pragui.Everyone.Admin;

/**
 *
 * @author hp
 */
public class Everyone implements Serializable {
    private int patientId;
    private String age;
    String Fathername, Uname, BG,Info, Address, Fname, Lname = null;
    public static ArrayList<Object> AdminARR = new ArrayList();
    public static ArrayList<Object> DoctorARR = new ArrayList();
    public static ArrayList<Object> PatientARR = new ArrayList();
    private String Pass;
    private String acc;
    private String fee;
    
    public Everyone(String Fname, String Lname, String Uname, String Pass) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        //ADMIN
        this.Fname = Fname;
        this.Lname = Lname;
        this.Uname = Uname;
        this.Pass = Pass;
        
        FileInputStream fis = new FileInputStream("AdminArray.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			AdminARR = (ArrayList) ois.readObject();
			ois.close();
                        fis.close();
                        
                        for (int i = 0; i < AdminARR.size(); i++)
                        {
                            Everyone AD = (Everyone) AdminARR.get(i);
                            if (AD.getUname().equals(Uname))
                            {
                                AdminARR.remove(i);
                            }
                        }
       
    }

    public Everyone(int patientId, String age, String Fathername, String Uname, String BG, String Info) throws FileNotFoundException, IOException, ClassNotFoundException 
    {
        //patient
        this.patientId = patientId;
        this.age = age;
        this.Fathername = Fathername;
        this.Uname = Uname;
        this.BG = BG;
        this.Info = Info;
        
        FileInputStream fis = new FileInputStream("PatientArray.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			PatientARR = (ArrayList) ois.readObject();
			ois.close();
                        fis.close();

for (int i = 0; i < PatientARR.size(); i++)
                        {
                            Everyone AD = (Everyone) PatientARR.get(i);
                            if (AD.getUname().equals(Uname))
                            {
                                PatientARR.remove(i);
                            }
                        }
    }
    
    public Everyone (String Fname, String Lname, String Uname, String Pass, String acc, String fee) throws FileNotFoundException, IOException, ClassNotFoundException
    {
     //DOCTOR
        this.Fname = Fname;
        this.Lname = Lname;
        this.Uname = Uname;
        this.Pass = Pass;
        this.acc = acc;
        this.fee = fee;
        
        FileInputStream fis = new FileInputStream("DoctorArray.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			DoctorARR = (ArrayList) ois.readObject();
			ois.close();
                        fis.close();
                        
                        for (int i = 0; i < DoctorARR.size(); i++)
                        {
                            Everyone AD = (Everyone) DoctorARR.get(i);
                            if (AD.getUname().equals(Uname))
                            {
                                DoctorARR.remove(i);
                            }
                        }
    }
    
    public void DoctorAdd() throws FileNotFoundException, IOException
    {
        		FileOutputStream fos = new FileOutputStream("DoctorArray.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(DoctorARR);
			oos.close();
                        fos.close();
        
        for (int i = 0; i < DoctorARR.size(); i++) {
            
            
            Everyone AD = (Everyone) DoctorARR.get(i);
            System.out.println(AD.toStringDoctor());
        }

         
    }

    public void PatientAdd()
    {
        
            
        
        try
        {
			FileOutputStream fos = new FileOutputStream("PatientArray.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(PatientARR);
			oos.close();
                        fos.close();
                        for (int i = 0; i < PatientARR.size(); i++) {
                
            
                        Everyone AD = (Everyone) PatientARR.get(i);
                        System.out.println(AD.toStringPatient());
                        }
                        
			
        } 
    
          catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
        catch (IOException e) {
			e.printStackTrace();
		}

         
    }
    
 
    public void AdminAdd()
    {
     
            
        
        try
        {
			FileOutputStream fos = new FileOutputStream("AdminArray.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(AdminARR);
                        fos.close();
			oos.close();
                        for (int i = 0; i < AdminARR.size(); i++) {
                
            
                        Everyone AD = (Everyone) AdminARR.get(i);
                        System.out.println(AD.toStringAdmin());
                        }
                        
			
        } 
        catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
        catch (IOException e) {
			e.printStackTrace();
		}


    }
    

    public String toStringPatient() {
        return "Everyone{" + "patientId=" + patientId + ", age=" + age + ", Fathername=" + Fathername + ", Uname=" + Uname + ", BG=" + BG + ", Info=" + Info + ", }";
    }
    public String toStringAdmin() {
        return "Name: " + Fname + " Last Name: " + Lname + " Username: " + Uname + " Password: " + Pass;
    }
    public String toStringDoctor() {
        return "First name: " + Fname + " Last Name: " + Lname + " Username: " +Uname + " Pass: "+ Pass +" Account no: "+ acc + " Fee: "+fee;
    }


    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setFathername(String Fathername) {
        this.Fathername = Fathername;
    }

    public void setUname(String Uname) {
        this.Uname = Uname;
    }

   

    public void setBG(String BG) {
        this.BG = BG;
    }

    public void setInfo(String Info) {
        this.Info = Info;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public static void setAdminARR(ArrayList<Object> AdminARR) {
        Everyone.AdminARR = AdminARR;
    }

    public static void setDoctorARR(ArrayList<Object> DoctorARR) {
        Everyone.DoctorARR = DoctorARR;
    }

    public static void setPatientARR(ArrayList<Object> PatientARR) {
        Everyone.PatientARR = PatientARR;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getAge() {
        return age;
    }
    public String getFee()
    {
        return fee;
    }

    public String getFathername() {
        return Fathername;
    }

    public String getUname() {
        return Uname;
    }
    public String getFname()
    {
        return Fname;
    }

   

    public String getBG() {
        return BG;
    }

    public String getInfo() {
        return Info;
    }

    public String getAddress() {
        return Address;
    }

    public static ArrayList<Object> getAdminARR() {
        return AdminARR;
    }

    public static ArrayList<Object> getDoctorARR() {
        return DoctorARR;
    }

    public static ArrayList<Object> getPatientARR() {
        return PatientARR;
    }

    
    
    
    
}
 