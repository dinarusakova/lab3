package stuff.interfaces;

import stuff.Entity;
import stuff.Enums.Adverbs;
import stuff.inanimate.Furniture;
import stuff.inanimate.Place;

public interface ShortyAble {
    void look(Adverbs how);
    void notice(Entity entity);
    void lie(Adverbs how);
    void shidder(String[] feelings);
    void seeShorties(Entity entity, Adverbs  how);
    void stopPayingAttention(String[] feelings);
    void remember(Entity entity);
    void count(Place place);
    void prefer(Place place1, Place place2);
    void climbe(Adverbs how, Furniture furniture);
    void folow(Entity entity);

}
