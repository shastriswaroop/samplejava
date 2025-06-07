package shastri.swaroop.java_16;

public class Record {
    record Point(int x, int y){};

    record Person(String fName, String lName, String email, int age){
        Person{
            if(fName == null || lName == null ){
                throw new IllegalArgumentException("Name is mandatory");
            }
        }
    };

    public static void main(String[] args) {

        Person p = new Person("Swaroop", "Shastri", "abc", 51);
        System.out.println(p.lName);
    }
}