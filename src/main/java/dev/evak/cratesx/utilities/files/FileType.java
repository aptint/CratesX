package dev.evak.cratesx.utilities.files;

public enum FileType {

    CONFIG("config"), MESSAGES("messages");

    private String name;

    FileType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
