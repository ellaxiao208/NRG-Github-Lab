public class TestClassTwo {
    private String name; 
    private int age; 
    private int iq; 
    public TestClassTwo(String Name, int x, int y){
        this.name = Name;
        this.age = x;
        this.iq = y;
    }
    public String IQTest(int iq) {
        if (iq > 100){
            return "This person has a high IQ.";
        }
        else{
            return "This person is dumb.";
        }
    }
}
