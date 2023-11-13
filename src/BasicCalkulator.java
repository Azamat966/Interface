public class BasicCalkulator implements Calkulator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtact(int a, int b) {
        return a-b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {

        if (b != 0) {
            return a / b;

        }else
            System.out.println("Нoльго болунбойт");

        return 0;
    }
}

