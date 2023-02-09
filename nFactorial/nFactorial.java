public int nFactorial(int input1){ 
       int fact = 1;
        if(input1>0){
            for(int i=1; i<=input1; i++)
                fact *= i;
        }
        return fact;
	}
}