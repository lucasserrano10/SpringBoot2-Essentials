package academy.devdojo.springboot2_essentials.domain;

public class Anime {
    private String name;

    public Anime(String name) {
        this.name = name;
    }

    public Anime(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
