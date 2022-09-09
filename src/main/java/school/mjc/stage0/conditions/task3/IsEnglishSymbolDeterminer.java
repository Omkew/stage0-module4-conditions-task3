package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        int base = symbol;
        if(base >= 97 && base <= 122 || base >= 65 && base <= 90){
            System.out.println("English");
        }else {
            System.out.println("Non English");
        }
    }
}
