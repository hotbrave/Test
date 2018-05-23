package suanfa;

public class PaiXu {

	public static void main(String[] args) {
		int arr[]= {-5,29,7,10,5,16};
		PaiXu pXu=new PaiXu();
		
		pXu.MaoPao(arr);
		
		pXu.XuanZe(arr);

	}
	
	/**
	 * 冒泡排序
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
        System.out.println("冒泡排序");
        for(int i:array)
        {
        	System.out.print(i+",");
        }
	}
	
	/**
	 * 选择排序
	 */
	private void XuanZe(int array[]) {
        int t = 0;
        for (int i = 0; i < array.length - 1; i++){
            int index=i;
            for (int j = i + 1; j < array.length; j++)
                if (array[index] > array[j])
                    index=j;
            if(index!=i){ //找到了比array[i]小的则与array[i]交换位置
                t = array[i];
                array[i] = array[index];
                array[index] = t;
            }
        }
        
        System.out.println("");
        System.out.println("选择排序");
        for(int i:array)
        {
        	System.out.print(i+",");
        }
	}
	
	private void ChaRu()
	{
		
	}

}
