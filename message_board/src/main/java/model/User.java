package model;

import javax.persistence.*;

/**
 * Created by 傅華暘 on 2016/10/11.
 */
@Entity
public class user {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO) //for autonumber
    private int userid;
    @Column(nullable=false)
    private String name;
    @Column(unique = true, nullable=false)
    private String account;
    @Column(nullable=false)
    private String password;


    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
