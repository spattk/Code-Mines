import java.util.*;

class Test
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int num;
		
		while(t-->0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();

			HashMap<Integer,Integer> map = new HashMap<>();

			int[] ar = new int[n];
			int[] br = new int[n];

			for(int i=0;i<n;i++)
				ar[i] = sc.nextInt();

			for(int i=0;i<n;i++)
				br[i] = sc.nextInt();

			int max = ar[n-1];
			map.put(br[n-1],1);
			for(int i=n-2;i>=0;i--)
			{
				if(ar[i]>max){
					max = ar[i];
					map.put(br[i],1);
				}
			}

			System.out.println(map.size());
		}
	}
}