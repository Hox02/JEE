package presentation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import metier.IMetier;
public class PresentationSpring {

    public static void main(String[] args) {
        //TODO Auto-generated method stub

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        IMetier m = (IMetier) context.getBean("metier");
        System.out.println(m.calcul());
    }
}
