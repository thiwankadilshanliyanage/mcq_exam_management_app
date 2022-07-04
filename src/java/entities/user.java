/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Thiwanka
 */
public class user {
   
    private int id;
    private String u_name;
    private String email;
    private String password;
    private int role_id;

    public user(int id, String u_name, String email, String password, int role_id) {
        this.id = id;
        this.u_name = u_name;
        this.email = email;
        this.password = password;
        this.role_id = role_id;
    }
     
     public user(){
     
     }
     
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
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

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

}
