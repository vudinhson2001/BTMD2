package danhba;

public class People {
    private int phone ;
    private String team;
    private String name ;
    private String sex;
    private String adress;

    public People() {
    }

    public People(int phone, String team, String name, String sex, String adress) {
        this.phone = phone;
        this.team = team;
        this.name = name;
        this.sex = sex;
        this.adress = adress;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "People{" +
                "phone=" + phone +
                ", team='" + team + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
