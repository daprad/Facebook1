package Amazon;

import java.util.Iterator;

public class SumOf {
public static void main(String[] args) {
	int i;
	int j=0;
for(i=1; i<10 ; i++) {
	j=i+j;
	i=i+1;
	}
System.out.println("the sum is : "+j);
}
}