public class Voter {
    public int getName;
    public String name;
    public String address;
    int age;

    public Voter(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public Voter() {
        // System.out.println("You date: " + name+" "+address+""+age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 15) {
            this.age = age;
        } else {
            System.out.println("Voter have been 16+ years old");
        }
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setAddress(String adreess) {
        this.address = adreess;
    }

    void vote() {
        System.out.println("I can votes");
    }

    void askName() {
        System.out.println("What is your name?");
        System.out.println("My name is " + name);
    }

}

