package drai.dev.data.games.other;

import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.daybreak.*;
import drai.dev.data.pokemon.daybreak.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

public class Daybreak extends Game {
    public static final Game INSTANCE = new Daybreak();
    private Daybreak() {
        super("Daybreak");
    }

    @Override
    public void registerPokemon() {
        addPokedexPokemon("treecko, grovyle, sceptile");
        addNewPokemon(new ArmiranSceptile("Sceptile", Aspect.ARMIRAN));
        addNewPokemon(new ArmiranFroakie("Froakie", Aspect.ARMIRAN));
        addNewPokemon(new ArmiranFrogadier("Frogadier", Aspect.ARMIRAN));
        addNewPokemon(new ArmiranGreninja("Greninja", Aspect.ARMIRAN));
        addPokedexPokemon("taillow, swellow");
        addNewPokemon(new ArmiranSwellow("Swellow", Aspect.ARMIRAN));
        addPokedexPokemon("sandshrew, sandshrew-alolan, " +
                "sandslash, sandslash-alolan");
        addNewPokemon(new Sandridger());
        addNewPokemon(new AlolanSandridger("", Aspect.ALOLAN));
        addNewPokemon(new ArmiranGrowlithe("", Aspect.ARMIRAN));
        addNewPokemon(new ArmiranArcanine("", Aspect.ARMIRAN));
        addNewPokemon(new ArmiranRoggenrola("", Aspect.ARMIRAN));
        addNewPokemon(new ArmiranBoldore("", Aspect.ARMIRAN));
        addNewPokemon(new ArmiranGigalith("", Aspect.ARMIRAN));
        addNewPokemon(new ArmiranHippopotas("", Aspect.ARMIRAN));
        addNewPokemon(new ArmiranHippowdon("", Aspect.ARMIRAN));
        addPokedexPokemon("larvitar, pupitar, tyranitar");
        addNewPokemon(new ArmiranTyranitar("", Aspect.ARMIRAN));
        addPokedexPokemon("gible, gabite, garchomp");
        addNewPokemon(new ArmiranGarchomp("", Aspect.ARMIRAN));
    }
}
