package br.atividade.recycleview.marcos;

public class Dogs {

    private String name;
    private String age;
    private String race;
    private String color;
    private int backgroundColor;

    public Dogs(String name, String age, String race, String color, int backgroundColor) {
        this.name = name;
        this.age = age;
        this.race = race;
        this.color = color;
        this.backgroundColor = backgroundColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
    }


}
