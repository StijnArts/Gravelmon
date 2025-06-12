package drai.dev.data.pokemon.chaosinvestia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VesitanHawlucha extends drai.dev.data.pokemon.Pokemon {
    public VesitanHawlucha(String name, Aspect aspect) {
        super(name, aspect, "VesitanHawlucha",
                Type.FIGHTING,Type.ICE,
                new Stats(78,
                        108,
                        82,
                        120,
                        62,
                        72),
                List.of(Ability.UNBURDEN,Ability.LIMBER), null,
                8, 215,
                new Stats(0,2,0,0,0,0), 128,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("Ungeachtet seines kleinen Wuchses, erweist es sich, dank seiner Kampftechnik, gegenüber größeren Gegnern wie Machomei oder Hariyama als ebenbürtig."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.KARATE_CHOP,4),
                        new MoveLearnSetEntry(Move.ENCORE,20),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,1),
                        new MoveLearnSetEntry(Move.FLING,24),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,48),
                        new MoveLearnSetEntry(Move.FLYING_PRESS,28),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,40),
                        new MoveLearnSetEntry(Move.BOUNCE,32),
                        new MoveLearnSetEntry(Move.ENDEAVOR,36),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,44),
                        new MoveLearnSetEntry(Move.MIST,8),
                        new MoveLearnSetEntry(Move.ICE_SHARD,16),
                        new MoveLearnSetEntry(Move.ROOST,12),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,60),
                        new MoveLearnSetEntry(Move.DETECT,1),
                        new MoveLearnSetEntry(Move.FREEZE_SHOCK,55),
                        new MoveLearnSetEntry(Move.AGILITY,"egg"),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,"egg"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"egg"),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,"egg"),
                        new MoveLearnSetEntry(Move.ME_FIRST,"egg"),
                        new MoveLearnSetEntry(Move.MUD_SPORT,"egg"),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,"egg")                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(25)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SKY, Biome.IS_MOUNTAIN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Hawlucha");

    }


}
