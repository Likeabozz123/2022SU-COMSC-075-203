package QuestionThree;

public class Dog {

    private int age;
    private String name;
    private String owner;
    private String breed;

    public Dog(int age, String name, String owner, String breed) {
        this.age = age;
        this.name = name;
        this.owner = owner;
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
