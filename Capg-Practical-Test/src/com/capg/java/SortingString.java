package com.capg.java;

public class SortingString {
    public static void main(String[] args)
    {
           	int len=args.length;
           	if(len==0)
           	{

                    System.out.println("No arguments are given ! ");
                    return;
           	}
    		String[] str=args;
           	String temp;
            for(int i=0;i<len;i++)
            {
            	if(str[i].length()>str[i+1].length()) {
            		temp = str[i];
            		str[i] = str[i+1];
            		str[i+1] = temp;
            	}
                 
            }
            for(int i=0;i<len;i++)
            {
                  System.out.print(str[i]);
            }

  }
}