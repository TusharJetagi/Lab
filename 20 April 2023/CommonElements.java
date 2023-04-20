package Lab;
import java.util.*;

public class CommonElements 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al= new ArrayList<Integer>();
		
		   int a1[] = {2, 4, 5, 8};
		   int a2[] = {2, 3, 4, 8, 16};
		   int a3[] = {2, 8, 14, 40};
		   
			int x = 0, y = 0, z = 0;
			
			while (x < a1.length && y < a2.length && z < a3.length)
			{
				if (a1[x] == a2[y] && a2[y] == a3[z])
				{
					al.add(a1[x]);
					x++;
					y++;
					z++;
				}
				else if (a1[x] < a2[y]) 
				{
					x++;
				}
				else if (a2[y] < a3[z]) 
				{
					y++;
				}
				else 
				{
					z++;
				}
			}
			System.out.println("Common Elements are: ");
		for(int no:al)	
		{
			System.out.println(no);
		
		}
	}

}


