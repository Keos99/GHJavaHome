package GHHomeProject.Chapter6;

class Book{
    private String title;
    private String author;
    private int pubdate;

    Book(String title, String author, int pubdate){
        this.title = title;
        this.author = author;
        this.pubdate = pubdate;
    }

    void show(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubdate);
        System.out.println();
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Book books[] = new Book[5];

        books[0] = new Book("Java","SuperMan",2018);
        books[1] = new Book("GiperJava", "SpiderMan",2019);
        books[2] = new Book("MegaJava","MetroidPrime",2020);
        books[3] = new Book("SexyJava","Bayoneta",2017);
        books[4] = new Book("AllJava","iluminati",2021);

        for (int i = 0; i < books.length;i++){
            books[i].show();
        }
    }
}
