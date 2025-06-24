package drai.dev.data.games.pokengine.done;

import drai.dev.data.pokemon.hub.*;
import drai.dev.data.pokemon.hub.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

//done
public class HUB extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new HUB();
    private HUB() {
        super("HUB");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Mobipup());
        addNewPokemon(new Nezutama());
        addNewPokemon(new Nuzzeltama());
        addNewPokemon(new Ovipter());
        addNewPokemon(new Hoppolat());
        addNewPokemon(new Brokenstein());
        addNewPokemon(new Monstricity());
        addNewPokemon(new Cadastrophe());
        addNewPokemon(new Gobblin());
        addNewPokemon(new Sheetrick());
        addNewPokemon(new Yokid());
        addNewPokemon(new Creshank());
        addNewPokemon(new Mushmol());
        addNewPokemon(new Mushpunky());
        addNewPokemon(new Mushilly());
        addNewPokemon(new Mushcary());
        addNewPokemon(new Sakurovix().addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Nephelith().addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new HubianTogepi("", Aspect.HUBIAN));
        addNewPokemon(new HubianTogetic("", Aspect.HUBIAN));
        addNewPokemon(new HubianTogekiss("", Aspect.HUBIAN));
        addNewPokemon(new HubianSmeargle("", Aspect.HUBIAN));
    }

}
