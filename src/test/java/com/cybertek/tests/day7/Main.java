package com.cybertek.tests.day7;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("# in:");
        int amt = inp.nextInt();
        inp.nextLine(); //this line is necessary
        System.out.print("word:");
        String word = inp.nextLine();
        //leave the above unedited, write your code below:


        if(amt>1 || amt==0) {

            if(word.endsWith("fe"))
                word= word.replace("fe", "ves");
            else if(word.endsWith("y") && !isVowel(word.charAt(word.length()-2)))
                word= word.replace("y", "ies");
            else if(word.endsWith("sh"))
                word= word+"es";
            else if(word.endsWith("ch"))
                word= word+"es";
            else if(word.endsWith("us"))
                word= word.replace("us", "i");
            else word=word+"s";
        }


        System.out.println(amt+ " "+  word);





    }

    public static boolean isVowel(char ch)
    {
        return ch == 'a' ||
                ch == 'e' ||
                ch == 'i' ||
                ch == 'o' ||
                ch == 'u';
    }


}