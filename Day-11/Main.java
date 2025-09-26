class BatchClass {
    void greetingBatch2(){
        System.out.println("I am from 301");
    }

    void greetingBatch3(){
        System.out.println("I am from 302");
    }
}

public class Main {
    public static void main(String[] args) {
        BatchClass batch2 = new BatchClass();
        batch2.greetingBatch2();
        BatchClass batch3 = new BatchClass();
        batch3.greetingBatch3();
    }
}
