import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Employer {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("dataXML.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Employee e2 = (Employee) factory.getBean("emp1");
        System.out.println("Employee 2 Details" + e2);

    }
}
