package model;

/**
 * Created by dengkethatismine on 15-6-5.
 */
public class orders {
    private int orderid;
    private int date;
    private int clientid;
    private String clientname;
    private int totalprice;
    private String memo;

    public orders() {
    }

    public orders(int orderid, int date, int clientid, String clientname, int totalprice, String memo) {
        this.orderid = orderid;
        this.date = date;
        this.clientid = clientid;
        this.clientname = clientname;
        this.totalprice = totalprice;
        this.memo = memo;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
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

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
