import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());


        Cat bean2 = (Cat) applicationContext.getBean ("cat");
        System.out.println(bean2.getMassage1());

        Cat bean3 = (Cat) applicationContext.getBean ("cat");
        System.out.println(bean3.getMassage1());

        if (bean == bean1){
            System.out.println("первая пара равна");
        }
        if (bean2!=bean3){
            System.out.println("вторая пара не равна");
        }

    }

}