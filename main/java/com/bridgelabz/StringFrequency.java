package com.bridgelabz;
//program to find the frequency of character in string
public class StringFrequency {
    public static void main(String[] args){
        String inputString = "This World is Full of Suprises and also filled with mystery";//getting string as like input the string
        System.out.println("The string that defined is:" + inputString);
        char inputCharacter = 't';//getting character as like assigning the character value
        System.out.println("The character defined is: "+inputCharacter);
        int frequency =0;
        for (int i=0; i<inputString.length(); i++){
            if(inputCharacter == inputString.charAt(i)){//using function to compare each character
                ++frequency;
            }
        }
        System.out.println(" The frequency of " + inputCharacter + " = " + frequency );
    }
}
