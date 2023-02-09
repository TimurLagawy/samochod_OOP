public abstract class Transport {
    private String typeEngine;
   private float weight;
   public float speed;
    private byte[] coordinate;
    private String color;
    private int wheels;


    public Transport(String _engine, float _weight, float _speed, byte[] _coordinate, String _color, int _wheels) {
        //конструктор по умолчанию - можно прописать ч/либо характерное для всех объектов, указать методы get/setValues, в скобках() срау ввести наименования параметров
    System.out.println(" Object"  + " created: ");
    setValues(_engine, _weight,  _speed,  _coordinate,  _color, _wheels);
   // System.out.println(getValues());
}
public Transport(){}
public abstract void moveObject(float speed);
public abstract boolean stopObject();
        protected void setValues(String typeEngine, float weight, float speed, byte[] coordinate, String color, int wheels) {
        this.typeEngine = typeEngine;
        this.weight = weight;
        this.speed = speed;
        this.coordinate = coordinate;
        this.color = color;
        this.wheels  = wheels;
    }
    protected String getValues() {
        String info = " Object engine " + this.typeEngine + ". Weight " + this.weight + ". Speed " + this.speed + ". Color " + this.color + ". Wheels " + this.wheels + ". \n";
        String infoCoordinate = " Coordinates : \n";
        for (int i = 0; i < coordinate.length; i++) {
            infoCoordinate += coordinate[i] + "\n";
        }
        return info + infoCoordinate;
    }
        class Engine{
            private boolean isReady;
            private int motoHours;
            public void setValues(boolean isReady, int motoHours){
                this.isReady = isReady;
                this.motoHours = motoHours;
            }

            public void isReady(boolean isReady){
                this.isReady = isReady;

            }

            public void info(){
                if(isReady)
                    System.out.println("Engine is ready ");
                else
                    System.out.println("Engine is not ready. It passed " + motoHours + " moto_hours");
            }
    }
}
