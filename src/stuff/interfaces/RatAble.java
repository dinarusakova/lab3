package stuff.interfaces;

import stuff.Entity;
import stuff.Enums.Adverbs;
import stuff.inanimate.Furniture;
import stuff.inanimate.Place;

public interface RatAble {
    void move(Adverbs how, Place place);
    void stop(Place place);
    void come(Furniture furniture);
    void watch(Entity entity);
    void wiggle(Entity entity);
}
