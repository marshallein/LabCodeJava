
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
public abstract class Function {
    
   public boolean addDoctor (Doctor doctor,HashMap<String, Doctor> dc) throws Exception {
       return true;
   }
   
   public boolean updateDoctor(Doctor doctor,HashMap<String, Doctor> dc) throws Exception{
       return true;
   }
   
   public boolean deletedDoctor(Doctor doctor,HashMap<String, Doctor> dc) throws Exception{
       return true;
   }
   
   public HashMap <String, Doctor> searchDoctor (String input) throws Exception {
       return null;
   }
}
