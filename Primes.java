public class Primes {
public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        if(n<2){
        System.out.println("Not a prime number");
        }else{
        isPrime(n);
        }
    }
    public static void isPrime(int n){
        boolean[] isPrime = new boolean[n + 1];
        int i = 2;
        while (i <= n) {
            isPrime[i] = true;
            i++;
        }
        i = 2;
        while (i * i <= n) {
            if (isPrime[i]) {
                int j = i * i;
                while (j <= n) {
                    isPrime[j] = false;
                    j += i;
                }
            }
            i++;
          }
        System.out.println("Prime numbers up to " + n + ":");
        int Count = 0;
        i = 2;
        while (i <= n) {
            if (isPrime[i]) {
                System.out.println(i);
                Count++;
            }
            i++;
        }
        double percent = (double) Count / n * 100;
        System.out.println("There are " +Count + " primes between 2 and " + n +" ("+ Math.round(percent)+" % are primes)");

}
}

