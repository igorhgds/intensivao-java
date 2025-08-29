package classes_objetos_metodos.Dconstructor.domain;

public class Anime {
    private String name;
    private String type;
    private int epsodes;
    private String status;
    private String studio;

    public Anime(String name, String type, int epsodes, String status) {
        //this();  forma de chamar um construtor no outro
        //this.Anime() -> "funcionaria" se fosse metodo
        this.name = name;
        this.type = type;
        this.epsodes = epsodes;
        this.status = status;
    }

    public Anime(String name, String type, int epsodes, String status,String studio) {
        this(name, type, epsodes, status);
        this.studio = studio;
    }

    public Anime() {
        System.out.println("Inside no args Constructor");
    }

    public void print(){
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.epsodes);
        System.out.println(this.status);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEpsodes() {
        return epsodes;
    }

    public void setEpsodes(int epsodes) {
        this.epsodes = epsodes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
