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
    
    
