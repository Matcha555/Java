package L_35;

public class Author {
    private String name;
    private Day dateOfBirth;

    public Author(String n, Day dob) {
        this.name = n;
        this.dateOfBirth = dob;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public Day getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(Day dob) {
        this.dateOfBirth = dob;
    }
}
