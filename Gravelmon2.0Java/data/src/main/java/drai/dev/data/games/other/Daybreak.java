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
        addPokedexPokemon("treecko, grovyle, sceptile, sceptile-armiran, froakie-armiran, " +
                "frogadier-armiran, " +
                "greninja-armiran, taillow, swellow, swellow-armiran, sandshrew, sandshrew-alolan, " +
                "sandslash, sandslash-alolan");
        addNewPokemon(new Sandridger());
        addNewPokemon(new AlolanSandridger("", Aspect.ALOLAN));
        addPokedexPokemon("growlithe-armiran, arcanine-armiran, roggenrola-armiran, boldore-armiran, gigalith-armiran, " +
                "hippopotas-armiran, hippowdon-armiran, larvitar, pupitar, tyranitar, tyranitar-armiran, gible, gabite, garchomp, garchomp-armiran");
    }
}
