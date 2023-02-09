import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public int nonRepeatDigitsCount(int input1){
		// Read only region end
		// Write code here...
        int arr[], count=0, i, rem;
        arr = new int[10];

        for(i=0; i<10; i++) arr[i] = 0;

        while(input1 > 0){
            rem = input1%10;
            arr[rem]++;
            input1 /= 10;
        }

        for(i=0; i<10; i++){
            if(arr[i]==1) count++;
        }
        return count;

	}
}