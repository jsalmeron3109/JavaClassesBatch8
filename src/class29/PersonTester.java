package src.class29;

public class PersonTester {

    public static void main(String[] args) {
        Person jen=new Person("Jenifer","123456789",25,30000);
         /*System.out.println(jen.taxPaid);
         jen.taxPaid=0;  //CE cannot access and modify data
         System.out.println(jen.taxPaid);*/
        jen.setTaxPaid("45641351",-1);
        jen.setTaxPaid("123456789",-1);
        System.out.println(jen.getTaxPaid("45641351"));
        System.out.println(jen.getTaxPaid("123456789"));


    }
}
