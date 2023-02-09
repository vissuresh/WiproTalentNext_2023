package NthFibonacci;

public class NthFibonacci {
    public static void main(String[] args) {
        int n1=0,n3=0,n2=1,input=10;
        System.out.print(n1+""+n2);
        for(int i=2;i<input;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3);
        }
        
    }
}
