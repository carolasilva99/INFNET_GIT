package dominio;

import exceptions.InvalidDateException;

import javax.naming.InvalidNameException;
import java.util.List;

public class Teacher extends Person {
    private List<Subject> subjects;

    public Teacher(String fullName, String birthDate, List<Subject> subjects) throws InvalidNameException, InvalidDateException {
        super(fullName, birthDate);
        this.subjects = subjects;
    }

    @Override
    public void getStatus() {
        super.getStatus();
        if (subjects.isEmpty()) {
            System.out.println("Esse professor ainda não tem disciplinas cadastradas!");
        }
        else {
            System.out.println("Disciplinas lecionadas: ");
            this.printSubjects();
        }
    }

    private void printSubjects() {
        subjects.forEach(subject -> System.out.print("\t- " + subject.getName() + "\n"));
    }
}
