package collection;

public class Gato implements Comparable<Gato>{
    private String name;
    private String color;
    private Integer age;

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
    // em Collection tem o sort que faz comparação mas precisa da implementação
    // como fiz a implementação do Comparable devo sobrescrever o compareTo

    @Override
    public int compareTo(Gato g) { //ele guarda o valor em int e organiza em ordem
        return this.getName().compareToIgnoreCase(g.getName()); // ignorecase faz comparação de strings
    }
}
