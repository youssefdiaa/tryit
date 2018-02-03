
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.util.StringTokenizer;





public class yala {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        StringTokenizer sf = new StringTokenizer(bf.readLine()," ");
        ArrayList<Integer>al=new ArrayList<Integer>();
        ArrayList<Integer>ak=new ArrayList<Integer>();
        while(st.hasMoreTokens()){
           al.add(Integer.parseInt(st.nextToken()));
        }

        while(sf.hasMoreTokens()){
            ak.add(Integer.parseInt(sf.nextToken()));
         }
        ArrayList<Integer>af=new ArrayList<Integer>();
        int i=1;
        while (i<ak.size())
        {
          int k=ak.get(i);
          int km=ak.get(i-1);
          z=al.get(1);
          if(i==1)
          {int c=k/z;
           if (k%z==0)
           {c--;
           }
          } else{ c=c+((k-km)/z);
                   if((k-km)/z==0 )
                   {c--;
                   }

                 }
        	i++;
        }
c=c+ak.size()-1;
System.out.print(c);

        }

}
