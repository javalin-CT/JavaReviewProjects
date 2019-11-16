package com.example.ReviewProjects.Ternary;

public class Syntax_And_Notes {
    public static void main(String[] args) {
        /*
        if(condition){ statement };

        ternary:                  if     else
        variable = (condition) ? true : false;

         */
        boolean boo = true;
        String result = "";
        if(boo){
            System.out.println("if statement");
        }
        result = (boo) ? "ternary" : "false";

        System.out.println(result);

    }
}
