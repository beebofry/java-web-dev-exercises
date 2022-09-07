package exercises.technology.main;

public abstract class AbstractEntity {
    private static int nextTechId = 1;
    private final int techId;

    public AbstractEntity(){
        this.techId = nextTechId;
        nextTechId++;
    }

    public int getTechId() {
        return techId;
    }
}
