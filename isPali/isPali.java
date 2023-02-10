import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public int isPalinNum(int input1){
		// Read only region end
		// Write code here...
        int rev = 0, orig = input1, dig;

        while(input1 >0){
            dig = input1%10;
            rev = rev*10 + dig;
            input1 /=10;
        }
        if(orig==rev)
            return 2;
        return 1;
	}
}