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
