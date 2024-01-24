public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 2.07;
        int weight = 78;
        int massFat = service.calculate(height, weight);
        System.out.println("Добрый день. Вам начисленны бонусные мили в размере:" + (massFat));
    }
}
