public class Cake {

    public String name;
    public int weight;
    public String filling;
    private String rating;


    public Cake(String name, int weight, String filling) {
        this.name = name;
        this.weight = weight;
        this.filling = filling;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public boolean isChocolate() {
        return filling.startsWith("Ш");
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String toString() {
        return name + "," + weight + "," + filling;
    }
}
