import java.io.*;
import java.util.*;
class big
{
public static void main(String s[])
{
int a=Integer.parseInt(s[0]);
int b=Integer.parseInt(s[1]);
int c=Integer.parseInt(s[2]);
int d=a>b?a:b;
int e=c>d?c:d;
System.out.println("The biggest number is:"+e);
}
}