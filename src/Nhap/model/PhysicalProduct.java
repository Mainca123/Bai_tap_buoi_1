package Nhap.model;

public class PhysicalProduct extends Product {

    @Override
    public double totalPrice() {
        return this.getPrice() * this.getQuantity();
    }
}
