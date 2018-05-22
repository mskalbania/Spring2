package qualifiers.deserts;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import qualifiers.Desert;

@Component
@Qualifier("cookie")
public class Cookies implements Desert {
}
