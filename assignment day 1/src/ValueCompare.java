public class ValueCompare {

	public static void main(String[] args) {
	
		int num[] = {666,420,609,111,312,143,121,112};
        int smallest = num[0];
        int biggest = num[0];
        
        for(int i=1;i<num.length;i++)
        {
        	if(num[i]>biggest)
        		biggest = num[i];
        	if(num[i]<smallest)
        		smallest = num[i];
        }
        System.out.println("Biggest no. is "+biggest);
        System.out.println("Smallest no. is "+smallest);
	}

}