public class RealSubject implements Subject {

    private void mainJob() {
        System.out.println("heavy job start!!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("heavy job done!!");
    }

    @Override
    public void someRequest() {
        mainJob();
    }
}
