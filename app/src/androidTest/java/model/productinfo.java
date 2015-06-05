package model;


/**
 * Created by dengkethatismine on 15-6-5.
 */
public class productinfo {
    private int prid;
    private String prname;
    private int price;
    private String introduce;
    private String memo;

    public productinfo() {
    }

    public productinfo(int prid, String prname, int price, String introduce, String memo) {
        this.prid = prid;
        this.prname = prname;
        this.price = price;
        this.introduce = introduce;
        this.memo = memo;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPrname() {
        return prname;
    }

    public void setPrname(String prname) {
        this.prname = prname;
    }

    public int getPrid() {
        return prid;
    }

    public void setPrid(int prid) {
        this.prid = prid;
    }
    //private Blob photo;
}

