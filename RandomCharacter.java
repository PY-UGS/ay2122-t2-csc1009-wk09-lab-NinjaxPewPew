import java.util.Random;

public class RandomCharacter {
    // 26 characters in alphabet, number from ASCII table
    public char getRandomLowerCaseLetter(){
        Random r = new Random();
        return (char)(r.nextInt(26) + 97);
    }

    public char getRandomUpperCaseLetter(){
        Random r = new Random();
        return (char)(r.nextInt(26) + 65);
    }

    public char getRandomDigitCharacter(){
        Random r = new Random();
        return (char)(r.nextInt(10) + 48);
    }
    
    public char getRandomCharacter(){
        Random r = new Random();
        int i = r.nextInt(3);
        switch(i){
            case 0:
            return getRandomLowerCaseLetter();
            case 1:
            return getRandomUpperCaseLetter();
            case 2:
            return getRandomDigitCharacter();
            default:
            return '\0';
        }
        

    }


    public char getPrime(){
        Random r = new Random();
        char n;
        do{
            n = (char)(r.nextInt(10) + 48);
        } while (!checkPrime(n -  48));

        return n;
        

        
    }
    static boolean checkPrime(int n){
        if(n == 0 || n == 1 || n % 2 == 0){
            return false;
        }
        for( int i = 3; i < Math.sqrt(n); i +=2){
            if (n % i == 0){
                return false;
            }
        }
        return true;
        
    }




    public static void main(String[] args){
    final int RUN_COUNT = 15;

    RandomCharacter randchar = new RandomCharacter();
   
    System.out.print("Getting " + RUN_COUNT + " random lower case characters:\n");

    for(int i=0; i<RUN_COUNT; i++){
        System.out.print(randchar.getRandomLowerCaseLetter());
    }
    System.out.println();

    for(int i=0; i<RUN_COUNT; i++){
        System.out.print(randchar.getRandomUpperCaseLetter());
    }
    System.out.println();
    
    for(int i=0; i<RUN_COUNT; i++){
        System.out.print(randchar.getRandomDigitCharacter());
    }
    System.out.println();

    for(int i=0; i<RUN_COUNT; i++){
        System.out.print(randchar.getRandomCharacter());
    }
    for(int i=0; i<RUN_COUNT; i++){
        System.out.print(randchar.getPrime() + "\n");
    }

    System.out.println();
    
    }
}

