package singleinheritance.librarymanagement;

class Author extends Book {
    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book Info: Title = " + title + ", Publication Year = " + publicationYear);
        System.out.println("Author Info: Name = " + name + ", Bio = " + bio);
    }
}
