/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musik;

/**
 *
 * @author Cloudy
 */
public final class Admin extends User {

    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public void showRole() {
        System.out.println("Role: Admin");
    }
}