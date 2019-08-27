package job;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lizhen on 2018/9/25.
 */
public class QuartzCore {

    public static void main(String[] args) {
        System.out.println("Quartz is started.......");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-job.xml");
    }
}
