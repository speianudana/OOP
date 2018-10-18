package Dana;

import java.util.Date;

class Patient {
    String  id;
    FullName name;
    Gender gender;
    Date birthdate;
    Integer age;
    Date accepted;
    History sickness;
    String[] prescriptions;
    String[] allergies;
    String[] specialReqs;
    OperationsStaff[]operationsStaffs;
}
