package model;

/**
 * Created by dengkethatismine on 15-6-5.
 */
public class orderdetail {
    private int detailid;
    private int orderid;
    private int prid;
    private String prname;
    private int price;
    private int date;
    private int clientid;

    public orderdetail(int detailid, int orderid, int prid, String prname, int price, int date, int clientid) {
        this.detailid = detailid;
        this.orderid = orderid;
        this.prid = prid;
        this.prname = prname;
        this.price = price;
        this.date = date;
        this.clientid = clientid;
    }

    public orderdetail() {

    }

    public int getDetailid() {
        return detailid;
    }

    public void setDetailid(int detailid) {
        this.detailid = detailid;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public int getPrid() {
        return prid;
    }

    public void setPrid(int prid) {
        this.prid = prid;
    }

    public String getPrname() {
        return prname;
    }

    public void setPrname(String prname) {
        this.prname = prname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getClientid() {
        return clientid;
    }

    public void setClientid(int clientid) {
        this.clientid = clientid;
    }
}
