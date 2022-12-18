package mutidimensional_Array;

public class Multi_DiamensionalArrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rollno[][]=new int[2][2];
		rollno[0][0]=10;
		rollno[0][1]=11;
		rollno[1][0]=12;
		rollno[1][1]=13;
		System.out.println("===========================================");
		System.out.println(rollno[0][0]);
		System.out.println(rollno[0][1]);
		System.out.println(rollno[1][0]);
		System.out.println(rollno[1][1]);
		System.out.println("===========================================");
		
		for(int i=0;i<=rollno.length-1;i++)
		{
			for(int j=0;j<=rollno.length-1;j++)
			{
		
			System.out.print(rollno[i][j]+" ");
		}
		System.out.println();
		//System.out.println();
			}
		System.out.println("============================================");

	}

}
