package department;

public class Department{
    private String doctorName;
    private String degree;
    private String experience;
    private String specialty;
    String type;

    public Department(String doctorName, String degree,
                      String experience, String specialty, String type) {
        this.doctorName = doctorName;
        this.degree = degree;
        this.experience = experience;
        this.specialty = specialty;
        this.type = type;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getDegree() {
        return degree;
    }

    public String getExperience() {
        return experience;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getDepartment() {
        return type;
    }

}
