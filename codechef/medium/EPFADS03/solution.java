interface Developer {
    void code();
}

interface Tester {
    void test();
}

class QualityEngineer implements Developer, Tester {
    @Override
    public void code() {
        System.out.println("Writing code...");
    }

    @Override
    public void test() {
        System.out.println("Running tests...");
    }
}

class Codechef {
    public static void main(String[] args) {
        QualityEngineer qa = new QualityEngineer();
        qa.code();
        qa.test();
    }
}