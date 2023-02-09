import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public int uniqueDigitsCount(int input1){
		// Read only region end
        int count = 0;
        int arr[];
        arr = new int[10];
        for(int i=0; i<10; i++){
            arr[i] = 0;
        }

        while(input1>0){
            int rem = input1%10;
            if(arr[rem]==0)
                count++;
            arr[rem]++;
            input1 /=10;
        }
        
        return count;
	}
}