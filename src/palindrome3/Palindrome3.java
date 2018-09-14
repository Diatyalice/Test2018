/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindrome3;
import javax.swing.JOptionPane;
/**
 *
 * @author zhche5293
 */
public class Palindrome3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

// Create variables       
String input,input2,input3,coughtWords,name;
double number,number2,sum,product,difference,quotient;
int space;
//catch the user input of the user's name and user's input
input = JOptionPane.showInputDialog("Enter your name:");
input2 = JOptionPane.showInputDialog("Enter your first number");
input3 = JOptionPane.showInputDialog("Enter your second number");

//convert the input from String to double
number=Double.parseDouble(input2);
number2=Double.parseDouble(input3);

//calculate the the sum product difference and quotient
sum=number+number2;
product=number*number2;
difference=number-number2;
quotient=number/number2;

//catch the first and convert it to upper case
space=input.indexOf(" ");
coughtWords=input.substring(0,space);
name=coughtWords.toUpperCase();

//output the name in upper case and the sum product difference and quotient
JOptionPane.showMessageDialog(null,name+"\n"+sum+"\n"+product+"\n"+difference+"\n"+quotient);
    }
    
}
