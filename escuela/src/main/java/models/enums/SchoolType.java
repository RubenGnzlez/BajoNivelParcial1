package models.enums;

public enum SchoolType {
    ELEMENTARY(Boolean.TRUE,Boolean.FALSE),
    JUNIOR_HIGH(Boolean.FALSE,Boolean.TRUE),
    BOTH(Boolean.TRUE,Boolean.TRUE);

    private boolean elementary_topics;
    private boolean junior_high_topics;

    SchoolType(boolean elementary_topics, boolean junior_high_topics) {
        this.elementary_topics = elementary_topics;
        this.junior_high_topics = junior_high_topics;
    }

    public boolean isElementary_topics() {
        return elementary_topics;
    }

    public boolean isJunior_high_topics() {
        return junior_high_topics;
    }
}
