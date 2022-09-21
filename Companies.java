package HW3;

import java.util.List;

public class Companies {
    private List<Company> companies;

    public List<Company> getCompanies () {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    public Companies () {
    }

    public Companies(List<Company> companies) {
    this.companies = companies;
    }
}
