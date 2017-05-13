import controller.MyController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {

    private final static String CONFIG_LOCATION = "spring-config.xml";
    private final static String CONTROLLER_NAME = "controller";

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
        MyController controller = (MyController) applicationContext.getBean(CONTROLLER_NAME);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        if(scanner.hasNextInt()){
            int a = scanner.nextInt();
            System.out.println("Enter b: ");
            if(scanner.hasNextInt()){
                int b = scanner.nextInt();
                System.out.println("a+b=" + controller.getSum(a, b));
            } else {
                System.out.println("Don't enter number");
            }
        } else {
            System.out.println("Don't enter number");
        }
    }
}
