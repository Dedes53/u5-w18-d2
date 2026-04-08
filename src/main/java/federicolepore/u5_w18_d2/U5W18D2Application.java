package federicolepore.u5_w18_d2;

import federicolepore.u5_w18_d2.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5W18D2Application {

    public static void main(String[] args) {
        SpringApplication.run(U5W18D2Application.class, args);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W18D2Application.class);

        Menu m = (Menu) ctx.getBean("menu");

        m.printMenu();
        ctx.close();
    }

}
