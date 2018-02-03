import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class aimround {
	public static int check(String s){
		TreeSet <Character> set= new TreeSet<Character>();
		for(int i=0;i<s.length();i++){
			set.add(s.charAt(i));
		}
		return set.size();
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s=bf.readLine();
        
       	int n=Integer.parseInt(bf.readLine());
        if(n>s.length()){
        	System.out.println("impossible");
        }else{ 
        	int need=n-check(s);
        	if(need>0)
        	{System.out.println(need);}
        	else{
        		System.out.println(0);
        	}
        }
        
        
//        int []x=new int [n];
//		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");	
	}
}
