public class Transport {
    String engine;
    float weight, speed;
    byte[] coordinate;
    String color;
    int wheels;

    public void setValues(String _engine, float _weight, float _speed, byte[] _coordinate, String _color, int _wheels) {
        engine = _engine;
        weight = _weight;
        speed = _speed;
        coordinate = _coordinate;
        color = _color;
        wheels  = _wheels;
    }
    public String getValues(){
        String info = " Object engine " + engine + ". Weight " + weight + ". Speed " + speed + ". Color " + color + ". Wheels " +wheels + ". \n";
        String infoCoordinate = " Coordinates : \n";
        for (int i = 0; i < coordinate.length; i++) {
            infoCoordinate += coordinate[i] + "\n";
        }
        return info + infoCoordinate;
    }
}
