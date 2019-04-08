package entity;

public abstract class Person {

    private String Name;
    private String Address;
    private String Email;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }


    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }


    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }
}
