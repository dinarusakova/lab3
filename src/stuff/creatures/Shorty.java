package stuff.creatures;

import stuff.Entity;
import stuff.Enums.Adverbs;
import stuff.inanimate.Furniture;
import stuff.inanimate.Place;
import stuff.interfaces.ShortyAble;

import java.util.Arrays;


public class Shorty extends Human implements ShortyAble {
    public Shorty(String name) {
        super(name);
    }


    @Override
    public void look(Adverbs how) {
        System.out.println("Объект: \""+this.getName()+"\" Как: \""+how.getTitle()+"\" осмотрелся по сторонам.");
    }

    @Override
    public void notice(Entity entity) {
        System.out.println("Объект: \""+this.getName()+"\" заметил объект \""+ entity.getName()+"\".");
    }


    @Override
    public void lie(Adverbs how) {
        System.out.println("Объект: \""+this.getName()+"\" лежал  Как: \"" +how.getTitle()+"\".");


    }

    @Override
    public void shidder(String[] adverbs) {
        System.out.println("Объект: \""+this.getName()+"\" вздрагивал от:"+ Arrays.toString(adverbs)+".");
    }

    @Override
    public void seeShorties(Entity entity, Adverbs how) {
        System.out.println("Объект: \""+this.getName()+"\" заметил, что объекту \""+entity.getName()+"\" приходится Как: \"" + how.getTitle()+"\".");
    }

    @Override
    public void stopPayingAttention(String[] feelings) {
        System.out.println("Объект: \""+this.getName()+"\" перестал обращать внимание на:"+ Arrays.toString(feelings)+".");
    }

    @Override
    public void remember(Entity entity) {
        System.out.println("Объект: \""+this.getName()+"\" вспомнил об объекте: \"" +entity.getName()+"\".");
    }

    @Override
    public void count(Place place) {
        System.out.println("Объект: \""+this.getName()+"\" начал высчитывать насколько ему хватит еды в месте: \"" +place.getName()+"\".");
    }

    @Override
    public void prefer(Place place1, Place place2) {
        System.out.println("Объект: \""+this.getName()+"\" предпочитает спать в месте \"" +place1.getName()+"\", а не в месте \"" +place2.getName()+"\".");
    }



    @Override
    public void climbe(Adverbs how, Furniture furniture) {
        System.out.println("Объект: \""+this.getName()+"\" полез "+how.getTitle()+" на объект \""+ furniture.getName()+"\".");

    }

    @Override
    public void folow(Entity entity) {
        System.out.println("Объект: \""+this.getName()+"\" решил последовать совету объекта \""+ entity.getName()+"\".");

    }
}
