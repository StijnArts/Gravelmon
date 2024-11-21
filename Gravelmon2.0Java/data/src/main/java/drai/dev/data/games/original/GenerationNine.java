package drai.dev.data.games.original;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.norheim.regional.*;
import drai.dev.data.pokemon.qamor.regional.*;
import drai.dev.data.pokemon.radicalred.*;
import drai.dev.data.pokemon.vanguard.
regional.*;

import java.util.*;

public class GenerationNine extends Game {
    public GenerationNine() {
        super("generation9");
    }

    @Override
    public void registerPokemon() {

        addNewPokemon(new QamoranRabsca("", Aspect.QAMORAN));

        addNewPokemon(new NorheimanGlimmora("", Aspect.NORHEIMAN, new Stats(525, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));

        //Radical Red
        addNewPokemon(new SeviianNymble("", Aspect.SEVIIAN));
        addNewPokemon(new SeviianLokix("", Aspect.SEVIIAN));

        //Vanguard
        addNewPokemon(new AyreianSprigatito("", Aspect.AYREIAN));
        addNewPokemon(new AyreianFloragato("", Aspect.AYREIAN));
        addNewPokemon(new AyreianMeowscarada("", Aspect.AYREIAN));
        addNewPokemon(new AyreianQuaxly("", Aspect.AYREIAN));
        addNewPokemon(new AyreianQuaxwell("", Aspect.AYREIAN));
        addNewPokemon(new AyreianQuaquaval("", Aspect.AYREIAN));

//        pokemon.add(new AristosianFlittle(955)); Missing Art

//        pokemon.add(new AvorianCetitan(975)); Member of line not finished
    }
}
