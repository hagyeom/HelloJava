package practice.example.entity.base;

public class BaseEntity {

    private static long counter = 0;

    protected long id;

    {
        this.id = ++counter;
    }

    public long getId() {
        return id;
    }


}
