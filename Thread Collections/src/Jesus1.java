import java.util.ArrayList;

public class Jesus1 {

	
	ArrayList<Jesus> sold = new ArrayList<Jesus>();
	
	ArrayList<Jesus> product = new ArrayList<Jesus>();
	
	public void enterSold()
	{
	for(int i = 0;i<100;i++)
	{
		Jesus prabhu = new Jesus(i,"for " + i);
		
		sold.add(prabhu);
		
		try {
		
			Thread.sleep(100);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	}
	
	public void displaySold() throws InterruptedException
	{
		for(Jesus prabhu1 : sold)
		{
			System.out.println(prabhu1);
			
			Thread.sleep(100);
		}
	}
}
