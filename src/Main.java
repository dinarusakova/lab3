import stuff.Entity;
import stuff.Enums.Adverbs;
import stuff.Enums.Feelings;
import stuff.creatures.OtherShorties;
import stuff.creatures.Rat;
import stuff.creatures.Shorty;
import stuff.inanimate.Furniture;
import stuff.inanimate.Place;

public class Main {
    public static void main(String[] args) {
        Rat rat1 = new Rat("Крыса");
        Place side = new Place("В сторонку");
        rat1.move(Adverbs.Slowly, side);

        Place near = new Place("Неподалеку");
        rat1.stop(near);
        Shorty neznaykaa = new Shorty("Незнайка");
        rat1.watch(neznaykaa);
        neznaykaa.look(Adverbs.Anxiously);
        Rat rat2 = new Rat("Другая крыса");
        Furniture lavka = new Furniture("Лавка");
        rat2.come(lavka);
        neznaykaa.notice(rat2);
        Rat.Nose nose = rat2.new Nose("Нос");
        rat2.wiggle(nose);
        Place klopisociety = new Place("клопиное общество");

        Place ratsociety = new Place("крысиное общество");
        neznaykaa.prefer(klopisociety,ratsociety);
        Furniture polka = new Furniture("полка");
        neznaykaa.climbe(Adverbs.Inversely, polka);
        Shorty pokladistiy = new Shorty("Покладистый");
        neznaykaa.folow(pokladistiy);
        neznaykaa.lie(Adverbs.Quietly);
        Entity klopi = new Entity("Клопы") {
        };
        System.out.println("Объект \"" + klopi.getName() + "\" был создан!");

        OtherShorties korotishki = new OtherShorties("Другие коротышки");
        korotishki.wasIll();
        new Entity("Кашель") {
            void choke(Entity entity) {
                System.out.println(this.getName() + " душит обьект \"" + entity.getName() + "\".");
            }
        }.choke(korotishki);

        new Entity("Ночные кошмары") {
            void treat(Entity entity) {
                System.out.println(this.getName() + " терзали обьект \"" + entity.getName() + "\".");
            }
        }.treat(korotishki);

        neznaykaa.shidder(new String[]{Feelings.Groans.getTitle(),Feelings.Hums.getTitle(),Feelings.Screams.getTitle()});
        neznaykaa.seeShorties(korotishki, Adverbs.NotSweety);
        neznaykaa.stopPayingAttention(new String[]{Feelings.Suffers.getTitle(),Feelings.Noise.getTitle(),Feelings.Stink.getTitle(),Feelings.Fug.getTitle(),Feelings.Bites.getTitle()});
        Shorty donut = new Shorty("Пончик");
        neznaykaa.remember(donut);
        Place rocket = new Place("Ракета");
        neznaykaa.count(rocket);







        }
}
