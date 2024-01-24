package drai.dev.gravelmon.games.original;

import drai.dev.gravelmon.games.registry.*;
import drai.dev.gravelmon.pokemon.radicalred.*;
import drai.dev.gravelmon.pokemon.vanguard.regional.*;

public class GenerationNine extends Game {
    public GenerationNine() {
        super("generation9");
    }

    @Override
    public void registerPokemon() {
        //Radical Red
        pokemon.add(new SeviianNymble(919));
        pokemon.add(new SeviianLokix(920));

        //Vanguard
        pokemon.add(new AyreianSprigatito(906));
        pokemon.add(new AyreianFloragato(907));
        pokemon.add(new AyreianMeowscarada(908));
        pokemon.add(new AyreianQuaxly(912));
        pokemon.add(new AyreianQuaxwell(913));
        pokemon.add(new AyreianQuaquaval(914));

//        pokemon.add(new AvorianCetitan(975));
    }
}
