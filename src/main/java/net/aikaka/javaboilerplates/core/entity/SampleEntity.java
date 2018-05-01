package net.aikaka.javaboilerplates.core.entity;

public class SampleEntity {
    private String name;

    public SampleEntity() {
        // Do nothing
    }

    public SampleEntity name(String name){
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SampleEntity that = (SampleEntity) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
