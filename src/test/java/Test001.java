import com.liuwq.entity.UserEntity;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/6/27 0027 上午 11:34
 * @version: V1.0
 */
public class Test001 {

    public static void main(String[] args) {
        // 1.读取spring配置文件,创建IOC容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(">>>启动完毕...");
        // 2.从SpringIoc容器获取userEntity
        UserEntity userEntity = (UserEntity) applicationContext.getBean("userEntity");
        System.out.println(userEntity.toString());
        UserEntity userEntity2 = (UserEntity) applicationContext.getBean("userEntity");
        System.out.println(userEntity.toString());
        System.out.println(userEntity == userEntity2);

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

    }

}
