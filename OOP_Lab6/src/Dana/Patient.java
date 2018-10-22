package Dana;

import java.util.Date;

class Patient extends Person {
    String  id;
    Integer age;
    Date accepted;
    History sickness;
    String[] prescriptions;
    String[] allergies;
    String[] specialReqs;
    OperationsStaff operationsStaffs;
}
