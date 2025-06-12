package drai.dev.data.pokemon.africanus.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AfricanusanDonphan extends drai.dev.data.pokemon.Pokemon {
    public AfricanusanDonphan(String name, Aspect aspect) {
        super(name, aspect, "AfricanusanDonphan",
                Type.GROUND,Type.ROCK,
                new Stats(110,
                        130,
                        95,
                        95,
                        45,
                        125),
                List.of(Ability.STURDY), null,
                11, 1200,
                new Stats(0,1,1,0,0,0), 60,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Donphan es tan fuerte que puede arrasarr fácilmente varias filas de legionarios. Su piel se ha endurecido, ganando el tipo roca. Para hacerle daño, no bastan los ataques comunes."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THOUSAND_ARROWS,50),
                        new MoveLearnSetEntry(Move.SLAM,24),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,25),
                        new MoveLearnSetEntry(Move.ROCK_THROW,1),
                        new MoveLearnSetEntry(Move.STONE_EDGE,39),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,31),
                        new MoveLearnSetEntry(Move.ROLLOUT,15),
                        new MoveLearnSetEntry(Move.MAGNITUDE,19),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.MUD_BOMB,1),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,54),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,10),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,1),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,42),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,6),
                        new MoveLearnSetEntry(Move.SAL,45)                        ),
                List.of(Label.AFRICANUS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(51)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Donphan");

    }


}
