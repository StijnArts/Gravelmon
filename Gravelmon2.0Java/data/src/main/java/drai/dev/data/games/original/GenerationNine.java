package drai.dev.data.games.original;

import drai.dev.data.attributes.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.arom.regional.*;
import drai.dev.data.pokemon.ayrei.regional.*;
import drai.dev.data.pokemon.lagoone.regional.*;
import drai.dev.data.pokemon.norheim.regional.*;
import drai.dev.data.pokemon.qamor.regional.*;
import drai.dev.data.pokemon.radicalred.*;
import drai.dev.data.pokemon.soulstones.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

import java.util.*;

public class GenerationNine extends Game {
    public GenerationNine() {
        super("generation9");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new AromianSmoliv("", Aspect.AROMIAN).setUsesBigModel()); //TODO
        addNewPokemon(new AromianDolliv("", Aspect.AROMIAN).setUsesBigModel());

        registerSoulstoneMons();

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

        //Lagoon
        addNewPokemon(new LagoonanTinkatink("", Aspect.LAGOONAN));
        addNewPokemon(new LagoonanTinkatuff("", Aspect.LAGOONAN));
        addNewPokemon(new LagoonanTinkaton("", Aspect.LAGOONAN));

//        addNewPokemon(new AristosianFlittle(955)); Missing Art

//        addNewPokemon(new AvorianCetitan(975)); Member of line not finished
    }

    private void registerSoulstoneMons() {
        addNewPokemon(new EpochFuecoco("", Aspect.EPOCH));
        addNewPokemon(new EpochCrocalor("", Aspect.EPOCH));
        addNewPokemon(new EpochSkeledirge("", Aspect.EPOCH));

        addNewPokemon(new EpochWattrel("", Aspect.EPOCH));
        addNewPokemon(new EpochKilowattrel("", Aspect.EPOCH));
        addNewPokemon(new EpochFinizen("", Aspect.EPOCH));
        addNewPokemon(new EpochPalafin("", Aspect.EPOCH));
        addNewPokemon(new EpochPawmi("", Aspect.EPOCH));
        addNewPokemon(new EpochPawmo("", Aspect.EPOCH));
        addNewPokemon(new EpochPawmot("", Aspect.EPOCH));
        addNewPokemon(new EpochTinkatink("", Aspect.EPOCH));
        addNewPokemon(new EpochTinkatuff("", Aspect.EPOCH));
        addNewPokemon(new EpochTinkaton("", Aspect.EPOCH));
        addNewPokemon(new EpochGimmighoul("", Aspect.EPOCH));
        addNewPokemon(new EpochGholdengo("", Aspect.EPOCH));

        addNewPokemon(new EpochDudunsparce("", Aspect.EPOCH));
        addNewPokemon(new EpochAnnihilape("", Aspect.EPOCH));
        addNewPokemon(new EpochDipplin("", Aspect.EPOCH));
    }
}
