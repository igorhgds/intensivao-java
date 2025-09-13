package classes_objetos_metodos.Einitializationblock.domain;

public class Anime {
    private String name;
    private int[] episodes;
    // 1 - Memory allocated
    // 2 - Each class attribute is initialized
    // 3 - Init block is execute
    // 4 - The constructor is executed
    {
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
