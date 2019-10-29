import java.util.*;

class Test
{
	static int X[] = { 2, 1, -1, -2, -2, -1, 1, 2 }; 
    static int Y[] = { 1, 2, 2, 1, -1, -2, -2, -1 }; 

    static int A[] = { 1,1,0,1,0,-1,-1,-1 };
    static int B[] = { 0,1,1,-1,-1,0,-1,1 };

	static boolean checkMate(int[][] ar, int n, int xf, int yf){

		boolean flag = false;

		for(int k=0;k<n;k++)
		{
			for (int i = 0; i < 8; i++) { 
  
		        // Position of knight after move 
		        int x = ar[k][0] + X[i]; 
		        int y = ar[k][1] + Y[i]; 
		  
		        // count valid moves 
		        if (x >= 0 && y >= 0 && x==xf && y==yf)
		        {
		            flag = true;
		        	break;
		    	} 
			}
		}

		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int num;
		
		while(t-->0)
		{
			int n = sc.nextInt();
			int[][] ar = new int[n+1][2];
			for(int i=0;i<=n;i++)
			{	
				ar[i][0] = sc.nextInt();
				ar[i][1] = sc.nextInt();
			}

			boolean result = checkMate(ar,n,ar[n][0],ar[n][1]);			
			int count = 0;

			if(result)
			{
				for(int i=0;i<8;i++)
				{
					int x =  ar[n][0] + A[i];
					int y = ar[n][1] + B[i];

					result = checkMate(ar,n,x,y);
					if(result){
						count++;
					}
					else{
						break;
					}
				}

				if(count==8)
					System.out.println("YES");

				else
					System.out.println("NO");
			}

			else
			{
				System.out.println("NO");
			}
		}
	}
}
