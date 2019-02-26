/*
 * Angus Henry
 * 26/02/2019
 * Palindrome3.java
 * This program checks to see if  a sentence is a palindrome
 */

package palindrome3;

import javax.swing.JOptionPane;

/**
 *
 * @author anhen3335
 */
public class Palindrome3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Declares the variables that we need 
        String sentencebackwards, sentence, nospaceback, nospace;
        sentencebackwards ="";
        nospaceback ="";
        nospace = "";
        int pos; 
        sentence = JOptionPane.showInputDialog(
                "Words that are the same forwards and backwards are called palindromes.\n"
                + "This program determines if a words is a palindrome.\n\n"
                + "Enter a sentence(Please do not include punctuation marks):");
        for (pos = sentence.length() - 1; pos >= 0; pos--) {
            sentencebackwards += sentence.charAt(pos);
        }
        // Removes the spaces from the backward sentence 
        for (int i = 0; i < sentencebackwards.length() +1;){
        int end = i-1;
           if (end == -1){
          System.out.println ("oops");  
        }
        else{
            if (" ".equals(sentencebackwards.substring(end,i ))){
            System.out.println(" SPACE! ");
                    }
           
            
            else {
                nospaceback += sentencebackwards.substring (i-1,i);
            }
           
        }
           i++;
               }

        // Removes the spaces from the forward sentence         
                for (int i = 0; i < sentence.length() +1;){
        int end = i-1;
           if (end == -1){
          System.out.println ("oops");  
        }
        else{
            if (" ".equals(sentence.substring(end,i ))){
            System.out.println(" SPACE! ");
                    }
           
            
            else {
                nospace += sentence.substring (i-1,i);
            }
           
        }
           i++;
               }
         // checks to see if the sentence is a Palindrome
         if (nospaceback.equals(nospace)) {
            JOptionPane.showMessageDialog(null,sentence + " Is a Palindrome");
        } else {
            JOptionPane.showMessageDialog(null,sentence + " Is not a Palindrome");
        }
    }
}
