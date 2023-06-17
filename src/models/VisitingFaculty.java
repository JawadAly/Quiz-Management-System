package models;

public class VisitingFaculty extends Faculty{
    private String hoursWorked;
    
    public VisitingFaculty(){
        super();
    }

    public VisitingFaculty(String hoursWorked, String facName, String facEmail, String facPhone, String facGender, String facStatus) {
        super(facName, facEmail, facPhone, facGender, facStatus);
        this.hoursWorked = hoursWorked;
    }

    public String getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(String hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    
    
}
