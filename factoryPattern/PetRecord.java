package factoryPattern;

public class PetRecord {

    private String petId;
    private String petName;
    private String breed;
    private Integer noOflives;
    private Pet pet;

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Integer getNoOflives() {
        return noOflives;
    }

    public void setNoOflives(Integer noOflives) {
        this.noOflives = noOflives;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}

