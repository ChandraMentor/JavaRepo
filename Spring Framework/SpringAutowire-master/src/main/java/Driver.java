
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

    public static void main(String[] args) {

        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Cat cat = (Cat) context.getBean("cat");
        System.out.println(cat.toString());

        // Auto-Wiring ‘byName’
        Dog dog = (Dog) context.getBean("dog");
        System.out.println(dog.toString());

        // Auto-Wiring ‘byType’
//        Elephant elephant = (Elephant) context.getBean("elephant");
//        System.out.println(elephant.toString());

        // Auto-Wiring ‘constructor’
        Frog frog = (Frog) context.getBean("frog");
        System.out.println(frog.toString());

        Tiger tiger = (Tiger) context.getBean("tiger");
        System.out.println(tiger.toString());

        context.close();
    }
}
