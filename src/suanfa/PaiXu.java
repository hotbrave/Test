package suanfa;

public class PaiXu {

	public static void main(String[] args) {
		int arr[]= {-5,29,7,10,5,16};
		PaiXu pXu=new PaiXu();
		
		pXu.MaoPao(arr);
		
		pXu.XuanZe(arr);

	}
	
	/**
	 * ð������
	 * @param array
	 */
	private void MaoPao(int array[])
	{
        int t = 0;
        for (int i = 0; i < array.length - 1; i++)
            for (int j = 0; j < array.length - 1 - i; j++)
                if (array[j] > array[j + 1]) {
                    t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
        //System.out.println("");
        System.out.println("ð������");
        for(int i:array)
        {
        	System.out.print(i+",");
        }
	}
	
	/**
	 * ѡ������
	 */
	private void XuanZe(int array[]) {
        int t = 0;
        for (int i = 0; i < array.length - 1; i++){
            int index=i;
            for (int j = i + 1; j < array.length; j++)
                if (array[index] > array[j])
                    index=j;
            if(index!=i){ //�ҵ��˱�array[i]С������array[i]����λ��
                t = array[i];
                array[i] = array[index];
                array[index] = t;
            }
        }
        
        System.out.println("");
        System.out.println("ѡ������");
        for(int i:array)
        {
        	System.out.print(i+",");
        }
	}
	
	private void ChaRu()
	{
		
	}

}
