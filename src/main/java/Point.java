public class Point {
    private float x, y;
    Point(float x, float y){
        this.x=x;
        this.y=y;
    }
    Point(){
        x=0;
        y=0;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        setX(x);
        setY(y);
    }
    public float[] getXY(){
        float[] array={x,y};
        return array;
    }

    @Override
    public String toString() {
        return "("+x+","+y+")";
    }


}
