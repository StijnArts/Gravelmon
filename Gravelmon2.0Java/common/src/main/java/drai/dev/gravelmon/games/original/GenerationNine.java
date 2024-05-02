package drai.dev.gravelmon.games.original;

import drai.dev.gravelmon.games.registry.*;
import drai.dev.gravelmon.pokemon.aristos.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.avoris.regional.*;
import drai.dev.gravelmon.pokemon.norheim.regional.*;
import drai.dev.gravelmon.pokemon.novrai.regional.*;
import drai.dev.gravelmon.pokemon.qamor.regional.*;
import drai.dev.gravelmon.pokemon.radicalred.*;
import drai.dev.gravelmon.pokemon.vanguard.regional.*;

import java.util.*;

public class GenerationNine extends Game {
    public GenerationNine() {
        super("generation9");
    }

    @Override
    public void registerPokemon() {

        pokemon.add(new QamoranRabsca(954));

        pokemon.add(new NorheimanGlimmora(970, new Stats(525, StatArchetype.FAST_SPECIAL_WALL,
                List.of(Stats.StatType.SPECIAL_DEFENCE))));

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

//        pokemon.add(new AristosianFlittle(955)); Missing Art

//        pokemon.add(new AvorianCetitan(975)); Member of line not finished
    }
}
