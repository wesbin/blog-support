public class Proxy implements Subject {

    private RealSubject mastermind;

    @Override
    public void someRequest() {
        if (mastermind == null) {
            mastermind = new RealSubject();
        }
        System.out.println("sub Job!!");
        mastermind.someRequest();
        System.out.println("another sub Job!!");
    }
}
