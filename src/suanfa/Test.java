package suanfa;
import java.util.Arrays;

import org.apache.log4j.Logger;

public class Test {

	Logger log = Logger.getLogger(Test.class);
	
	
	public static void main(String[] args) {
		Test test=new Test();
		test.testFun();

	}
	
	public void testFun() {
		for(int j=0;j<2;j++)
		{
			log.debug("j==="+j);
		}
	}
	
}
