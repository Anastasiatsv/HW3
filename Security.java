package HW3;

import java.time.LocalDate;

public class Security {
    public String name;
    public String[] currency;
    public String code;
    public LocalDate date;

    public String getName() {
        return name;
    }

    public String[] getCurrency() {
        return currency;
    }

    public String getCode() {
        return code;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString(){
        return "[name=\"" + name + "\", currency=\"" + currency + "\", code=\"" + code + "\", date=\"" + date + "\"]";
    }
}