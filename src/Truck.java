public class Truck extends Transport {
    private boolean isLoaded;

    //вставляем свой конструктор
    public Truck(String _engine, float _weight, float _speed, byte[] _coordinate, String _color, int _wheels) {
        super(_engine, _weight, _speed, _coordinate, _color, _wheels);
    }
    public Truck(String _engine, float _weight, float _speed, byte[] _coordinate, String _color, int _wheels, boolean isLoaded) {
        super(_engine, _weight, _speed, _coordinate, _color, _wheels);
        this.isLoaded = isLoaded;
    }

    public void setValues(String engine, float weight, float speed, byte[] coordinate, String color, int wheels, boolean isLoaded) {
        super.setValues(engine, weight, speed, coordinate, color, wheels);
        this.isLoaded = isLoaded;
        System.out.println("Второй метод SetValues ");
    }

    @Override
    protected String getValues() {
        System.out.println(super.getValues());
        return getLoaded();
    }

    public String getLoaded(){
        if(this.isLoaded == true)
            return "Truck is load";
        else
           return "Truck is not load ";
    }

}
