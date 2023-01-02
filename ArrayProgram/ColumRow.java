class ColumRow 
{
	public static void main(String args[]) {
	int a[][]={{3,4,6},{5,2,1}};
	int[][]b= new int[3][2];
	for(int i=0;i<3;i++) {
	for(int j=0;j<2;j++){
	
	b[j][i] = a[i][j];
	}
 }
	for(int k=0;k<3;k++) {
		for(int l=0;l<2;l++)
		{
			System.out.println(b[i][j]+" ");
		}
	}
  }
 }