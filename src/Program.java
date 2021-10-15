import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CofeMachine cofe1 = new CofeMachine();
        while(cofe1.working){
            switch(cofe1.status){
                case ACTION:
                    System.out.println("Enter actoin");
                    cofe1.work(in.nextLine());
                    break;
                case KIND:
                    System.out.println("");
                    cofe1.work(in.nextLine());
                    break;
            }
        }
    }
}
