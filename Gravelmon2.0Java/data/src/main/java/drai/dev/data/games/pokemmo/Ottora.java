package drai.dev.data.games.pokemmo;


import drai.dev.data.pokemon.ottora.*;

import drai.dev.data.pokemon.ottora.regional.*;
import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Ottora extends drai.dev.data.games.registry.Game {
    public Ottora() {
        super("Ottora");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new OttoranHonedge("", Aspect.OTTORAN));
        pokemon.add(new OttoranDoublade("", Aspect.OTTORAN));

//        pokemon.add(new Hopling()); MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Bunbush()); MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Inflagulo());  MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Wolverupt()); MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Guillie()); MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Deeluge()); MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Moosong()); MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Pinjure()); MEMBER OF LINE NOT FINISHED
        pokemon.add(new Stachick());
        pokemon.add(new Shockite());
//        pokemon.add(new Floodle()); MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Civilarva()); MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Pupail()); MEMBER OF LINE NOT FINISHED
        pokemon.add(new Jueshika());
//        pokemon.add(new Aqquack()); MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Cabbrain()); MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Finook()); MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Aubat()); MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Dustbun()); MEMBER OF LINE NOT FINISHED
        pokemon.add(new Levieon(new Stats(525, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new Bankeon(new Stats(525, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
//        pokemon.add(new Sporita());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Doznale());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Impidimp(859));   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Fawnt());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Salfurrr());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Specture());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Pidunce());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Minmallow());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Netyke());   MEMBER OF LINE NOT FINISHED
        pokemon.add(new Disix());
        pokemon.add(new Diielve());
        pokemon.add(new Giiem(new Stats(520, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Howltlaw());
        pokemon.add(new Aegistump(new Stats(500, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.DEFENCE, StatType.DEFENCE, StatType.HP))));
        pokemon.add(new Chainslash(new Stats(500, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK, StatType.ATTACK, StatType.ATTACK))));
        pokemon.add(new Copurr(new Stats(350, StatArchetype.FAST_SUPPORT,
                List.of(StatType.DEFENCE))));
    }

}
