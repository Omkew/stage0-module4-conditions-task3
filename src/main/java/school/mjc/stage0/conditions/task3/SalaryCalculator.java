package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary <= 10000){
            double tax = salary * 15.0 /100;
            System.out.println(salary - tax );
        }else {
            if (salary > 10000 && salary >= 20000){
                double tax = salary * 18.0 / 100;
                System.out.println(salary - tax);
            }else {
                if (salary > 20000){
                    double tax = salary * 20.0 / 100;
                    System.out.println(salary - tax);
                }else {
                    if (salary < 0){
                        System.out.println("wrong input!");
                    }
                }
            }
        }
    }
}
