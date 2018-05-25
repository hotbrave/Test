package suanfa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import org.apache.log4j.Logger;




public class Leetcode {

	Logger log = Logger.getLogger(Leetcode.class);
	public static void main(String[] args) {
		Leetcode lc=new Leetcode();
		
		int[] nums= {2,7,11,15};
		int target=9;
		
		//System.out.println(Arrays.toString(lc.twoSum(nums, target)) );
		
		//System.out.println(lc.lengthOfLongestSubstring("dvdf"));
		//System.out.println(lc.lengthOfLongestSubstring("pwwkew"));
		
		//System.out.println(lc.reverse(1534236469));
		
		//System.out.println(lc.isPalindrome(121));
		
		//String[] strArr= {"flower","flow","flight"};
		String[] strArr= {"flower","flow","fliwht"};
		System.out.println("aa="+lc.longestCommonPrefix(strArr));
	}
	
	/**
	 * 最长公共前缀
	 * ["flower","flow","flight"]  fl
	 */
    public String longestCommonPrefix(String[] strs) {
        String result="";
        int minlength=0;
        ArrayList<String[]> arrtemp=new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
			String[] charArr=strs[i].split("");
			if (i==0) {
				minlength=charArr.length;
			}
			else {
				if (minlength>charArr.length) {
					minlength=charArr.length;
				}
			}
			arrtemp.add(charArr);
		}
        boolean flag=false;
        //log.debug(minlength);
        for (int i = 0; i < minlength; i++) {
        	for (int j = 0; j < arrtemp.size(); j++) {
        		if (arrtemp.get(0)[i].equals(arrtemp.get(j)[i])) {
					flag=true;
					//log.debug("true");
				}
        		else {
					flag=false;
					log.debug("false=="+arrtemp.get(0)[i]);
					//break;
					return result;
				}
				
			}
        	if (flag) {
				result=result+arrtemp.get(0)[i];
			}
			
		}

        
    	
    	return result;
    }
	
	/**
	 * 回文数
	 * @param x
	 * @return
	 */
    public boolean isPalindrome(int x) {
       int tempx=x;
        if (x<0) {
			return false;
		}
        int reversedNumber = 0;
        while (x>0) {
        	reversedNumber=reversedNumber*10+x%10;
			x=x/10;
		}
        log.debug("reversedNumber=="+reversedNumber+"x==="+x);
        if (reversedNumber==tempx) {
        	
			return true;
		}
        return false;
    }
    public int myAtoi(String str) {
    	
    	int result=0;
        return result;
    }
	
	/**
	 * 反转整数
	 * @param x
	 * @return
	 */
    public int reverse(int x) {
    	int result=0;
    	boolean flag=true;
    	if(x<0)
    	{
    		flag=false;
    	}
        String strTemp=String.valueOf(Math.abs(x));
        char[] arrCharTemp=strTemp.toCharArray();
        char[] arrCharResult=new char[arrCharTemp.length];
  try {
	  for(int i=0;i<arrCharTemp.length;i++)
      {
      	arrCharResult[i]=arrCharTemp[arrCharTemp.length-i-1];
      }
      result=Integer.valueOf(String.valueOf(arrCharResult)); 
      if (!flag) {
			result=-result;
		}
} catch (Exception e) {
	//e.printStackTrace();
}
       
        return result;
    }
    
    
	/**
	 * 3. 无重复字符的最长子串
	 * @param s
	 * @return
	 */
    public int lengthOfLongestSubstring(String s) {
    	if (s.equals("")) {
			return 0;
		}
        String[] arrS=s.split("");
        //int[] arrDel=new int[arrS.length];
        int result=0;
        
        ArrayList<String> arrTemp=new ArrayList<>();

        for(int i=0;i<arrS.length;i++)
        {
        	if (!arrTemp.contains(arrS[i])) {
        		
        		arrTemp.add(arrS[i]);
        		if (result<arrTemp.size()) {
        			result++;
        			//System.out.println("arrs=="+arrS[i]);
				}
        		
			}
        	else {
        		for(Iterator<String> ite = arrTemp.iterator(); ite.hasNext();)
        		{
        			//pwwkew
        			//log.debug("log=="+arrTemp.size());
        			//log.debug("j==="+j);
        			//System.out.println("arrTemp111["+j+"]=="+arrTemp.get(j)+"  arrS=="+arrS[i]);
        			String str = ite.next();
        			if (str.equals(arrS[i])) {
        				//System.out.println("arrTemp222["+j+"]=="+arrTemp.get(j)+"  arrS=="+arrS[i]);
        				//arrTemp.remove(j);
        				ite.remove();
        				break;
					}
        			else {
        				//System.out.println("aaa");
        				//arrTemp.remove(j);
        				ite.remove();
					}
        		}
    
        		arrTemp.add(arrS[i]);


			}
        	//System.out.println("arrTemp=="+arrTemp);
        }
    	
    	return result;
    }
	
/**
 * 两数之和
 * @param nums
 * @param target
 * @return
 */
	    public int[] twoSum(int[] nums, int target) {
	        for(int i=0;i<nums.length;i++)
	        {
	            for(int j=nums.length-1;j>i;j--)
	            {
	            	if (nums[i]+nums[j]==target) {
						int[] result= {i,j};
						return result;
					}
	            }
	        }

	        return null;
	        
	    }
	
}
