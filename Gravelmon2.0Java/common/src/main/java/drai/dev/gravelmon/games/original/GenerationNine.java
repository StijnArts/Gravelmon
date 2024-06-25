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

        pokemon.add(new QamoranRabsca("", Aspect.QAMORAN));

        pokemon.add(new NorheimanGlimmora("", Aspect.NORHEIMAN, new Stats(525, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));

        //Radical Red
        pokemon.add(new SeviianNymble("", Aspect.SEVIIAN));
        pokemon.add(new SeviianLokix("", Aspect.SEVIIAN));

        //Vanguard
        pokemon.add(new AyreianSprigatito("", Aspect.AYREIAN));
        pokemon.add(new AyreianFloragato("", Aspect.AYREIAN));
        pokemon.add(new AyreianMeowscarada("", Aspect.AYREIAN));
        pokemon.add(new AyreianQuaxly("", Aspect.AYREIAN));
        pokemon.add(new AyreianQuaxwell("", Aspect.AYREIAN));
        pokemon.add(new AyreianQuaquaval("", Aspect.AYREIAN));

//        pokemon.add(new AristosianFlittle(955)); Missing Art

//        pokemon.add(new AvorianCetitan(975)); Member of line not finished
    }
}
