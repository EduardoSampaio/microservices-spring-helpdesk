package models.enums;

public enum ProfileEnum {
    ROLE_ADMIN("ROLE_ADMIN"),
    ROLE_CUSTOMER("ROLE_CUSTOMER"),
    ROLE_TECHNICIAN("ROLE_TECHNICIAN");

    private final String description;

    ProfileEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static ProfileEnum toEnum(final String value) {
        for (ProfileEnum profile : ProfileEnum.values()) {
            if (profile.getDescription().equals(value)) {
                return profile;
            }
        }
        throw new IllegalArgumentException("Invalid profile: " + value);
    }
}
