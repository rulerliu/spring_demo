import com.liuwq.config.MyFactoryBean;
import com.liuwq.config.MySpringConfig;
import com.liuwq.controller.UserController;
import com.liuwq.entity.MemberEntity;
import com.liuwq.entity.UserEntity;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/6/27 0027 上午 11:34
 * @version: V1.0
 */
public class Test002 {

    private static AnnotationConfigApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext = new AnnotationConfigApplicationContext(MySpringConfig.class);
        System.out.println(">>>启动完毕...");
        UserEntity userEntity = applicationContext.getBean("userEntity", UserEntity.class);
        System.out.println(userEntity.toString());
        UserEntity userEntity2 = applicationContext.getBean("userEntity", UserEntity.class);
        System.out.println(userEntity == userEntity2);

        UserController userController = applicationContext.getBean("userController", UserController.class);
        System.out.println("userController:" + userController.test());

        MyFactoryBean myFactoryBean = applicationContext.getBean("&myFactoryBean", MyFactoryBean.class);
        MyFactoryBean myFactoryBean2 = applicationContext.getBean("&myFactoryBean", MyFactoryBean.class);
        System.out.println("myFactoryBean:" + (myFactoryBean == myFactoryBean2));

        // 这里每次调用的是getObject方法去new一个对象
        MemberEntity memberEntity = applicationContext.getBean("myFactoryBean", MemberEntity.class);
        MemberEntity memberEntity2 = applicationContext.getBean("myFactoryBean", MemberEntity.class);
        System.out.println("memberEntity:" + (memberEntity == memberEntity2));

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        applicationContext.close();
    }
}
