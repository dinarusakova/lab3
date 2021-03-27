package stuff.creatures;

import stuff.Entity;

public abstract class Animals extends Entity {
    public Animals(String name) {
        super(name);
        System.out.println("Животное с именем \"" + name + "\" было создано!");
    }
}
