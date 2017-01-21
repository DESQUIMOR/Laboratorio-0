public class Fibonacci {

    public static int fibonacci(int n) {
    	if (n == 0) {
    		return 0;
    	}else if (n == 1 || n == 2) {
			return 1;
		}
		int fib1 = 1, fib2 = 1, fibn = 1;
		for (int i = 3; i <= n; i++) {
			fibn = fib1 + fib2;
			fib1 = fib2;
			fib2 = fibn;
 
		}
		return fibn;
    }

    // NO MODIFICAR A PARTIR DE AQUI

    public static void main(String[] args) {
        if(args.length > 0) {
            int n = Integer.parseInt(args[0]);
            System.out.println("Fibonacci de " + n + ": " + fibonacci(n));
        } else {
            System.err.println("No se paso ningun argumento");
        }
    }

}
