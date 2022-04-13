package javaTraining;

public class Convert {
    public static void main(String[] args) throws NumberFormatException {

        //convert to string
        int age = 23;
        double salary = 160000.00;
        boolean isTrue = false;
        String newSalary = String.valueOf(salary);
        String newAge = String.valueOf(age);
        String newIsTrue = String.valueOf(isTrue);
        System.out.println(newSalary);
        System.out.println(newAge);
        System.out.println(newIsTrue);

        //convert to int
        String rate = "89.3";

        try{
            int newRate = Integer.parseInt(rate);
            System.out.println(newRate);
        }catch(Exception e){
        }

        int newestSalary = (int)salary;
        System.out.println(newestSalary);

        //convert to double
        try{
            double newestRate = Double.parseDouble(rate);
            System.out.println(newestRate);
        }catch(Exception e){
        }

        double newestAge = (double) age;
        System.out.println(newestAge);
    }
}
