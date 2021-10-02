

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class test {
	public static void main(String[] args) {  
        
        Resource r=new ClassPathResource("applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        student st1=(student)factory.getBean("st1");  
        st1.show(); 
        student st2=(student)factory.getBean("st2");  
        st2.show(); 
        
        student stu=(student)factory.getBean("obj1");  
        stu.displayInfo();  
        
        student stu1=(student)factory.getBean("obj2");  
        stu1.displayInfo();  
          
    }

}
