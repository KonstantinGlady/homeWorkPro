package homeWork7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Test {
  //  public  enum  Priority{first,second,third,fourth,fifth,sixth,seventh,eighth,ninth,tenth}
  //  Priority priority() default Priority.first;
    int priority() default 0;
}
