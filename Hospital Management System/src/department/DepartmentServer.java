package department;

import java.util.ArrayList;
public class DepartmentServer{
    public ArrayList<Department> departments=new ArrayList<Department>();
    public void createDepartment() {
        departments.add(new Department("Jubail",
                "FCPS, DA, MBBS","15 years",
                "Consultant, Anesthesiology Cardiac Anesthesiology",
                "Anesthesiology"));

        departments.add(new Department("Tushar",
                "FCPS, DA, MBBS, MD (R&I)","10 years",
                "Consultant, Radiology & Imaging",
                "Radiology & Imaging"));

        departments.add(new Department("Raton",
                "MBBS, M. Ch (Neurosurgery), Fellowship in Neuro intervention (INK, India)","5 years",
                "Senior Consultant, Neurosurgery",
                "Neuro Surgery"));

        departments.add(new Department("Ariful",
                "MBBS, MS (Cardio-Vascular & Thoracic Surgery), FACS (USA)","12 years",
                "Senior Consultant, Cardiac Surgery",
                "Cardiac  & Vascular Surgery"));

        departments.add(new Department("Tuhin",
                " MBBS, FCPS (Medicine), FACP (USA), FRCP (Edin), F. Gastro (Shanghai), FRCP (Glasgow)",
                "8 years", "Senior Consultant and Gastrointestinal, Liver & Pancreatic Diseases",
                "Gastroenterology"));
    }
}