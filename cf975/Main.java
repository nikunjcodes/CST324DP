public class Main{
    static boolean isPalindrome(int n ){
        int temp = n;
        int rev = 0;
        while(temp>0){
            int rem = temp%10;
            rev = rev*10 + rem;
            temp = temp/10;
        }
        if(rev != n )
            return false;
        return true;
    }
    static boolean isPrime(int n ){
        if(n==1)
            return false;
        else if(n==2)
            return true;
        else {
            for(int i=2 ; i<Math.sqrt(n); i++){
                if(n%i==0)
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(123));
    }
}