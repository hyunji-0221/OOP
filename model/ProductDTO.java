package model;

public class ProductDTO {

    private int id;
    private int pno;
    private String name;
    private String company;
    private int price;

    @Override
    public String toString() {
        return "상품{" +
                "상품번호=" + pno +
                ", 상품명='" + name + '\'' +
                ", 회사명='" + company + '\'' +
                ", 가격=" + price +
                '}';
    }

    public ProductDTO(int pno, String name, String company, int price) {
        this.pno = pno;
        this.name = name;
        this.company = company;
        this.price = price;
    }

    public int getPno() {
        return pno;
    }

    public void setPno(int pno) {
        this.pno = pno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
