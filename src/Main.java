public class Main {
    public static void main(String[] args) {

        Transport volkswagen = new Transport();
        volkswagen.speed = 180;
        volkswagen.weight = 2000;
        volkswagen.engine = "Diesel";
        volkswagen.color = "Grey";
        volkswagen.coordinate = new byte[]{0, 0, 0};

        Transport truck = new Transport();
        truck.speed= 140;
        truck.weight = 4000;
        truck.engine = "Diesel";
        truck.color = "White";
        truck.coordinate = new byte[]{0, 0, 0};
        System.out.println("prękość traka " + truck.speed + " prękość volkswagen " + volkswagen.speed);
    }
}