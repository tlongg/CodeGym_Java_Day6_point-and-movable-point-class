import java.util.Arrays;

public class MovablePoint extends Point{
    float xSpped;
    float ySpeed;

    public MovablePoint(float x, float y, float xSpped, float ySpeed) {
        super(x, y);
        this.xSpped = xSpped;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public MovablePoint(float xSpped, float ySpeed) {
        this.xSpped = xSpped;
        this.ySpeed = ySpeed;
    }

    public float getxSpped() {
        return xSpped;
    }

    public void setxSpped(float xSpped) {
        this.xSpped = xSpped;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpped (float xSpped, float ySpeed){
        this.xSpped = xSpped;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed (){
        return new float[]{xSpped, ySpeed};
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpped=" + xSpped +
                ", ySpeed=" + ySpeed +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

}
