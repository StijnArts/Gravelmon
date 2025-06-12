package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hawkedge extends drai.dev.data.pokemon.Pokemon {
    public Hawkedge() {
        super("Hawkedge",
                Type.DARK, Type.FLYING,
                new Stats(68,
                        127,
                        90,
                        50,
                        76,
                        75),
                List.of(Ability.RIVALRY,Ability.HUSTLE), Ability.STEELWORKER,
                14, 355,
                new Stats(0,3,0,0,0,0), 90,
                0.5,
                162, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Hawkedge patrol the skies looking for anything that has entered its territory. If it sees anything at all, it will dive bomb them with slices sharp enough to cut a Steelix in half."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.SWITCHEROO,1),
                        new MoveLearnSetEntry(Move.THIEF,1),
                        new MoveLearnSetEntry(Move.PLUCK,1),
                        new MoveLearnSetEntry(Move.MIMIC,12),
                        new MoveLearnSetEntry(Move.BEAT_UP,15),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,22),
                        new MoveLearnSetEntry(Move.AIR_SLASH,27),
                        new MoveLearnSetEntry(Move.PSYCH_UP,32),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,37),
                        new MoveLearnSetEntry(Move.HURRICANE,44),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,49),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,"egg"),
                        new MoveLearnSetEntry(Move.DRILL_PECK,"egg"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"egg")
                ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(24)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Hawkedge");

    }


}
