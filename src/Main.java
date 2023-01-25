public class Main {
    public static void main(String[] args) {
        BonusMilesServices service = new BonusMilesServices();
        int price = 10000;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}
