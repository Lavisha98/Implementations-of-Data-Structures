/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 ***This is just the basic structure.
 */
package client;

import com.ds.*;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author DELL-PC
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
//        Stacks s = new Stacks();
//        String s1 = "{[(]})[[{}(])}({)(}[[()}{}}]{}{}}()}";
//        char[] str = s1.toCharArray();
//        int i;
//        for (i = 0; i < str.length; i++) {
//            char ch;
//            if (str[i] == '(' || str[i] == '{' || str[i] == '[') 
//                s.push(str[i]);
//            
//            else if(s.isEmpty()==1){
//                  System.out.println("The parentheses are NOT balanced");
//                  break;
//            }
//            
//            else{
//                ch = s.pop();
//                if (ch == '(') {
//                    if (str[i] == '}' || str[i] == ']') {
//                        System.out.println("The parentheses are NOT balanced");
//                        break;                        
//                    }
//                }
//                if (ch == '{') {
//                    if (str[i] == ')' || str[i] == ']') {
//                        System.out.println("The parentheses are NOT balanced");
//                        break;
//                    }
//                }
//                if (ch == '[') {
//                    if (str[i] == ')' || str[i] == '}') {
//                        System.out.println("The parentheses are NOT balanced");
//                        break;
//                    }
//                }
//            }
//        }
//        if (s.isEmpty()==1 && i==str.length) 
//            System.out.println("The parentheses are balanced");
//        else
//            System.out.println("The parentheses are NOT balanced");
          Scanner scan = new Scanner(new File("C:\\Users\\DELL-PC\\Downloads\\leipzig1m.txt"));
        BSTword b = new BSTword();

        while (scan.hasNextLine()) {
            String line = scan.nextLine();

            for (String val : line.split(" ")) {
                if(val.length() >= 10)
                {
                  b.insert(val);  
                }
            }
        }
        System.out.println(b.inorder());
    }

}
