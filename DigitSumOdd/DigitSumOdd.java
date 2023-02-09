import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public int OddDigitsSum(int input1){
		// Read only region end
		// Write code here...
        int sum =0, rem;

        while(input1>0){
            rem = input1%10;
            if(rem%2==1) sum += rem;
            input1 /= 10;
        }
        return sum;
	}
}

