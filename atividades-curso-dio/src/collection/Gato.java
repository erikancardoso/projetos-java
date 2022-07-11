package collection;

public class Gato {
    private String name;
    private String color;
    private int age;

    public Gato (String nome, String cor, int idade){
        this.name = nome;
        this.color = cor;
        this.age = idade;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {return age;}

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
