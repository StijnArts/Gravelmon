package drai.dev.data.games.pokengine.done;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.beginnings.*;
import drai.dev.data.pokemon.beginnings.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Beginnings extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Beginnings();
    private Beginnings() {
        super("Beginnings");
    }

    @Override
    public void registerPokemon() {
//        addNewPokemon(new Hopling());     Member of line Not Finished
//        addNewPokemon(new Bunbush());     Member of line Not Finished
//        addNewPokemon(new Inflagulo());   Member of line Not Finished
//        addNewPokemon(new Wolverupt());   Member of line Not Finished
//        addNewPokemon(new Guillie());     Member of line Not Finished
//        addNewPokemon(new Deeluge());     Member of line Not Finished
        addNewPokemon(new Moosong());
        addNewPokemon(new Horncerto());
        addNewPokemon(new Pinjure());
        addNewPokemon(new Mediquil());
        addNewPokemon(new Stachick());
        addNewPokemon(new Shockite());
        addNewPokemon(new Falconduct());
        addNewPokemon(new Floodle());
        addNewPokemon(new Woofoam());
        addNewPokemon(new Civilarva());
        addNewPokemon(new Pupail());
        addNewPokemon(new Dynamoth());
        addNewPokemon(new Glittiny());
        addNewPokemon(new Lunarva());
        addNewPokemon(new Fulluna(new Stats(520, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Silfrish());
        addNewPokemon(new Scubug());
        addNewPokemon(new Jueshika());
        addNewPokemon(new Juekizumi());
        addNewPokemon(new Aqquack());
        addNewPokemon(new Mergangster());
        addNewPokemon(new Coynel());
        addNewPokemon(new Popstarch());
        addNewPokemon(new Cabbrain());
        addNewPokemon(new Cerebage());
        addNewPokemon(new Finook());
        addNewPokemon(new Reelfin());
        addNewPokemon(new Aubat());
        addNewPokemon(new Silvarn());
        addNewPokemon(new Gremliz());
        addNewPokemon(new Thornull());
        addNewPokemon(new Dustbun());
        addNewPokemon(new Levieon(new Stats(525, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Bankeon(new Stats(525, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE)))); //renamed from duneon
        addNewPokemon(new Coulimb());
        addNewPokemon(new Ampylon());
        addNewPokemon(new Voltowere(new Stats(550, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Sporita());
        addNewPokemon(new Assaceae(new Stats(480, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPEED))));
        addNewPokemon(new Doznale());
        addNewPokemon(new Snooznale(new Stats(480, StatArchetype.SPECIAL_WALL,
                List.of(StatType.HP))));
        addNewPokemon(new Yuesbii());
        addNewPokemon(new Eeyencii(new Stats(458, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new OttoranHatenna("", Aspect.OTTORAN));
        addNewPokemon(new OttoranHattrem("", Aspect.OTTORAN));
        addNewPokemon(new Saucerene(new Stats(510, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new OttoranImpidimp("", Aspect.OTTORAN));
        addNewPokemon(new OttoranMorgrem("", Aspect.OTTORAN));
        addNewPokemon(new Grimmsquatch(new Stats(510, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
//        addNewPokemon(new Fawnt());   Member of line Not Finished
        addNewPokemon(new Salfurrr());
        addNewPokemon(new Salbrrr(new Stats(488, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.HP))));
        addNewPokemon(new Specture());
        addNewPokemon(new Poltrait());
        addNewPokemon(new Ghoullery(new Stats(507, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.HP))));
        addNewPokemon(new Pidunce(new Stats(412, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.HP))));
        addNewPokemon(new Destructice(new Stats(523, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.HP))));
//        addNewPokemon(new Minmallow());   Member of line Not Finished
//        addNewPokemon(new Netyke());   Member of line Not Finished
        addNewPokemon(new Disix());
        addNewPokemon(new Diielve());
        addNewPokemon(new Giiem(new Stats(542, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Vulpilfer());
        addNewPokemon(new Howltlaw(new Stats(487, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.HP))));
        addPokedexPokemon("mienfoo, mienshao");
        addNewPokemon(new Miensei());
        addNewPokemon(new OttoranHonedge("", Aspect.OTTORAN));
        addNewPokemon(new OttoranDoublade("", Aspect.OTTORAN));
        addNewPokemon(new Aegistump(new Stats(500, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.DEFENCE, StatType.DEFENCE, StatType.HP))));
        addNewPokemon(new Chainslash(new Stats(500, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK, StatType.ATTACK, StatType.ATTACK))));
//        addNewPokemon(new Copurr(new Stats(350, StatArchetype.FAST_SUPPORT,
//                List.of(StatType.DEFENCE))));
//        addNewPokemon(new Wyrmet());
    }

}
