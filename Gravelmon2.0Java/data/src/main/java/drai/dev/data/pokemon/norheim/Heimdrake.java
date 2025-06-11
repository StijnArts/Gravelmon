package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Heimdrake extends drai.dev.data.pokemon.Pokemon {
    public Heimdrake() {
        super("Heimdrake",
                Type.DRAGON, Type.ELECTRIC,
                new Stats(90,
                        90,
                        90,
                        85,
                        80,
                        100),
                List.of(Ability.SWIFT_SWIM,Ability.OWN_TEMPO,Ability.LIGHTNING_ROD), Ability.LIGHTNING_ROD,
                21, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.75,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Formerly trained for the purpose of warfare. Heimdrake can reach incredibly high speeds in any weather condition, gathering energy from strong stream currents."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SURF,1),
                        new MoveLearnSetEntry(Move.TWISTER,12),
                        new MoveLearnSetEntry(Move.SCARY_FACE,18),
                        new MoveLearnSetEntry(Move.THRASH,22),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,26),
                        new MoveLearnSetEntry(Move.AQUA_JET,30),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,34),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,40),
                        new MoveLearnSetEntry(Move.THUNDERTAIL,46),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,55),
                        new MoveLearnSetEntry(Move.OUTRAGE,62),
                        new MoveLearnSetEntry(Move.THUNDER,72),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.HURRICANE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_RING,"tm")
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(41)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SURFACE)
    .setBiomes(Biome.IS_COLD_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.WATER_SURFACE)
    .build(), List.of());
	
        setAvoidsLand(true);
        setCanSwim(true);
           setLangFileName("Heimdrake");

    }


}
