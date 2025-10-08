package lambdas_streams.Acollection.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String title;
    private double price;

    public Manga(Long id, String title, double price) {
        Objects.requireNonNull(id, "ID must not be null");
        Objects.requireNonNull(title, "Title must not be null");
        this.id = id;
        this.title = title;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(title, manga.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Manga other) {
        //      this | other
        // -1 if this < other
        // 0 if this == other
        // 1 if this > other
//        if (this.id < other.id) {
//            return -1;
//        } else if (this.id.equals(other.id)) {
//            return 0;
//        } else {
//            return 1;
//        }
        return this.id.compareTo(other.id); // -> compare long
//        return Double.compare(this.price, other.price); -> compare price
//        Double.valueOf(this.price).compareTo(other.price); -> compare price
//        return  this.title.compareTo(other.title); -> compare String
    }
}
