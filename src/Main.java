public class Main {
    public static void main(String[] args) {
        Calkulator calkulator = new BasicCalkulator();
        System.out.println("Операция плюс: "+calkulator.add(10,20));
        System.out.println("Операция минус: "+calkulator.subtact(50,10));
        System.out.println("Операция умножения: "+calkulator.multiply(30,20));
        System.out.println("Операция болуу: "+calkulator.divide(10,0));
        
    }
}
