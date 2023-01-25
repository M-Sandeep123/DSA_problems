public class Shoe {

    private int number;
    private int count=0;
    private String category;
    private String design;

    public Shoe(int number, int count, String category, String design){
        this.number= number;
        this.category = category;
        this.design = design;
        this.count = count;
    }

    public int getNumber() {
        return number;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public String getDesign() {
        return design;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCount() {
        return count;
    }

}
