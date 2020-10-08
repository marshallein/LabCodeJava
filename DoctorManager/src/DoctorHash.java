
import java.util.HashMap;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Marshallein
 */
public class DoctorHash extends Function {
    
    Validate validate = new Validate();
    
    public int menu() {
        System.out.println("1. Add doctor");
        System.out.println("2. Update doctor");
        System.out.println("3. Delete doctor");
        System.out.println("4. Search doctor");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = validate.checkInputIntLimit(1, 5);
        return choice;
    }
    
    @Override
    public boolean addDoctor(Doctor doctor, HashMap<String, Doctor> doc)  {
        System.out.println("Enter Code : ");
         String code = validate.checkInputString();
        
        String codetokey = code;
        
        if (doc.containsKey(codetokey)) {
            System.out.println("Code exist!");
            return false;
        }
        System.out.println("Enter Name : ");
        String name = validate.checkInputString();
        System.out.println("Enter Specialization : ");
        String spec = validate.checkInputString();
        System.out.println("Enter Availability : ");
        int avai = validate.checkInputInt();
        
        doc.put(codetokey,new Doctor(code,name,spec,avai));
        return true;
        
    }
    
    @Override
    public boolean updateDoctor(Doctor doctor, HashMap<String, Doctor> doc)  {
        System.out.println("Enter Code to sreach");
        String search = validate.checkInputString();
        
        
       
        
    }
    
    @Override
    public boolean deletedDoctor(Doctor doctor, HashMap<String, Doctor> doc) throws Exception {
        return false;
        
    }
    
    @Override
    public HashMap<String, Doctor> searchDoctor(String input) throws Exception {
        return null;
        
    }
    
   public Doctor getDoctorCode(String code,HashMap<String, Doctor> doc){
       Doctor d = new Doctor();
       for(String i : doc.keySet()){
           if(doc.containsKey(i)){
               
       }
       
   }
    
}
