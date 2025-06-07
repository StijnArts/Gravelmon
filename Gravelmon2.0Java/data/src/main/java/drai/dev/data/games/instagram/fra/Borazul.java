package drai.dev.data.games.instagram.fra;

import drai.dev.data.pokemon.borazul.*;
import drai.dev.gravelmon.pokemon.attributes.*;
public class Borazul extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Borazul();
    private Borazul() {
        super("borazul");
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
        addNewPokemon(new Drubat().addLabels(Label.STARTER)); //Renamed from Fruibat
        addNewPokemon(new Foliwing().addLabels(Label.STARTER));
        addNewPokemon(new Acairadon().addLabels(Label.STARTER));
        addNewPokemon(new Coaliz().addLabels(Label.STARTER));
        addNewPokemon(new Sizzlick().addLabels(Label.STARTER));
        addNewPokemon(new Apoiformer().addLabels(Label.STARTER));
        addNewPokemon(new Seaquin().fishingSpawnFromExisting().addLabels(Label.STARTER));
        addNewPokemon(new Equamarin().fishingSpawnFromExisting().addLabels(Label.STARTER));
        addNewPokemon(new Aquavallo().addLabels(Label.STARTER));
        addNewPokemon(new Humbird());
        addNewPokemon(new Paradivia());
        addNewPokemon(new Pitic());
        addNewPokemon(new Shelpa());
        addNewPokemon(new Moskiringe());
        addNewPokemon(new Hibiskiss());
        addNewPokemon(new Glamamela());
        addNewPokemon(new Rootkie());
        addNewPokemon(new Bambooton());
    }

}
