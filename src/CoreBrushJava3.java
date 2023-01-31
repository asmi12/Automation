import java.util.ArrayList;

public class CoreBrushJava3 {
	public static void main(String[] args) {
	int arr2[]= {1,2,4,9,8,10,12,100};
	for(int i=0;i<arr2.length;i++)
	{
		if(arr2[i]%2 == 0)
		{
			System.out.println(arr2[i]);
			break;
		}
		else
		{
			System.out.println(arr2[i] +"not multiple of 2");
		}
	}
	
	//Using arraylist,array is dynamic in nature
	ArrayList<String> a= new ArrayList<String>();
	a.add("abc");
	a.add("xyz");
	a.add("pqr");
	System.out.println(a.get(2));
	
	
	}
}
