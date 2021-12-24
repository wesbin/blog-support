public class Sub {

    private final String[] arr = {"a", "b", "c", "d"};
    
    void subMethod() {
        for (String s : arr) {
            System.out.println(s.toUpperCase());
        }

    }

    void subMethod2() {
        for (String s : arr) {
            System.out.println(s.toUpperCase());
        }
    }
}
