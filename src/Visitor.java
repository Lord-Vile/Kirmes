public class Visitor {

    private String name = "";
    private int money = 0;

    //SET everything

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    //GET everything

    public String getName() {
        return this.name;
    }

    public int getMoney() {
        return this.money;
    }

    public Visitor(String name, int money){
        this.name = name;
        this.money = money;
    }
}
