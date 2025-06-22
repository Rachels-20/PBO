package Tugas1K13;

public class Square extends Rectangle {

    public Square() {
        super(1.0, 1.0);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        String status = isFilled() ? "berisi" : "tidak berisi";
        return "Bentuk ini berwarna "+getColor()+" dan juga "+status+
                ".\nIni berbentuk persegi dengan panjang sisi "
                +getSide()+"cm.\nMemiliki luas "+getArea()+
                " cm, serta keliling " +getPerimeter()+" cm.";
    }
}
