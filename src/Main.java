import db.DB;

public class Main {
    public static void main (String[] args) {
        DB db = new DB();
        info("Hello world ", 4.0f);
    }
        public static void info () {
            System.out.println("Hello ");
        }
        public static void info(String word){
            System.out.println(word + " !");
        }
        public static void info(String word, float num){
            System.out.println(word + num + " !");
        }

    }
        /*public static void main(String[] args) {
            DB db = new DB();

        Car volkswagen = new Car("Diesel", 2000.0f,180.5f, new byte[] {1, 0, 1}, "Grey", 4 );
        volkswagen.engine.setValues(true, 400);
        volkswagen.engine.info();

        Truck renault = new Truck("Diesel",  4000.5f, 140.5f, new byte[]{10, 0, 20}, "White", 10);
        renault.engine.setValues(true, 700);
        renault.engine.info();

        Car bmw = new Car("Gasolin", 1500.0f, 210.0f, new byte[]{20, 0, 20}, "Red", 4);
        bmw.engine.setValues(false, 3000);
        bmw.engine.info();
        bmw.moveObject(0.0f);
        bmw.stopObject();

        Car audi = new Car("Electric", 1900.0f, 230.0f, new byte[] {60, 0, 50}, "Green", 4);
        audi.engine.setValues(true, 4500);
        audi.engine.info();
        audi.moveObject(230.0f);


        Motocycle suzuki = new Motocycle("Gasolin", 200.0f, 250.f, new byte[]{70,0,70},"Blue", 2);
        suzuki.engine.setValues(false, 5000);
        suzuki.engine.info();

      //  renault.getLoaded();
      //  renault.setValues("Gasolin", 200.0f, 250.f, new byte[]{70,0,70},"Blue", 2, true);

      //  System.out.println(renault.getValues());
      //  System.out.println("prędkość Traka " + renault.speed + " prędkość Volkswagen " + volkswagen.speed +" prędkość BMW " + bmw.speed + " prędkość AUDI " + audi.speed + " prędkość moto Suzuki " + suzuki.speed);
     Car flyCar = new Car("Gasolin", 200.0f, 250.f, new byte[]{70,20,70},"Blue", 2) {
         @Override
         public void moveObject(float speed) {
             super.moveObject(speed);

             this.engine.isReady(true);
             System.out.println("Car is fly!!!");
         }
     };
     flyCar.moveObject(450.f);
    }
}*/