import com.practicaljava.lesson7.tryit.*;

public class TestPayIncreaseInterface {

   public static void main(String[] args) {

      MyTest pom = new MyTest(12113);
      System.out.println("Mytest** " + pom.getPrvi());
      Payable workers[] = new Payable[3];
      workers[0] = new Employee("John");
      workers[1] = new Contractor("Mary");
      workers[2] = new Employee("Steve");

      for (Payable p : workers) {
         p.increasePay(30);
      }
   }
}
