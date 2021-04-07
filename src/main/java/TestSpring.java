import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        Music music = context.getBean(ClassicalMusic.class);
        System.out.println(music.getSong());
        context.close();
    }
}
