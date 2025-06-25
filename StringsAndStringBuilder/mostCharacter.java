// Given a string consisting of lowercase English alphabets. Print the character that is occuring most number of times.

import java.util.Scanner;

public class mostCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        int[] freq = new int[26];

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            int idx = (int)ch -97;
            freq[idx]++;
        }
        int maxFreq = -1;
        for(int i=0; i<freq.length; i++) {
            maxFreq = Math.max(maxFreq, freq[i]);
        }
        for(int i=0; i<freq.length; i++) {
            if(maxFreq == freq[i]) {
                char ch = (char)(i + 97);
                System.out.print(ch + " ");
            }   
        }
        sc.close();
    }
}
