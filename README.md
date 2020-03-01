2020年2月20日19:57:22
springboot会项目启动的时 自动加载 application.properties 配置文件
自定义配置文件 需要加注解
@PropertySource("classpath:xxx.properties")，这个注解专门用来加载指定位置的properties文件，Spring暂未提供加载指定位置yml文件的注解，

　　其实无论对于哪里的properties文件，当我们需要使用其中配置内容的时候，就在当前类的顶部加注该注解，将该配置文件加载到内存，
    这些配置文件一次加载即可多次使用。但更通用的情况是新建一个配置类，使用@Configuration标注，
    再加上之前的@PropertySource("classpath:xxx.properties")注解，而类的内部并不需要任何内容，这是一个纯粹的配置加载类。
    由于@Configuration的作用（底层为@Component），他会被Spring的扫描器扫到，并加载到JVM，并创建Bean，而创建的时候就会执行配置文件中配置项的加载。
    这种方式加载的配置可以在任何Spring管辖的类中用@Value("${key}")的方式使用
    
    https://www.cnblogs.com/V1haoge/p/7183408.html
    
    