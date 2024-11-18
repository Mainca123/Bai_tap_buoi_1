package Nhap.Bai_tap_b4;

public class TacGia {
    private String name;
    private int yearBone, yearDie;

    ///Constructor
    public TacGia() {}
    public TacGia(String name, int yearBone, int yearDie) {
        this.yearBone = yearBone;
        this.name = name;
        this.yearDie = yearDie;
    }

    ///Getter Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getYearBone() {
        return yearBone;
    }
    public void setYearBone(int yearBone) {
        this.yearBone = yearBone;
    }

    public int getYearDie() {
        return yearDie;
    }
    public void setYearDie(int yearDie) {
        this.yearDie = yearDie;
    }

    @Override
    public String toString() {
        return "TacGia{" +
                "name='" + name + '\'' +
                ", yearBone=" + yearBone +
                ", yearDie=" + yearDie +
                '}';
    }
}
