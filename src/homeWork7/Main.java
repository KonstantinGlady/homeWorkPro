package homeWork7;


import java.lang.reflect.Method;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Class testClassFirst = TestClassFirst.class;
        try {
            start(testClassFirst);
        } catch (AnnotationIsNotUniqException e) {
            e.printStackTrace();
        }
    }

    private static void start(Class testClassFirst) throws AnnotationIsNotUniqException{
        int countBefor = 0;
        for (Method method:testClassFirst.getMethods()) {
           BeforeSuite beforeSuite = (BeforeSuite)method.getAnnotation(BeforeSuite.class);
           if (beforeSuite != null){
               countBefor++;
               System.out.println("Method name: " + method.getName());
               if (countBefor>1){
                   throw new AnnotationIsNotUniqException("more then 1 annotation");
               }
           }

        }

        Map<Integer,Method> map = new HashMap<>();

        for (Method method : testClassFirst.getMethods()) {

            Test test = (Test) method.getAnnotation(Test.class);
            if (test != null) {
                map.put(test.priority(),method);

            }
        }

        for (Map.Entry e: map.entrySet()){
            System.out.println("Priority: " + e.getKey() );
             System.out.println("Method name: "+((Method) e.getValue()).getName() );
        }

        int countAfter = 0;
        for (Method method:testClassFirst.getMethods()) {
            AfterSuite afterSuite = (AfterSuite)method.getAnnotation(AfterSuite.class);
            if (afterSuite != null){
                countAfter++;
                System.out.println("Method name: " + method.getName());
                if (countAfter>1){
                    throw new AnnotationIsNotUniqException("more then 1 annotation");
                }
            }

        }
    }
}
