public class ScientificCalculator extends StandardCalculator{
    public double modulo(double a,double b){
        return a%b;
    }

    public int factorial(int n){
        int i;
        int fact = 1;
        for(i = 1; i<= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
