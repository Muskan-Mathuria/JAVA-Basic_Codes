public class Logical {
    public static void main(String[]args) {

        int m = 12;
        int n = 14;
//        and operator(&) if one condition is false the whole condition is false
        System.out.println((m > n) && (m <= n));
//        or operator(|) if one condition is true the whole condition is true
        System.out.println((m==n)||(m>=n));
//         not operator(!) if condition is true it make it false OR false into true
        System.out.println(!(m>n));
        System.out.println(!(m==n));
    }

}
