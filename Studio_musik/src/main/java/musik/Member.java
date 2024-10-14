/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musik;

/**
 *
 * @author Cloudy
 */
public final class Member extends User {

    public Member(String username, String password) {
        super(username, password);
    }

    @Override
    public void showRole() {
        System.out.println("Role: Member");
    }
}