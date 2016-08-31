import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution 
{
    public static void main(String[] args) 
    {
            Solution s=new Solution();
            String str1,str2;
            Scanner sc=new Scanner(System.in);
            str1=sc.next();
            str2=s.frontRearString(str1);
            System.out.println(" THE String is :: "+str2);
    }
    public String frontRearString(String string)
    {
        int front = (int) Math.ceil((double) string.length()/2);
        int rear = string.length()/2;
        for(int i=0; i<string.length()/2; i++)
        {
            if(string.substring(0,rear).equals(string.substring(front)))
            {
                return string.substring(0,rear);   
            }
            else
            {
                front++;
                rear--;
            }
        }
        return "";
    }
}