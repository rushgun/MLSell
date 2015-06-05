package model;

/**
 * Created by dengkethatismine on 15-6-5.
 */
public class clients {
    private int prid;
    private String name;
    private String phonenum;
    private String email;
    private String qq;
    private int datetoadd;

    public clients(int prid, String name, String phonenum, String email, String qq, int datetoadd) {
        this.prid = prid;
        this.name = name;
        this.phonenum = phonenum;
        this.email = email;
        this.qq = qq;
        this.datetoadd = datetoadd;
    }

    public clients() {

    }

    public int getPrid() {
        return prid;
    }

    public void setPrid(int prid) {
        this.prid = prid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public int getDatetoadd() {
        return datetoadd;
    }

    public void setDatetoadd(int datetoadd) {
        this.datetoadd = datetoadd;
    }
}
