public class Motocycle extends Transport{
    //вставляем свой конструктор
    public Motocycle(String _engine, float _weight, float _speed, byte[] _coordinate, String _color, int _wheels) {
        super(_engine, _weight, _speed, _coordinate, _color, _wheels);
    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Object move " + speed);
    }

    @Override
    public boolean stopObject() {
        this.speed = 0;
        return true;
    }
}
