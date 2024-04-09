package Lesson12.Mentor;

import java.util.Objects;

public class Contact {
    private String name;
    private int phone;
    private int operator;

    public Contact(String name, int phone) {
        this.name = name;
        this.operator = phone / 10000000;
        this.phone = phone % 10000000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOperator() {
        return operator;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int operator, int phone) {
        this.phone = phone;
   switch (operator){
       case 10,50,51,55,70,77:
           this.operator = operator;
           System.out.println(getOperator());
           break;
       default:
           System.out.println("Wrong operator code");
   }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return phone == contact.phone && Objects.equals(name, contact.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone);
    }

    @Override
    public String toString() {
        return getName() + " " + "+" + 994  + getPhone();
    }
}
