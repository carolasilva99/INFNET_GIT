package dominio;

import auxiliar.Constant;
import exceptions.InvalidIdException;
import exceptions.SchoolCapacityReachedException;

public class School {
    private static int NEXT_AVAILABLE_ID = 0;
    private Person[] people = new Person[Constant.MAX_PEOPLE];

    public int addPerson(Person person) throws SchoolCapacityReachedException {
        validateSchoolCapacity();
        int id = NEXT_AVAILABLE_ID;
        people[id] = person;
        NEXT_AVAILABLE_ID++;
        return id;
    }

    private void validateSchoolCapacity() throws SchoolCapacityReachedException {
        if (isSchoolFull()) {
            throw new SchoolCapacityReachedException("A escola só consegue administrar " + Constant.MAX_PEOPLE +
                    " pessoas e esse limite foi atingido!");
        }
    }

    public void getStatus(int id) throws InvalidIdException {
        validateId(id);
        people[id].getStatus();
    }

    private void validateId(int id) throws InvalidIdException {
        if (!isValidId(id)) {
            throw new InvalidIdException("O id informado não é válido!");
        }
    }

    private boolean isValidId(int id) {
        return id >= 0 && id < NEXT_AVAILABLE_ID;
    }

    private boolean isSchoolFull() {
        return NEXT_AVAILABLE_ID >= Constant.MAX_PEOPLE;
    }
}
