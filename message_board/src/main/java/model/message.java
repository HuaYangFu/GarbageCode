package model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by 傅華暘 on 2016/10/8.
 */
@Entity
public class message {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO) //for autonumber
    private int num;
    @Column
    private String title;
    @Column(length = 21845)
    private String message;
    @Column
    private String author;
    @Column
    @Type(type="date")
    private Date Start_date;
    @Column
    @Type(type="date")
    private Date End_date;


    public int getNum() {return num;}

    public void setNum(int num) {this.num = num;}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getStart_date() {
        return Start_date;
    }

    public void setStart_date(Date start_date) {
        Start_date = start_date;
    }

    public Date getEnd_date() {
        return End_date;
    }

    public void setEnd_date(Date end_date) {
        End_date = end_date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
