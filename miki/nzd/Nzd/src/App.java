public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello NZD ??? ");
        System.out.println(nzd(2, 16));
        //Nzd pom = new Nzd();
        System.out.println(Nzd.nzd(2, 16));
        System.out.println(Nzd.gcd3(2, 16));

    }

    public static int nzd(int a, int b) {
        while (a != b) {
            if (a > b){
                a -= b;
                //System.out.println(" "+a+"  "+b);
            }
            else{
                b -= a;
                //System.out.println(" "+a+"  "+b); //String.valueOf(i)
            }
        }
        return a;
    }

}
