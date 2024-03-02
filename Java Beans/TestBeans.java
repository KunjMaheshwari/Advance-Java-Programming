// public class TestBeans{
//     private String name;
//     //setter
//     public void setName(String name){
//         this.name = name;
//     }
//     //getter
//     public String getName(){
//         return name;
//     }
// }

import java.io.Serializable; // used to store, save and restore the program using java beans

public class TestBeans implements java.io.Serializable{
    // declare private variables because of encapsulation
    private int id;
    private String name;
    public TestBeans(){ // default constructor -> without any parameters

    }
    public void setId(int id){ //parameters
        this.id = id;
    }
    public int getId(){ //without any parameters
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

/*Creating a Java Beans class
1. Implements java.io.Serializable;
2. Declare private variables
3. Declare no arguments constructor or default constructor
4. Declare getter and setter method
*/