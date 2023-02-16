package ie.atu.productv6;

public class Horse extends Animal {
    private String dam;
    private String sire;
    private Integer height;

    public Horse() {
        super();
    }

    public String getDam() {
        return dam;
    }

    public void setDam(String dam) {
        this.dam = dam;
    }

    public String getSire() {
        return sire;
    }

    public void setSire(String sire) {
        this.sire = sire;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "dam='" + dam + '\'' +
                ", sire='" + sire + '\'' +
                ", height=" + height +
                '}';
    }
}


