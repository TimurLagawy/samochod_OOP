public class Main {
    public static void main(String[] args) {

       // Car volkswagen = new Car("Diesel", 2000.0f,180.5f, new byte[] {1, 0, 1}, "Grey", 4 );

        Truck renault = new Truck("Diesel",  4000.5f, 140.5f, new byte[]{10, 0, 20}, "White", 10);

      //  Car bmw = new Car("Gasolin", 1500.0f, 210.0f, new byte[]{20, 0, 20}, "Red", 4);

      //  Car audi = new Car("Electric", 1900.0f, 230.0f, new byte[] {60, 0, 50}, "Green", 4);

      //  Motocycle suzuki = new Motocycle("Gasolin", 200.0f, 250.f, new byte[]{70,0,70},"Blue", 2);
        // renault.setLoaded(true);
        renault.getLoaded();
        renault.setValues("Gasolin", 200.0f, 250.f, new byte[]{70,0,70},"Blue", 2, true);

        System.out.println(renault.getValues());
      //  System.out.println("prędkość Traka " + renault.speed + " prędkość Volkswagen " + volkswagen.speed +" prędkość BMW " + bmw.speed + " prędkość AUDI " + audi.speed + " prędkość moto Suzuki " + suzuki.speed);
    }
}