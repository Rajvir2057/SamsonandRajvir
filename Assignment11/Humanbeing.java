public class Humanbeing {
    // alocating fields
    public String name;
    public String nationality;
    public String gender;
    public int age;
    public int phoneNumber;

    // Forming two Constructors
    public Humanbeing() {
        this.name = "Samson";
        this.nationality = "sudanese";
        this.gender = "male";
        this.age = 20;
        this.phoneNumber = 0763205644;
    }

    // Constructors with parameters
    public Humanbeing(String n, String na, String g, int a, int p) {
        this.name = n;
        this.nationality = na;
        this.gender = g;
        this.age = a;
        this.phoneNumber = p;
    }
    //Forming three(3)methods
    public void walking(){
        System.out.println(name+" is walking");
        }
    public void Communicating(){
        System.out.println("This person"+ name +" is communicating about their: ");

        System.out.println(nationality);
        System.out.println(gender);
        System.out.println(age);
    }
    public void talking(){
        System.out.println(name+ " is talking about his phone number:" + phoneNumber);
    }

    // forming objects from the main method..
    public static void main(String[] args) {
        // first object;
        Humanbeing person = new Humanbeing();

        // second object;
        Humanbeing person2 = new Humanbeing("Samson", "sudanese", "male", 20, 0763205644);
        
        // call the methods;
        person2.walking();
        person2.Communicating();
        person2.talking();

} 
