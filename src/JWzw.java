
 public class JWzw {  
	 //ð������  
	    public void efferArray(Integer[] in ) {  
	        int tem = 0;  
	        int num = 0;//ѭ������
	        int upnum = 0;//�ƶ�����
	        for (int i = 0; i < in .length; i++) {  
	            for (int j = i; j < in .length - 1; j++) {  
	                num++;  
	                if ( in [j + 1] < in [i]) {  
	                    tem = in [j + 1]; in [j + 1] = in [i]; in [i] = tem;  
	                    upnum++;  
	                }  
	            }  
	        }  
	        for (int i = 0; i < in .length; i++) {  
	            System.out.print( in [i]);  
	            if (i < in .length - 1) {  
	                System.out.print(",");  
	            }  
	        }  
	        System.out.println();  
	        System.out.println("ð������ѭ������:" + num);  
	        System.out.println("�ƶ�������" + upnum);  
	        System.out.print("\n\n\n");  
	    }  
    //��������  
    public void insertArray(Integer[] in ) {  
        int tem = 0;  
        int num = 0;  //��������ѭ������
        int upnum = 0;  //�ƶ�����
        for (int i = 0; i < in .length; i++) {  
            for (int j = i - 1; j >= 0; j--) {  
                num++;  
                if ( in [j + 1] < in [j]) {  
                    tem = in [j + 1]; in [j + 1] = in [j]; in [j] = tem;  
                    upnum++;  
                } else {  
                    break;  
                }  
            }  
        }  
        for (int i = 0; i < in .length; i++) {  
            System.out.print( in [i]);  
            if (i < in .length - 1) {  
                System.out.print(",");  
            }  
        }  
        System.out.println();  
        System.out.println("��������ѭ������:" + num);  
        System.out.println("�ƶ�������" + upnum);  
        System.out.print("\n\n\n");  
    }  
    //ѡ������  
    public void chooseArray(Integer[] in ) {  
        int tem = 0;  
        int num = 0;  
        int upnum = 0;  
        for (int i = 0; i < in .length; i++) {  
            for (int j = i; j < in .length - 1; j++) {  
                num++;  
                if ( in [j + 1] < in [j]) {  
                    tem = in [j + 1]; in [j + 1] = in [j]; in [j] = tem;  
                    upnum++;  
                }  
            }  
        }  
        for (int i = 0; i < in .length; i++) {  
            System.out.print( in [i]);  
            if (i < in .length - 1) {  
                System.out.print(",");  
            }  
        }  
        System.out.println();  
        System.out.println("ѡ������ѭ������:" + num);  
        System.out.println("�ƶ�������" + upnum);  
        System.out.print("\n\n\n");  
    }  
   
    //��ӡ�˷��ھ�  
    public void printMulti() {  
        for (int j = 1; j < 10; j++) {  
            for (int i = 1; i <= j; i++) {  
                System.out.print(i + " * " + j + " = " + j * i + "\t");  
            }  
            System.out.print("\t\n");  
        }  
        System.out.print("\n\n\n");  
    }  
    //��ӡN * 1 + N * 2 + N * 3 =num���������  
    public void printNumAssemble(int num) {  
        for (int i = 0; i < num + 1; i++) {  
            for (int j = 0; j < num / 2 + 1; j++) {  
                for (int in = 0; in < num / 3 + 1; in ++) {  
                    if (i * 1 + j * 2 + in * 3 == num) {  
                        System.out.println("С��" + i + ",\t����" + j + ",\t����" + in );  
                    }  
                }  
            }  
        }  
    }  
    /** 
 
 * @param args 
 
 */  
    public static void main(String[] args) {  
        JWzw jwzw = new JWzw();  
        int num = 3;  
        //jwzw.printMulti(); //��ӡ�˷��ھ�
        //jwzw.printNumAssemble(100); //��ӡN * 1 + N * 2 + N * 3 =num���������  
        Integer in [] = {  
            8, 89, 5, 84, 3, 45, 12, 33, 77, 98, 456, 878, 654, 213, 897  
        };  
        jwzw.efferArray( in ); //ð������  
        Integer in1[] = {  
            8, 89, 5, 84, 3, 45, 12, 33, 77, 98, 456, 878, 654, 213, 897  
        };  
        jwzw.insertArray(in1); //��������  
        Integer in2[] = {  
            8, 89, 5, 84, 3, 45, 12, 33, 77, 98, 456, 878, 654, 213, 897  
        };  
        jwzw.chooseArray(in2); //ѡ������  
        //int i = num++;  
        //System.out.println(i);  
        System.out.println(1000 >> 2);  
    }  
}
