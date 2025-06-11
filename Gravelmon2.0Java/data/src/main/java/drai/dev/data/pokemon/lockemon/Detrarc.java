package drai.dev.data.pokemon.lockemon;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Detrarc extends Pokemon {
    public Detrarc() {
        super("Detrarc",
                Type.GROUND, Type.ELECTRIC,
                new Stats(70,
                        65,
                        79,
                        95,
                        61,
                        80),
                List.of(Ability.ENERGIZER, Ability.SAP_SIPPER), Ability.FIELDWORKER,
                8, 121,
                new Stats(0,0,0,0,1,0), 45,
                0.5,
                167, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("The potato around Detrarc's neck is mature enough to appear to be fully grown. Farmers sometimes grab Detrarc up and get shocked as a result of it."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.ENDURE,5),
                        new MoveLearnSetEntry(Move.MUD_SHOT,10),
                        new MoveLearnSetEntry(Move.CHARGE,20),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,25),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,30),
                        new MoveLearnSetEntry(Move.BOUNCE,35),
                        new MoveLearnSetEntry(Move.DISCHARGE,45),
                        new MoveLearnSetEntry(Move.FLAIL,50),
                        new MoveLearnSetEntry(Move.FISSURE,55),
                        new MoveLearnSetEntry(Move.ASTONISH,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"egg"),
                        new MoveLearnSetEntry(Move.REFLECT_TYPE,"egg"),
                        new MoveLearnSetEntry(Move.SPARK,"egg"),
                        new MoveLearnSetEntry(Move.SPITE,"egg"),
                        new MoveLearnSetEntry(Move.YAWN,"egg")
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(30)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_PLAINS)
    .setAntiBiomes(Biome.IS_COLD, Biome.IS_ARID)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NEAR_CROPS)
    .build(), List.of());
	
    }
}
