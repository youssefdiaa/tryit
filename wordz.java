import java.util.*;
public class wordz{
	public static void main(String[]args)
	{Scanner sc= new Scanner (System.in);
 	 String s= sc.next();
 	 int up=0;
 	 int low=0;
 	 for(int i=0; i<=s.length()-1;i++)
 	 {if (s.charAt(i)<=90 & s.charAt(i)>=65)
 	  {up ++;
 	  }
 	  else
 	   {low ++;
 	   }
 	 }
 	 String now ="";
 	 char f='n';
 	 int r=0;
 	 if (up>low)
 	 {for (int j=0; j<=s.length()-1;j++)
 	  {
 	  	if (s.charAt(j)>=65 & s.charAt(j)<=90)
 	  	{f=s.charAt(j);
 	  	 now=now+f;
 	  	}
 	  	else
 	  	{r=s.charAt(j)-32;
 	  	 f=(char)r;
 	  	 now=now+f;
 	  	}
 	  }
 	 }
 	 if (low>up||low==up)
 	 {for (int j=0; j<=s.length()-1;j++)
 	  {
 	  	if (s.charAt(j)>=97 & s.charAt(j)<=122)
 	  	{f=s.charAt(j);
 	  	 now=now+f;
 	  	}
 	  	else
 	  	{r=s.charAt(j)+32;
 	  	 f=(char)r;
 	  	 now=now+f;
 	  	}
 	  }
 	 }
 	System.out.print(now);
	}
}