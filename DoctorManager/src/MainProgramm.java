
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Marshallein
 */
public class MainProgramm {

    static HashMap<String, Doctor> doc = new HashMap<String, Doctor>();
    static Doctor doctor = new Doctor();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MainProgramm ob = new MainProgramm();
        DoctorHash dh = new DoctorHash();
                
        dh.addDoctor(doctor, doc);
        dh.addDoctor(doctor, doc);
        
        dh.updateDoctor(doctor, doc);
        for(String i : doc.keySet()){
        System.out.println(doc.get(i).toString());}
        // TODO code application logic here
    }
    
    

}
