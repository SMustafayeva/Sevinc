package Lesson22.Lection;

public class ComparableComparator implements Comparable <ComparableComparator> {
    String title;
    String author;
    int price;
    int publicationYear;
    public ComparableComparator(String title, String author, int publicationYear, int price) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.price = price;
    }
    @Override
    public int compareTo(ComparableComparator o) {
        return Integer.compare(this.publicationYear,o.publicationYear);
      //  return o1.price- o2.price;
    }
    @Override
    public String toString() {
        return "ComparableComparator{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
