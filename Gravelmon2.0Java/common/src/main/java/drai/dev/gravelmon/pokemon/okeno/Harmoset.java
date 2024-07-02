package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Harmoset extends drai.dev.gravelmon.pokemon.Pokemon {
    public Harmoset() {
        super("Harmoset",
                Type.PSYCHIC, Type.FIGHTING,
                new Stats(57,
                        70,
                        41,
                        60,
                        58,
                        40),
                List.of(Ability.ANGER_POINT), Ability.ANGER_POINT,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("- Scratch Normal - Leer Normal - Covet Normal 11 Fury Swipes Normal 15 Rage Normal 19 Uproar Normal 23 Screech Normal 27 Psychic FangsSTAB Psychic 31 Torment Dark 35 Fling Dark 39 Acrobatics Flying 43 Stomping Tantrum Ground 47 BreakdownSTAB Psychic 51 Stored PowerSTAB Psychic 55 Thrash Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.COVET,1),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,11),
                        new MoveLearnSetEntry(Move.RAGE,15),
                        new MoveLearnSetEntry(Move.UPROAR,19),
                        new MoveLearnSetEntry(Move.SCREECH,23),
                        new MoveLearnSetEntry(Move.PSYCHIC_FANGS,27),
                        new MoveLearnSetEntry(Move.TORMENT,31),
                        new MoveLearnSetEntry(Move.FLING,35),
                        new MoveLearnSetEntry(Move.ACROBATICS,39),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,43),
                        new MoveLearnSetEntry(Move.BREAKDOWN,47),
                        new MoveLearnSetEntry(Move.STORED_POWER,51),
                        new MoveLearnSetEntry(Move.THRASH,55),
                        new MoveLearnSetEntry(Move.MEDITATE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,"tm"),
                        new MoveLearnSetEntry(Move.REVENGE,"tm"),
                        new MoveLearnSetEntry(Move.IMPRISON,"tm"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,"tm"),
                        new MoveLearnSetEntry(Move.WAKEUP_SLAP,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_BLOCK,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.SYNCHRONOISE,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Harmoset");

    }


}
