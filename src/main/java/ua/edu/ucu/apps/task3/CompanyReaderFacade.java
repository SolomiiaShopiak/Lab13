package ua.edu.ucu.apps.task3;

public class CompanyReaderFacade {
    private PDLReader pdlReader;
    private BrandFetchReader brandFetchReader;

    public CompanyReaderFacade() {
        this.pdlReader = new PDLReader();
        this.brandFetchReader = new BrandFetchReader();
    }
    public Company fetch(String companyName) {
        // String companyPDL = pdlReader.fetch(companyName); 
        Company companyBF = brandFetchReader.fetch(companyName);
        return companyBF;
    }
}
