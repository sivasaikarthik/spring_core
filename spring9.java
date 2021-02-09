import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

  
class HelloWorld
{
	public void init() throws Exception 
    { 
        System.out.println("Bean HelloWorld has been " + "instantiated and I'm "+ "the init() method"); 
    } 
	public void destroy() throws Exception 
    { 
        System.out.println( "Conatiner has been closed " + "and I'm the destroy() method"); 
    }
}

public class spring9 {
	public static void main(String args[])
	{
	ApplicationContext c=new ClassPathXmlApplicationContext("c.xml");
	((AbstractApplicationContext) c).close();
}
}