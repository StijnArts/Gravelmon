package drai.dev.data.games.pokemmo;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.ottora.*;
import drai.dev.data.pokemon.ottora.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Ottora extends drai.dev.data.games.registry.Game {
    public Ottora() {
        super("Ottora");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new OttoranHonedge("", Aspect.OTTORAN));
        addNewPokemon(new OttoranDoublade("", Aspect.OTTORAN));

//        addNewPokemon(new Hopling()); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Bunbush()); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Inflagulo());  MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Wolverupt()); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Guillie()); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Deeluge()); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Moosong()); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Pinjure()); MEMBER OF LINE NOT FINISHED
        addNewPokemon(new Stachick());
        addNewPokemon(new Shockite());
//        addNewPokemon(new Floodle()); MEMBER OF LINE NOT FINISHED
        addNewPokemon(new Civilarva());
        addNewPokemon(new Pupail());
        addNewPokemon(new Dynamoth());

        addNewPokemon(new Jueshika());
//        addNewPokemon(new Aqquack()); MEMBER OF LINE NOT FINISHED
        addNewPokemon(new Coynel());
        addNewPokemon(new Popstarch());
//        addNewPokemon(new Cabbrain()); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Finook()); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Aubat()); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Dustbun()); MEMBER OF LINE NOT FINISHED
        addNewPokemon(new Levieon(new Stats(525, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Bankeon(new Stats(525, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE)))); //renamed from duneon
//        addNewPokemon(new Sporita());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Doznale());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Impidimp(859));   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Fawnt());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Salfurrr());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Specture());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Pidunce());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Minmallow());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Netyke());   MEMBER OF LINE NOT FINISHED
        addNewPokemon(new Disix());
        addNewPokemon(new Diielve());
        addNewPokemon(new Giiem(new Stats(520, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Howltlaw());
        addNewPokemon(new Miensei());
        addNewPokemon(new Aegistump(new Stats(500, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.DEFENCE, StatType.DEFENCE, StatType.HP))));
        addNewPokemon(new Chainslash(new Stats(500, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK, StatType.ATTACK, StatType.ATTACK))));
        addNewPokemon(new Copurr(new Stats(350, StatArchetype.FAST_SUPPORT,
                List.of(StatType.DEFENCE))));
    }

}
