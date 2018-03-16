package models.enums;

public enum PersonsType {
    CHEF(Boolean.TRUE, Boolean.FALSE),
    HELPER(Boolean.TRUE, Boolean.TRUE),
    WAITER(Boolean.FALSE, Boolean.TRUE),
    MANAGER(Boolean.FALSE, Boolean.TRUE),
    DISH_WASHER(Boolean.TRUE, Boolean.FALSE),
    KITCHEN_ASSISTANT(Boolean.TRUE, Boolean.FALSE);

    private Boolean kitchenWork;
    private Boolean worksWithClient;

    PersonsType(Boolean kitchenWork, Boolean worksWithClient) {
        this.kitchenWork = kitchenWork;
        this.worksWithClient = worksWithClient;
    }

    public Boolean getKitchenWork() {
        return kitchenWork;
    }

    public Boolean getWorksWithClient() {
        return worksWithClient;
    }
}
