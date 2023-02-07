import java.lang.Math;

public int isPrime(int input1){
	double lim = Math.sqrt(input1);
	
	for(int i=2; i<=lim; i++){
		if(input1 % i == 0)
			return 2;
	}
	return 1;
}
