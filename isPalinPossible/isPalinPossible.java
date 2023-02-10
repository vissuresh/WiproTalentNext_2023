import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public int isPalinNumPossible(int input1){
		// Read only region end
		// Write code here...
        int dig_count = 0, dic[], dig;
        dic = new int[10];
        for(int i=0; i<10; i++) dic[i] = 0;

        while(input1>0){
            dig_count++;
            dig = input1%10;
            dic[dig]++;
            input1 /=10;
        }

        if(dig_count%2==0){
            for(int i=0; i<10; i++){
                if(dic[i]%2==1) return 1;
            }
            return 2;
        }

        int flag =0;
        for(int i=0; i<10; i++){
            if(dic[i]%2==1){
                if(flag==1)
                    return 1;
                flag = 1;
            }
        }
        return 2;
	}
}

