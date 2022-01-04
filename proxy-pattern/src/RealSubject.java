public class RealSubject implements Subject {

    private void mainJob() {
        System.out.println("main job start!!");
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("ing...");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("main job done!!");
    }

    @Override
    public void someRequest() {
        mainJob();
    }
}
