package ua.edu.ucu.apps.task3;

public class Main {
    public static void main(String[] args) {
        // BrandFetchReader brandFetchReader = new BrandFetchReader();
        // brandFetchReader.fetch("ucu.edu.ua");

        CompanyReaderFacade readerFacade = new CompanyReaderFacade();
        Company company = readerFacade.fetch("ucu.edu.ua");
        System.out.println(company);
    }

}
