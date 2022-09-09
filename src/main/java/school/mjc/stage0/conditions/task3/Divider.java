package school.mjc.stage0.conditions.task3;

public class Divider {
    public void isDividableBy5And11(int number) {
        boolean five = number % 5 == 0;
        boolean eleven = number % 11 == 0;
        if (five == true && eleven == true){
            System.out.println("Dividable");
        }else{
            System.out.println("Non-dividible");
        }
    }
}
