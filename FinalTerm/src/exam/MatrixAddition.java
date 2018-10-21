package exam;

import java.util.Arrays;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]= {{1,1,1},{2,2,2},{3,3,3}};
int b[][]={{1,1,1},{2,2,2},{3,3,3}};
for(int i=0;i<a.length;i++) {
	for(int j=0;j<a.length;j++) {
	
		a[i][j]=a[i][j]+b[i][j];
	}
}
for(int i=0;i<a.length;i++) {
	for(int j=0;j<a.length;j++) {
		System.out.print(a[i][j]+" ");
	}
	System.out.println();
}
	}

}
