package lab1.mybatis.model;

public class Book {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.BOOK.ID
     *
     * @mbg.generated Wed Apr 27 22:00:45 EEST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.BOOK.NAME
     *
     * @mbg.generated Wed Apr 27 22:00:45 EEST 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.BOOK.AUTHOR_ID
     *
     * @mbg.generated Wed Apr 27 22:00:45 EEST 2022
     */
    private Integer authorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.BOOK.LIBRARY_ID
     *
     * @mbg.generated Wed Apr 27 22:00:45 EEST 2022
     */
    private Integer libraryId;

    private Author author;
    private Library library;

    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Library getLibrary() {
        return this.library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.BOOK.ID
     *
     * @return the value of PUBLIC.BOOK.ID
     *
     * @mbg.generated Wed Apr 27 22:00:45 EEST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.BOOK.ID
     *
     * @param id the value for PUBLIC.BOOK.ID
     *
     * @mbg.generated Wed Apr 27 22:00:45 EEST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.BOOK.NAME
     *
     * @return the value of PUBLIC.BOOK.NAME
     *
     * @mbg.generated Wed Apr 27 22:00:45 EEST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.BOOK.NAME
     *
     * @param name the value for PUBLIC.BOOK.NAME
     *
     * @mbg.generated Wed Apr 27 22:00:45 EEST 2022
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.BOOK.AUTHOR_ID
     *
     * @return the value of PUBLIC.BOOK.AUTHOR_ID
     *
     * @mbg.generated Wed Apr 27 22:00:45 EEST 2022
     */
    public Integer getAuthorId() {
        return authorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.BOOK.AUTHOR_ID
     *
     * @param authorId the value for PUBLIC.BOOK.AUTHOR_ID
     *
     * @mbg.generated Wed Apr 27 22:00:45 EEST 2022
     */
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.BOOK.LIBRARY_ID
     *
     * @return the value of PUBLIC.BOOK.LIBRARY_ID
     *
     * @mbg.generated Wed Apr 27 22:00:45 EEST 2022
     */
    public Integer getLibraryId() {
        return libraryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.BOOK.LIBRARY_ID
     *
     * @param libraryId the value for PUBLIC.BOOK.LIBRARY_ID
     *
     * @mbg.generated Wed Apr 27 22:00:45 EEST 2022
     */
    public void setLibraryId(Integer libraryId) {
        this.libraryId = libraryId;
    }
}