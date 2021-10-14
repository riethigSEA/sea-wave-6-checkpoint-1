package dev.wilders;

public abstract class ITPerson {

    protected String name;
    private String id;

    public ITPerson(String name) {
        this.name = name;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean hasReadAccess();
    public abstract boolean hasWriteAccess();

}
