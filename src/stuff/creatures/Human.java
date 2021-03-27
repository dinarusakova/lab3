package stuff.creatures;

import stuff.Entity;

public abstract class Human extends Entity {
    public Human(String name) {
            super(name);
        System.out.println("Коротышка с именем \"" + name + "\" был создан!");
    }
}
