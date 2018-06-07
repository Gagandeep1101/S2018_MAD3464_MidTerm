/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co738167_midterm_mads3464;

/**
 *
 * @author macstudent
 */
public class lambtonStringTools {
     static int a;
     static int c = 0;
     static int res;
     
     static void reverse(String s)
     {
             char ch [] = new char[s.length()];
             for(a = 0; a<s.length(); a++)
             {
                 ch[a] = s.charAt(a);
                 
             }
             for(a=s.length() -1; a>=0; a--)
             {
                 System.out.println(ch[a]);
                
             }
             
     
     
     }


public class binaryToDecimal {
    
    public int binaryToDecimal(int binary)
    {
    int decimal = 0;
    int power = 0;
    
    while(true)
    {
        if(binary==0)
        {
            break;
        }
            else
            {
                    int temp = binary%10;
                    decimal += temp*Math.pow(2,power);
                    binary = binary/10;
                    power++;
                    
                    }
        }
    return decimal;
    }
 
    
   
}


public class Initials 
{
    static void printInitials(String name)
    {
        if(name.length() == 0)
            return;
        
        System.out.println(Character.toUpperCase(name.charAt(0)));
        
        for(int i=1;
                i<name.length()-1; i++)
            if(name.charAt(i)==' ')
                System.out.println(" " + Character.toUpperCase(name.charAt(i+1)));
        
    }
    
        
}
    
}
