package drai.dev.data.games.instagram.fra;


import drai.dev.data.pokemon.bago.*;
import drai.dev.gravelmon.pokemon.attributes.*;
public class Bago extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Bago();
    private Bago() {
        super("bago");
    }

    @Override
    public void init(String resourcesDir) {
        super.init(resourcesDir);
        newPokemon.forEach(pokemon1 -> {
            pokemon1.getLabels().add(Label.INSTAGRAM);
        });
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Cattail().addLabels(Label.STARTER));
        addNewPokemon(new Taillico().addLabels(Label.STARTER));
        addNewPokemon(new Felorest().addLabels(Label.STARTER));
        addNewPokemon(new Searther().addLabels(Label.STARTER));
        addNewPokemon(new Serfiery().addLabels(Label.STARTER));
        addNewPokemon(new Serfierno().addLabels(Label.STARTER));
        addNewPokemon(new Marmink().addLabels(Label.STARTER));
        addNewPokemon(new Marshten().addLabels(Label.STARTER));
        addNewPokemon(new Ocermine().addLabels(Label.STARTER));

        addNewPokemon(new Picact());
        addNewPokemon(new Cactalop());
        addNewPokemon(new Shelspout().fishingSpawnFromExisting());
        addNewPokemon(new Deployster());
        addNewPokemon(new Scrappet());
        addNewPokemon(new Rubbleruin());
        addNewPokemon(new Seworn());
        addNewPokemon(new Cloacoon());
        addNewPokemon(new Silkenfly());
        addNewPokemon(new Furtune());
        addNewPokemon(new Furvoyant());
        addNewPokemon(new Sheetom());
        addNewPokemon(new SheetomXL());
        addNewPokemon(new Shrimpal().fishingSpawnFromExisting());
        addNewPokemon(new Lobssir());
        addNewPokemon(new Snorzza());
        addNewPokemon(new Awoof());
        addNewPokemon(new Wooffian());
        addNewPokemon(new Brawlawoo());
        addNewPokemon(new Komido());
        addNewPokemon(new Komoxic());
        addNewPokemon(new Komodraco());
        addNewPokemon(new Capsink());
        addNewPokemon(new Slimeshroom());
        addNewPokemon(new Dwarvnir());
        addNewPokemon(new Dragovnir());
        addNewPokemon(new Gheiflect());
        addNewPokemon(new Remirrorse());
        addNewPokemon(new Laflala());
        addNewPokemon(new Lafhaha());
        addNewPokemon(new Mawdile());
        addNewPokemon(new Crocrunch());
        addNewPokemon(new Moulcheese());
        addNewPokemon(new Queshroom());
        addNewPokemon(new Shrumb());
        addNewPokemon(new Ramplant());
        addNewPokemon(new Djarni());
        addNewPokemon(new Jinnister());
        addNewPokemon(new Bombat());
        addNewPokemon(new Thermobat());
        addNewPokemon(new Thermacula());
        addNewPokemon(new Grabbug());
        addNewPokemon(new Graprantula());
        addNewPokemon(new Berbary().fishingSpawnFromExisting());
        addNewPokemon(new Barbaroca());
        addNewPokemon(new Ninfoxy());
        addNewPokemon(new Foshino());
        addNewPokemon(new Airville());
        addNewPokemon(new Windbur());
        addNewPokemon(new Sniffly());
        addNewPokemon(new Snotchoo());
        addNewPokemon(new Sneezwiz());
    }

}
