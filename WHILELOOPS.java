public class WHILELOOPS
{

    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    
    public void run() {
        int i = 0;
        while (i < 15) {
            System.out.println("i is " + i + " but is less than 15");
            i += 1;
        }
        
        int k = 10;
        while (k > 5) {
            System.out.println("k is " + k + " but is greater than 5");
            k -= 1;
        }
        
        int a = 1;
        int b = 10;
        while (a < 10 && b <= 20) {
            System.out.println("a is " + a + " and b is " + b + " and that is cool");
            a += 1;
            b += 1;
        }
        
        
    }
    
    
    public static void main(String[] args)
    {        
        WHILELOOPS hw = new WHILELOOPS();
        hw.run();
    }
}
