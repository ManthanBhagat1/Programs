package abstract1;

 abstract class find{
    abstract void smallest();
    {
    	
    }
 }
 
 class finddiffer extends find 
 {
	public void smallest()
	{
		int a[]= {7,3,4,6,10,8,9};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("reverse  order");
		for(int i=a.length-1;i>=0;i--)
		{
			
		System.out.println(a[i]);
		}
		
		
		
		
		
		
	}
 }
 
    
    
    public class finddiffernece {
    	public static void main(String[] args) {
    		finddiffer f=new finddiffer();
        	f.smallest();
		}
    	
    
}
