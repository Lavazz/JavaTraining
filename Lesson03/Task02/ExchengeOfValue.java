public class ExchengeOfValue {
    public static void main(String[] args) {
        int a = 10, b = 6;
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }
}