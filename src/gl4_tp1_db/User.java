/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gl4_tp1_db;

/**
 *
 * @author ASUS
 */
public class User {
    private int id;
    private String login,pwd;

    public User() {
    }

    public User(int id, String login, String pwd) {
        this.id = id;
        this.login = login;
        this.pwd = pwd;
    }

    public User(String login, String pwd) {
        this.login = login;
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", login=" + login + ", pwd=" + pwd + '}';
    }
   
   
   
   
   
   
}