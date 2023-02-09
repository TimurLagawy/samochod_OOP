public class Car extends Transport implements ILights{
    private boolean isOn;

    public Engine engine = new Engine();
    public Car(){

    }
    //вставляем свой конструктор
    public Car(String _engine, float _weight, float _speed, byte[] _coordinate, String _color, int _wheels) {
        super(_engine, _weight, _speed, _coordinate, _color, _wheels);
    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Object move " + speed + " km/h");
    }

    @Override
    public boolean stopObject() {
        this.speed = 0;
        return true;
    }

    @Override
    public void setLight(boolean set) {
        this.isOn = set;

    }

    @Override
    public void blinkLight() {
        System.out.println("We blinks lights ");
    }
}
