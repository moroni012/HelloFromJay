package cavalcanti;

public class Calculator {
    private float result;
    public Calculator() {
        result = 0.0f;
    }
    public void add(float value) {
        result += value;
    }
    public void subtract(float value) {
        result -= value;
    }
    public void multiply(float value) {
        result *= value;
    }
    public void divide(float value) {
        if (value == 0.0f) {
            result = 0.0f;
        } else {
            result /= value;
        }
    }
    public float reset() {

        return result;
    }
    public float getResult() {

        return result;
    }

}
