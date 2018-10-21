package exam;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,3,4,2,6};
for(int j=0;j<a.length-1;j++) {
	

for(int i=0;i<a.length-1-j;i++) {
	if(a[i]>a[i+1]) {
		int temp=a[i];
		a[i]=a[i+1];
		a[i+1]=temp;
	}
}}
System.out.println(Arrays.toString(a));

	}

}
