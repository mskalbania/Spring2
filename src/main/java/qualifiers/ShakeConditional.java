package qualifiers;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Optional;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.StreamSupport;

public class ShakeConditional implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Optional<String> value = StreamSupport
                .stream(Spliterators.spliteratorUnknownSize(context.getBeanFactory().getBeanNamesIterator(), Spliterator.ORDERED), false)
                .filter(s -> s.equals("cookies"))
                .findAny();
        return value.isPresent();
    }
}
