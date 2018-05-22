package qualifiers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import qualifiers.deserts.Shake;

@ComponentScan
public class Config {

    @Bean
    //@Qualifier("szejk")
    @Conditional(ShakeConditional.class)
    public Desert shake(){
        return new Shake();
    }
}
