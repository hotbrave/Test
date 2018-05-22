package chazhao;

public class ErFenChaZhao {
	/**
	 * ����
	 * @param srcArray
	 * @param des
	 * @return
	 */
	public static int binarySearch(Integer[] srcArray, int des) {
	    //�����ʼ��С���������
	    int low = 0;
	    int high = srcArray.length - 1;
	    //ȷ����������ظ����ң�Խ��
	    while (low <= high) {
	        //������м�����ֵ
	        int middle = (high + low)>>>1 ;//��ֹ���
	        if (des == srcArray[middle]) {
	            return middle;
	        //�ж�����
	        } else if (des < srcArray[middle]) {
	            high = middle - 1;
	        //�ж�����
	        } else {
	            low = middle + 1;
	        }
	    }
	    //��û�У��򷵻�-1
	    return -1;
	}
	
	
	public static void main(String[] args) {
		Integer a[]={4, 5, 12, 13, 15, 17, 18, 23, 25, 27, 34, 34, 35, 38, 49, 49, 51, 53, 54, 56, 62, 64, 65, 76, 78, 97, 98, 99};
		int result=binarySearch(a,53);
		System.out.println("result==="+result);

	}

}
