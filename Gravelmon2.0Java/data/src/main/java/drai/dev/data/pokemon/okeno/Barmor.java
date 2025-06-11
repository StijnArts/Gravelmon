package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Barmor extends drai.dev.data.pokemon.Pokemon {
    public Barmor() {
        super("Barmor",
                Type.GROUND, Type.FLYING,
                new Stats(38,
                        57,
                        77,
                        40,
                        28,
                        45),
                List.of(Ability.PICKUP,Ability.BATTLE_ARMOR,Ability.WEAK_ARMOR), Ability.WEAK_ARMOR,
                8, 165,
                new Stats(0,0,1,0,0,0), 200,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Barmor use their tail feathers to scoop up clay and mud that they use to form a helmet. Because its head gets too heavy, it can't fly properly."),
                List.of(new EvolutionEntry("beakapow", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(
                        new MoveLearnSetEntry(Move.AIRBUBBLE,1),
                        new MoveLearnSetEntry(Move.MUD_SPORT,4),
                        new MoveLearnSetEntry(Move.MUDSLAP,6),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,9),
                        new MoveLearnSetEntry(Move.HARDEN,12),
                        new MoveLearnSetEntry(Move.MUD_SHOT,15),
                        new MoveLearnSetEntry(Move.PLUCK,18),
                        new MoveLearnSetEntry(Move.FLING,21),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,24),
                        new MoveLearnSetEntry(Move.MUD_BOMB,27),
                        new MoveLearnSetEntry(Move.ROOST,30),
                        new MoveLearnSetEntry(Move.LANDSLIDE,34),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,38),
                        new MoveLearnSetEntry(Move.SKULL_BASH,42),
                        new MoveLearnSetEntry(Move.DRILL_RUN,45),
                        new MoveLearnSetEntry(Move.DRILL_PECK,49),
                        new MoveLearnSetEntry(Move.SHIELD_BASH,55),
                        new MoveLearnSetEntry(Move.SPIKES,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(13)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Barmor");

    }


}
