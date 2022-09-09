package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        int var = character;
        if (var >= 65 && var <= 90) {
            if (character == 'A' || character == 'E' || character == 'C' || character == 'O' || character == 'U') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        }else {
            if (var >= 97 && var <= 122){
                if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                    System.out.println("Vowel");
                } else {
                    System.out.println("Consonant");
                }
            }else {
                System.out.println("wrong alphabet!");
            }
        }
    }
}
