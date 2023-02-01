public class Main {
    public static void main(String[] args) {

        Transport volkswagen = new Transport("Diesel", 2000.0f,180.5f, new byte[] {1, 0, 1}, "Grey", 4 );
        //volkswagen.setValues("Diesel", 2000.0f,180.5f, new byte[] {0, 0, 0}, "Grey", 4 );
        //String res1 = volkswagen.getValues();
       // System.out.println(res1);
        /*volkswagen.speed = 180.5f;
        volkswagen.weight = 2000.0f;
        volkswagen.wheels = 4;
        volkswagen.engine = "Diesel";
        volkswagen.color = "Grey";
        volkswagen.coordinate = new byte[]{0, 0, 0};*/

        Transport truck = new Transport("Diesel",  4000.5f, 140.5f, new byte[]{10, 0, 20}, "White", 10);
        /*truck.speed= 140.5f;
        truck.weight = 4000.5f;
        truck.wheels = 10;
        truck.engine = "Diesel";
        truck.color = "White";
        truck.coordinate = new byte[]{10, 0, 20};*/
        //String res2 = truck.getValues();
        //System.out.println(res2);

        Transport bmw = new Transport("Gasolin", 1500.0f, 210.0f, new byte[]{20, 0, 20}, "Red", 4);
       /* bmw.speed = 210.0f;
        bmw.weight = 1500.0f;
        bmw.wheels = 4;
        bmw.engine = "Gasolin";
        bmw.color = "Red";
        bmw.coordinate = new byte[]{20, 0, 20};*/
        //String res3 = bmw.getValues();
       // System.out.println(res3);

        Transport audi = new Transport("Electric", 1900.0f, 230.0f, new byte[] {60, 0, 50}, "Green", 4);
        //audi.setValues("Electric", 1900.0f, 230.0f, new byte[] {60, 0, 50}, "Green", 4);
       // String res4 = audi.getValues();
       // System.out.println(res4);

        //System.out.println("prędkość Traka " + truck.speed + " prędkość Volkswagen " + volkswagen.speed +" prędkość BMW " + bmw.speed + " prędkość AUDI " + audi.speed);
    }
}