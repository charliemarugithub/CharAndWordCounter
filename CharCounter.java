/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charcounter;

/**
 *
 * @author Charlie
 */
public class CharCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String string = "Having a deep passion for working with others, the opportunity to work in a call center allows me to maintain that passion within a working environment that caters to my hearing disability. \n" +
"I believe a home should provide safety, security, warmth, and stability for a whanau. \n" +
"Being in a position to encourage, motivate and guide a client to enable them to make decisions appropriate to their needs. \n" +
"I love working with people from diverse backgrounds. \n" +
"The experience I've gained in the hospitality industry ";    
        int countChar = 0;    
            
        //Counts != for no of characters and == for number of words     
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) != ' ')    
                countChar++;    
        }    
            
        //Displays the total number of characters present in the given string    
        System.out.println("Total number of characters in this string: " + countChar);
        
        int countWords = 0;    
            
        //Counts != for no of characters and == for number of words     
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) == ' ')    
                countWords++;    
        }    
            
        //Displays the total number of characters present in the given string    
        System.out.println("Total number of WORDS in this string: " + countWords);
        }   
    
    
    }
    










