package exam;

import java.util.Arrays;

public class RemoveDuplicateArray {
static void sort(int a[]) {
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]<a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
}
static void duplicateElements(int a[]) {
	int count=0;
	for(int i=0;i<a.length-1;i++) {
		if(a[i]!=a[i+1]) {
			a[count]=a[i];
			count++;
		}
	}
	a[count]=a[a.length-1];

int b[]=Arrays.copyOf(a, count+1);
System.out.println("After removing duplicate elements");
for(int k:b) {
	System.out.print(k+" ");
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {2,3,4,3,5,5,6};

sort(a);
System.out.println("sorted array: ");
for(int k:a) {
	System.out.print(k+" ");
}
System.out.println();
duplicateElements(a);

	}

}
