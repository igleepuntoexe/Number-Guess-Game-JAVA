import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String name;
        Integer opt;
        Integer attemps = 1;
        System.out.println("Welcome to the Game of Guess the Number");
        System.out.println("Tell me your name");
        name =  sc.nextLine();
        System.out.println("Hi " + name + " Choose an Option");
        System.out.println("1) Easy Level / 2) Middle Level / 3) Hard Level / 4) Exit");
        opt = sc.nextInt();
        if (opt == 1){
            Integer ans;
            System.out.print("Welcome to the Easy Level");
            System.out.println();
            Random nb = new Random();
            int numR = nb.nextInt(10)+1;
            while (attemps <= 3){
                System.out.println("Tell me a number between 1 and 10. This is your try: " + attemps + "º");
                ans = sc.nextInt();
                if (ans <= 10){
                    if (ans == numR){
                        System.out.println("You got it");
                        System.out.println("Congratulations " + name + ". You are the best <3");
                        break;
                    }else if (ans < numR){
                        System.out.println("The number is higher");
                    }else if (ans > numR){
                        System.out.println("The number is Lower");
                    }
                    attemps += 1;                    
                }else if (ans > 10 && ans <= 50){
                    System.out.println("That number is not valid for this level. Better go to the Middle Level");
                }else if (ans > 50){
                    System.out.println("That number is not valid for this level. Better go to the Hard Level");
                }
            }
            System.out.print("The Number is: " + numR);
        }else if(opt == 2){
            Integer ans;
            System.out.print("Welcome to the Middle Level");
            System.out.println();
            Random nb = new Random();
            int numR = nb.nextInt(50)+1;
            while (attemps <= 5){
                System.out.println("Tell me a number between 1 and 50. This is your try: " + attemps + "º");
                ans = sc.nextInt();
                if (ans <= 50){
                    if (ans == numR){
                        System.out.println("You got it");
                        System.out.println("Congratulations " + name + ". You are the best <3");
                        break;
                    }else if (ans < numR){
                        System.out.println("The number is higher");
                    }else if (ans > numR){
                        System.out.println("The number is Lower");
                    }
                    attemps += 1;                
                }else if (ans > 50){
                    System.out.println("That number is not valid for this level. Better go to the Hard Level");
                }
            }
            System.out.print("The Number is: " + numR);
        }else if(opt == 3){
            Integer ans;
            System.out.print("Welcome to the Hard Level");
            Random nb = new Random();
            int numR = nb.nextInt(100)+1;
            while (attemps <= 8){
                System.out.println("Tell me a number between 1 and 100. This is your try: " + attemps + "º");
                ans = sc.nextInt();
                if (ans <= 10){
                    if (ans == numR){
                        System.out.println("You got it");
                        System.out.println("Congratulations " + name + ". You are the best <3");
                        break;
                    }else if (ans < numR){
                        System.out.println("The number is higher");
                    }else if (ans > numR){
                        System.out.println("The number is Lower");
                    }
                    attemps += 1;                
                }else if (ans > 100){
                    System.out.println("The number exceeds the limit");
                }
            }
            System.out.print("The Number is: " + numR);
        }else if (opt == 4){
            System.out.println("Bye Bye");
        }else{
            System.out.println("This Option doesn't exit");
        }
    }
}
