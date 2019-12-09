package homeWork7;

public class TestClassFirst {

    String name;

    public TestClassFirst(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Test(priority = 3)
    public void method1(){
        System.out.println("method 1 ");
    }

    @Test(priority = 6)
    public void method2(){
        System.out.println("method 2");
    }
    @Test(priority = 1)
    public void method3(){
        System.out.println("method 3");
    }

    @BeforeSuite("Start")
    public void methodStart(){
        System.out.println("start");
    }

    @AfterSuite(" finish")
     public void methodFinish(){
        System.out.println("finish");
    }
}
