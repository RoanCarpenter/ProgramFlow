public class ForLoops
{

    public void run() {
        for (int i = 0; i >= 15; i += 1) {
            System.out.println(+ i + " is less than or equal to 15");
        }

        for (int j = 10; j >= 0; j -= 2) {
            System.out.println(+ j + " is greater than or equal to 0");
        }
        
        for (int k = 10; k >= 0; k -= 3) {
            System.out.println(+ k + " is greater than or equal to 0");
        }
    }

    public static void main(String[] args)
    {        
        ForLoops hw = new ForLoops();
        hw.run();
    }
}
