/**
 * ц╟ещеепР
 * @author Administrator
 *
 */
public class MaoPao {

	
	
	public void bigAndSmall() 
	{
		int arr[]= {-5,29,7,10,5,16};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				//System.out.println("j=="+j);
				if (arr[j]<arr[j+1]) {
					int temp;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}

				
			}
		}
		
		for (int i : arr) {
			System.out.print(i+" | ");
		}
	}
	
	public static void main(String[] args) {
		
		MaoPao mPao=new MaoPao();
		mPao.bigAndSmall();
	}

}
