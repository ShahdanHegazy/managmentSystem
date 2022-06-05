/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.managment.system;

/**
 *
 * @author Dell
 */
public class ProjectManagmentSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        employee ahmed =new employee();
        ahmed.setInfo("ahmed", "ahmedali@gmail.com", "123456", "01120678441");
        ahmed.dailyWorkingHours(5,10 );
    }
    
}
