import org.junit.jupiter.api.Test;

public class JunitTest2 {
	 @Test
	 void display(){
   		 System.out.println("Done Maximum Numbers");
   	 }
	 public static int findMax(int arr[]){  
	        int max=arr[0];//arr[0] instead of 0  
	        for(int i=1;i<arr.length;i++){  
	            if(max<arr[i])  
	                max=arr[i];  
	        } 
	        return max;  
	        
}
}
