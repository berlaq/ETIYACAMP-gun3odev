package gun3odev2;


public class Instructor extends User {

     int expYear;

    public Instructor(int id, String name, String surname) {
        super(id,name,surname);
    }

    public Instructor() {
    }

    public int getExpYear() {
        return expYear;
    }

    public void setExpYear(int expYear) {
        this.expYear = expYear;
    }
}
