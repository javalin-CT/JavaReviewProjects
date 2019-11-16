package com.example.ReviewProjects.WrapperClass;
/*
PRIMITIVES DO NOT HAVE METHODS
WC DOES BECAUSE THEY ARE OBJECT
Methods
    Parse: takes a string and returns a primitive
    ValueOf: takes a string and returns a wrapper class
    Primitive to string: String str = "" + num;
    MAX_VALUE: returns the maximum value of the primitive type
    MIN_VALUE: returns the minimum value of the primitive type

 */
public class Syntax_And_Notes {
    public static void main(String[] args) {
        //Parse
        //takes the string and converts it to primitive
        int num = Integer.parseInt("1");
        double doub = Double.parseDouble("1.0");
        //parseBoolean will return false for all except "true"
        //this is true even if it is a true boolean expression
        boolean boo = Boolean.parseBoolean("not true");

        //ValueOf
        //takes a string and returns a wrapper class
        Integer Int = Integer.valueOf("1");
        Double Dou = Double.valueOf("1.0");
        Boolean Boo = Boolean.valueOf("true");




    }
}
