
import java.util.HashMap;
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
public class MainProgramm {

    static ArrayList<Doctor> ldoc = new ArrayList<>();
    static Doctor doctor = new Doctor();
    static Menu menu = new Menu();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DoctorHash dh = new DoctorHash();

        int choice = 0;
        boolean flags = true;

        while (flags) {
            choice = menu.menu();

            switch (choice) {
                case 1:
                    dh.addDoctor(ldoc);
                    break;
                case 2:
                    dh.updateDoctor(ldoc);
                    break;
                case 3:
                    dh.deletedDoctor(ldoc);
                    break;
                case 4:
                    dh.searchDoctor(ldoc);
                    break;
                case 5:
                    flags = false;
                    break;

                default:
                    return;

            }

        }

        // TODO code application logic here
    }

}
