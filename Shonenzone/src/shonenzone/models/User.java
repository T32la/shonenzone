/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shonenzone.models;

/**
 *
 * @author Lenovo
 */
public class User {
    private String username;
    private String email;
    private String password;
    private String validpassword;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getValidpassword() {
        return validpassword;
    }

    public void setValidpassword(String validpassword) {
        this.validpassword = validpassword;
    }
}
