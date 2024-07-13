package drai.dev.data.games.original;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.soulstones.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.norheim.regional.*;
import drai.dev.data.pokemon.qamor.regional.*;
import drai.dev.data.pokemon.radicalred.*;
import drai.dev.data.pokemon.ayrei.
regional.*;

import java.util.*;

public class GenerationNine extends Game {
    public GenerationNine() {
        super("generation9");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new EpochWattrel("", Aspect.EPOCH));
        pokemon.add(new EpochKilowattrel("", Aspect.EPOCH));
        pokemon.add(new EpochAnnihilape("", Aspect.EPOCH));
        pokemon.add(new EpochFinizen("", Aspect.EPOCH));
        pokemon.add(new EpochPalafin("", Aspect.EPOCH));
        pokemon.add(new EpochPawmi("", Aspect.EPOCH));
        pokemon.add(new EpochPawmo("", Aspect.EPOCH));
        pokemon.add(new EpochPawmot("", Aspect.EPOCH));
        pokemon.add(new EpochFuecoco("", Aspect.EPOCH));
        pokemon.add(new EpochCrocalor("", Aspect.EPOCH));
        pokemon.add(new EpochSkeledirge("", Aspect.EPOCH));
        pokemon.add(new EpochTinkatink("", Aspect.EPOCH));
        pokemon.add(new EpochTinkatuff("", Aspect.EPOCH));
        pokemon.add(new EpochTinkaton("", Aspect.EPOCH));
        pokemon.add(new EpochDudunsparce("", Aspect.EPOCH));
        pokemon.add(new EpochGimmighoul("", Aspect.EPOCH));
        pokemon.add(new EpochGholdengo("", Aspect.EPOCH));
        pokemon.add(new EpochDipplin("", Aspect.EPOCH));

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
