package com.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountCodeLines {

void commentstotal(BufferedReader br) throws IOException
{
int linecount=0;
int multiLine=0;
int singleLine=0;
int blockComment=0;
int todo=0;
String s;              
     while((s=br.readLine())!=null)    //Reading Content from the file line by line
     {
    	linecount++; 
        if(s.contains("/*"))
        {
        multiLine ++;
        }//For each line increment linecount by one
           
     
         if(s.contains("//")) {
            singleLine ++;
          }
         if(s.contains("TODO"))
         {
        	 todo++;
         }
         if(s.contains("*"))
         {
        	 blockComment++;
         }
     }
     System.out.println("Total # of lines:"+" "+linecount);
     System.out.println("Total # of comment lines:"+" "+ (singleLine+blockComment));
     System.out.println("Total # Single line comment"+" "+ singleLine);
     System.out.println("Total # Multiline line comment"+" "+multiLine);
     System.out.println("Total # of comment lines within block comments:"+" "+blockComment);
     System.out.println("Total # TODOs"+" "+ todo);
}
public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub

File f1=new File("test.txt"); //Creation of File Descriptor for input file
     FileReader fr=new FileReader(f1);  //Creation of File Reader object
     BufferedReader br = new BufferedReader(fr);    //Creation of File Reader object
     CountCodeLines cl= new CountCodeLines();
     cl.commentstotal(br);
     fr.close();
  }
}
