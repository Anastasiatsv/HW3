package HW3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Company {
    int id;
    String name;
    String address;
    String phoneNumber;
    String inn;
    LocalDate founded;
    ArrayList<Security> securities;

    public ArrayList<Security> getFilterSecurities(){
        LocalDate today = LocalDate.now();
        securities
                .stream()
                .filter(s->s.date.isBefore(today));
        return securities;
    }
    public int getId () { return id; }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getFounded() {
        return founded;
    }

    public String getInn() {
        return inn;
    }

    public ArrayList<Security> getSecurities() {
        return securities;
    }

    @Override
    public String toString(){
        return "[id=\"" + id + "\", name=\"" + name + "\", address=\"" + address + "\", phoneNumber=\""
                + phoneNumber + "\", founded=\"" + founded + "\", inn=\"" + inn + "\", securities=\"" + securities + "\"]";
    }
}