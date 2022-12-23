interface ITest {
    public String decorate();
}

public class Test implements ITest  {
    public static String TEST = "TEST";

    private int someNumber;

    public Test(int myNumber) {
        someNumber = myNumber;
    }

    @Override
    public String decorate() {
        return "Hello there!";
    }

    public int getNumber() {

        return this.someNumber;
    }

    public static String getTest() {
        return Test.TEST;
    }
}
