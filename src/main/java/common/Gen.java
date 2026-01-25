package main.java.common;

public class Gen<G>
{ 
G g; 
Gen(G g) 
{ 
this.g =g; 
} 
public static void main(String[] args) 
{ 
Gen arr[] = new Gen[5]; //line 1 
arr[0] = new Gen("Java"); //line 2 
arr[1] = new Gen(1); //line 3 
arr[2] = (Gen)new Gen(1); //line 4 
arr[3] = (Gen)new Gen(1); //line 5 
for(Gen o:arr) 
{ 
System.out.println(o); 
} 
} 
} 