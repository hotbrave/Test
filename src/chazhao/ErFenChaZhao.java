package chazhao;

public class ErFenChaZhao {
	/**
	 * 查找
	 * @param srcArray
	 * @param des
	 * @return
	 */
	public static int binarySearch(Integer[] srcArray, int des) {
	    //定义初始最小、最大索引
	    int low = 0;
	    int high = srcArray.length - 1;
	    //确保不会出现重复查找，越界
	    while (low <= high) {
	        //计算出中间索引值
	        int middle = (high + low)>>>1 ;//防止溢出
	        if (des == srcArray[middle]) {
	            return middle;
	        //判断下限
	        } else if (des < srcArray[middle]) {
	            high = middle - 1;
	        //判断上限
	        } else {
	            low = middle + 1;
	        }
	    }
	    //若没有，则返回-1
	    return -1;
	}
	
	
	public static void main(String[] args) {
		Integer a[]={4, 5, 12, 13, 15, 17, 18, 23, 25, 27, 34, 34, 35, 38, 49, 49, 51, 53, 54, 56, 62, 64, 65, 76, 78, 97, 98, 99};
		int result=binarySearch(a,53);
		System.out.println("result==="+result);

	}

}
