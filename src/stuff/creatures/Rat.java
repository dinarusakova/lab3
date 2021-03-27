package stuff.creatures;

import stuff.Entity;
import stuff.Enums.Adverbs;
import stuff.inanimate.Furniture;
import stuff.inanimate.Place;
import stuff.interfaces.RatAble;

public class Rat extends Animals implements RatAble {
    public Rat(String name) {
        super(name);
    }

    @Override
    public void move(Adverbs how, Place place) {
        System.out.println("Объект: \""+this.getName()+"\" Как: \""+how.getTitle()+"\" переместился в место \""+place.getName()+"\".");
    }

    @Override
    public void stop(Place place) {
        System.out.println("Объект: \""+this.getName()+"\" остановился в месте \""+place.getName()+"\".");
    }

    @Override
    public void come(Furniture furniture)  {
        System.out.println("Объект: \""+this.getName()+"\" вылез из под объекта \""+furniture.getName()+"\".");
    }


    @Override
    public void watch(Entity entity) {
        System.out.println("Объект: \""+this.getName()+"\" посмотрел на объект \""+entity.getName()+"\".");
    }


    @Override
    public void wiggle(Entity entity) {
        System.out.println("Объект: \""+this.getName()+"\" стала шевелить объектом \""+entity.getName()+"\".");
    }



    public class Nose extends Entity {
        public Nose(String name) {
            super(name);
            System.out.println("Обьект \""+this.getName()+"\" принадлежащий крысе был создан!");
        }
    }

}
