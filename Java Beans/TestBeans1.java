//Program to access Javabeans 
public class TestBeans1 {
    public static void main(String args[]) {
        // Creating an instance of TestBeans
        TestBeans t = new TestBeans();
        
        // Setting the name
        t.setName("Kunj Maheshwari");
        
        // Getting and printing the name
        System.out.println(t.getName());
    }
}