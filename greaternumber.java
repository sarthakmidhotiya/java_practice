class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 45;
        int c = 25;
        int d = 30;

        if(a >= b && a >= c && a >= d) {
            System.out.println("A is greatest: " + a);
        }
        else if(b >= a && b >= c && b >= d) {
            System.out.println("B is greatest: " + b);
        }
        else if(c >= a && c >= b && c >= d) {
            System.out.println("C is greatest: " + c);
        }
        else {
            System.out.println("D is greatest: " + d);
        }
    }
}