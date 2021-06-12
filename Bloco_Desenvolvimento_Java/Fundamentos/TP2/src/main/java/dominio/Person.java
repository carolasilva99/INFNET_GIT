package dominio;

import exceptions.DateFormatException;

import javax.naming.InvalidNameException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract class Person {
    private int id;
    private Name name;
    private LocalDate birthDate;

    public Person(String fullName, String birthDate) throws DateFormatException, InvalidNameException, DateTimeException {
        this.name = new Name(fullName);
        setBirthDate(birthDate);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) throws DateFormatException, DateTimeException {
        String[] date = birthDate.split("/");
        validateDateFormat(date);
        this.birthDate = LocalDate.of(Integer.parseInt(date[2]), Integer.parseInt(date[1]), Integer.parseInt(date[0]));
    }

    private void validateDateFormat(String[] date) throws DateFormatException {
        if (!isValidDateFormat(date))
            throw new DateFormatException("A data deve ser fornecida no formato dd/mm/aaaa");
    }

    private boolean isValidDateFormat(String[] date) {
        return date.length == 3;
    }

    public void getStatus() {
        System.out.println("---------------------- SITUAÇÃO ----------------------");
        System.out.println("Id: " + this.getId());
        System.out.println("Nome: " + this.getName().getFullName());
        System.out.println("Data de nascimento: " + this.getBirthDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Idade: " + this.getAge());
    }

    private int getAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }
}
