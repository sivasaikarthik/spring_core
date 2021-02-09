import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
class adds{
	int sum;

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
}
public class spring7 {
	public static void main(String args[])
	{
	ApplicationContext c=new ClassPathXmlApplicationContext("d.xml");
	adds a=c.getBean("ca", adds.class);
	System.out.println(a.getSum());
	((AbstractApplicationContext) c).close();
}
}
