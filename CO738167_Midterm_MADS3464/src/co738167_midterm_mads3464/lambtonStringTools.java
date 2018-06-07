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
    
}
