public class Proxy implements DirtyWork{

    private Mastermind mastermind;

    @Override
    public void someAction() {
        if (mastermind == null) {
            mastermind = new Mastermind();
        }
        System.out.println("pre handle");
        mastermind.someAction();
        System.out.println("post handle");
    }
}
