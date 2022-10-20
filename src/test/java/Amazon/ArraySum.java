package Amazon;

public class ArraySum {
	public static void main(String[] args) {
		int a[]= new int[5];
		a[0]=5;
		a[1]=5;
		a[2]=3;
		a[3]=6;
		a[4]=7;
		
		int i;
		int sum = 0;
		
		for(i=0;i<a.length;i++) {
			
			sum=sum+a[i];
		}
		System.out.println(sum);
		
	}

}
