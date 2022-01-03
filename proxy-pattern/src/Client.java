public class Client {

    public static void main(String[] args) {

        DirtyWork dirtyWork = new Proxy();
        dirtyWork.someAction();
    }
}
