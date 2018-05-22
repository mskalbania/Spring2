import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import qualifiers.Config;
import qualifiers.Desert;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Config.class})
public class Tests {

    @Autowired
    @Qualifier("ice")
    private Desert desert;

    @Autowired
    @Qualifier("cookie")
    private Desert desert2;

    @Autowired
    @Qualifier("shake")
    private Desert desert3;

    @Test
    public void test1() {
        assertThat(desert).isNotNull();
        assertThat(desert2).isNotNull();
        assertThat(desert3).isNotNull();
    }
}
