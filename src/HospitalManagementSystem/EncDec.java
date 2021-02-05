/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagementSystem;

/**
 *
 * @author hp
 */
public class EncDec
{
    public String data;
    public EncDec()
    {
   
    }
    
    public EncDec(String data)
    {
        this.data = data;
    }

   
    public String encrypt(String data, int divisions)
    {
        char[] ch = new char[data.length()];
        String ency = "";
        for (int i = 0; i < ch.length; i++)
        {
            int j = (int)data.charAt(i);
            j = j + divisions;
            ch[i] = (char)j;
            ency = ency + ch[i];
        }
        return ency;
    }
    public String decrypt(String data, int divisions)
    {
     String ency = "";
     String x = data.substring(data.length()-4, data.length());
     divisions = Integer.parseInt(x);
     data = data.substring(0, data.length()-4);
     char[] ch = new char[data.length()];
     for (int i = 0; i < ch.length; i++)
     {
         int j = (int)data.charAt(i);
         j = j - divisions;
         ch[i] = (char)j;
         ency = ency + ch[i];

     }
     return ency;
}
}
