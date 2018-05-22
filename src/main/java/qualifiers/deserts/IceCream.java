package qualifiers.deserts;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import qualifiers.Desert;

@Component
@Qualifier("ice")
public class IceCream implements Desert {
}
