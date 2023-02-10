import java.io.*;
import  java.util.*;
import java.lang.Math;

// Read only region start
class UserMainCode
{

	public int createPIN(int input1,int input2,int input3){
		// Read only region end
        int num[], orig[] = {input1, input2, input3}, o ,t, h, i;
        num = new int[4];

        for(i=1; i<4; i++) num[i] = 10;
        num[0] = -1;

        for(i=0; i<3; i++){
            o = orig[i]%10;
            t = (orig[i]%100)/10;
            h = (orig[i]%1000)/100;

            if(o < num[3])
                num[3] = o;
            
            if(t < num[2])
                num[2] = t;
            
            if(h < num[1])
                num[1] = h;

            num[0] = Math.max(Math.max(Math.max(o,t),h),num[0]);                    
        }

        int newnum = 0;

        for(i=0; i<4; i++){
            newnum = newnum*10 +  num[i];
        }
        return newnum;




        
	}
}