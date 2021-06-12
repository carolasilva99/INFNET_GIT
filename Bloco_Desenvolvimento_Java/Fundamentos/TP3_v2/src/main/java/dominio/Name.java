package dominio;

import auxiliar.Constant;

import javax.naming.InvalidNameException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Name {
    private String firstName;
    private String middleNames;
    private String lastName;

    public Name (String fullName) throws InvalidNameException {
        List<String> separatedNames = getAllSeparatedNames(fullName);
        validateNames(separatedNames);
        this.firstName = putFirstLetterCapitalized(separatedNames.get(0));
        this.lastName = putFirstLetterCapitalized(separatedNames.get(separatedNames.size() - 1));
        setMiddleNames(separatedNames.subList(1, separatedNames.size() - 1));
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + Constant.EMPTY_SPACE + middleNames + Constant.EMPTY_SPACE + lastName;
    }

    private void setMiddleNames(List<String> middleNames) {
        StringBuilder middleName = new StringBuilder();

        for (String name : middleNames) {
            middleName.append(putFirstLetterCapitalized(name));
            middleName.append(Constant.EMPTY_SPACE);
        }

        this.middleNames = middleName.toString().trim();
    }

    private List<String> getAllSeparatedNames(String fullName) {
        List<String> allWordsSeparatedBySpace = Arrays.asList(fullName.split(Constant.EMPTY_SPACE));
        return allWordsSeparatedBySpace
                .stream()
                .filter(name -> !name.equals(Constant.EMPTY_SPACE) && !name.equals(""))
                .collect(Collectors.toList());
    }

    private void validateNames(List<String> separatedNames) throws InvalidNameException {
        if (separatedNames.size() < 2) {
            throw new InvalidNameException("É necessário fornecer o nome completo!");
        }
    }

    private String putFirstLetterCapitalized(String word) {
        return Character.toTitleCase(word.charAt(0)) + word.toLowerCase(Locale.ROOT).substring(1);
    }

    @Override
    public String toString() {
        return firstName + Constant.EMPTY_SPACE + middleNames + Constant.EMPTY_SPACE + lastName;
    }
}
