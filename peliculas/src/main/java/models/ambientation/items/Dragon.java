package models.ambientation.items;

public class Dragon {
    private String name;
    private Integer price;
    private String conditionDescription;

    public Dragon() {
        this.setName("Dragon");
        this.setPrice(100000);
        this.setConditionDescription("Optimal");
    }

    public Dragon(String conditionDescription, Integer price){
        this();
        this.setConditionDescription(conditionDescription);
        this.setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getConditionDescription() {
        return conditionDescription;
    }

    public void setConditionDescription(String conditionDescription) {
        this.conditionDescription = conditionDescription;
    }
}
