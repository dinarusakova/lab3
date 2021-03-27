package stuff.creatures;

import stuff.interfaces.OtherAble;

public class OtherShorties extends Human implements OtherAble {
    public OtherShorties(String name) {
        super(name);
        System.out.println("Объект \""+name+"\" был создан!");
    }

    @Override
    public void wasIll() {
        System.out.println("Объект \""+this.getName()+"\" были простужены.");
    }
}
