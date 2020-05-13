import java.util.ArrayList;
public class Arrays {

	public static void main(String[] args) {
		int m = 10;
		ArrayList<Integer> jesus = new ArrayList<Integer>();
		
		for(int i =1 ;i<m;i++)
		{
			for (int j = m/2;j>=1;j++)
			{
				if(i/j != 0)
				{
				jesus.add(i);	
				}
			}
			
		System.out.println(jesus);
		}

	}

}
