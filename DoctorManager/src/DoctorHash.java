
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Marshallein
 */
public class DoctorHash {

    Validate validate = new Validate();

    public void addDoctor(ArrayList<Doctor> doc) {
        System.out.println("Enter Code : ");
        String code = validate.checkInputString();

        if (validate.checkCodeExist(code, doc) != null) {
            System.out.println("code exist!");
            return;
        }

        System.out.println("Enter Name : ");
        String name = validate.checkInputString();
        System.out.println("Enter Specialization : ");
        String spec = validate.checkInputString();
        System.out.println("Enter Availability : ");
        int avai = validate.checkInputInt();

        if (validate.checkCodeDup(doc, code, name, spec, avai)) {
            System.out.println("already exist!");
            return;
        }

        doc.add(new Doctor(code, name, spec, avai));
        System.out.println("add done");

    }

    public void updateDoctor(ArrayList<Doctor> doctor) {
        System.out.println("Enter Code to sreach");
        String search = validate.checkInputString();

        if (validate.checkCodeExist(search, doctor) != null) {
            Doctor updoc = validate.checkCodeExist(search, doctor);
            System.out.println("upcode");
            String upcode = validate.checkInputString();
            System.out.println("upname");
            String upname = validate.checkInputString();
            System.out.println("upspec");
            String upspec = validate.checkInputString();
            System.out.println("upvai");
            int upvai = validate.checkInputInt();

            updoc.setCode(upcode);
            updoc.setName(upname);
            updoc.setSpecialization(upspec);
            updoc.setAvailability(upvai);
            return;
        }
        System.out.println("cant found code!");

    }

    public void deletedDoctor(ArrayList<Doctor> doc) {
        System.out.println("remove code");
        String removecode = validate.checkInputString();
        Doctor removedoctor = validate.checkCodeExist(removecode, doc);

        if (validate.checkCodeExist(removecode, doc) != null) {
            doc.remove(removedoctor);
            System.out.println("remove done!");
            return;
        }
        System.out.println("cant remove!");

    }

    public void searchDoctor(ArrayList<Doctor> doc) {
        System.out.println("enter code search");

        String input = validate.checkInputStringToSearch();

        ArrayList<Doctor> listfoundbyname = new ArrayList<>();

        for (Doctor doctor : doc) {
            if (doctor.getCode().contains(input)) {
                listfoundbyname.add(doctor);
            }
        }
        
        if(input.equalsIgnoreCase("")){
            System.out.println(doc);
            return;
        }

        if (listfoundbyname.isEmpty()) {
            System.out.println("list empty");
        } else {
            System.out.println(listfoundbyname);
        }

    }

}
