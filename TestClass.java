public class TestClass {
    private double number1;
    private double number2;
    public TestClass(double x, double y){
        this.number1 = x;
        this.number2 = y;
    }
    /** Adds number1 and number2 together */
    public double Addition() {
        return number1 + number2;
    }
    /** Subtracts number2 from number1 */
    public double Subtraction() {
        return number1 - number2;
    }
    /** Multiplies number1 and number2 */
    public double Multipication() {
        return number1 * number2;
    }
    public double getNumber1() {
        return number1;
    }
    public double getNumber2() {
        return number2;
    }
    public void setNumber1(double x) {
        this.number1 = x;
    }
    public void setNumber2(double y) {
        this.number2 = y;
    }
}
