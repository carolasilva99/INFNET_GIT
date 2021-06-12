package dominio;

import exceptions.DateFormatException;

import javax.naming.InvalidNameException;
import java.util.List;

public class Teacher extends Person {
    private List<Subject> subjects;

    public Teacher(String fullName, String birthDate, List<Subject> subjects) throws InvalidNameException, DateFormatException {
        super(fullName, birthDate);
        this.subjects = subjects;
    }

    @Override
    public void getStatus() {
        super.getStatus();
        System.out.println("Disciplinas: ");
        this.printSubjects();
    }

    private void printSubjects() {
        subjects.forEach(subject -> System.out.print("\t- " + subject.getName() + "\n"));
    }
}
