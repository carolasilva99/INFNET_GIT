package dominio;

import exceptions.InvalidDateException;

import javax.naming.InvalidNameException;

public class Student extends Person {
    private ReportCard reportCard;

    public Student(String fullName, String birthDate) throws InvalidNameException, InvalidDateException {
        super(fullName, birthDate);
        this.reportCard = new ReportCard();
    }

    public Student(String fullName, String birthDate, ReportCard reportCard) throws InvalidNameException, InvalidDateException {
        super(fullName, birthDate);
        this.reportCard = reportCard;
    }

    public ReportCard getReportCard() {
        return reportCard;
    }

    public void setReportCard(ReportCard reportCard) {
        this.reportCard = reportCard;
    }

    @Override
    public void getStatus() {
        super.getStatus();
        reportCard.print();
    }
}
