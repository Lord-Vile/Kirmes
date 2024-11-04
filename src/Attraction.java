public class Attraction {

    private String attraktion = "";
    private String description = "";
    private int price = 0;


    //SET everything

    public void setAttraktion(String attraktion) {
        this.attraktion = attraktion;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    //GET eveything

    public String getAttraktion() {
        return attraktion;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public Attraction(String attraktion, String description, int price){
        this.attraktion = attraktion;
        this.description = description;
        this.price = price;
    }


}

