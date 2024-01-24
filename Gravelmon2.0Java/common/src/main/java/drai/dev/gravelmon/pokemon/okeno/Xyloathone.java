package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Xyloathone extends drai.dev.gravelmon.pokemon.Pokemon {
    public Xyloathone() {
        super("Xyloathone",
                Type.DARK,
                new Stats(60,
                        67,
                        118,
                        136,
                        72,
                        47),
                List.of(Ability.MOLD_BREAKER,Ability.INSOMNIA,Ability.CACOPHONY), Ability.CACOPHONY,
                8, 165,
                new Stats(0,0,1,1,0,0), 45,
                0.5,
                172, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.MONSTER),
                List.of("- Supersonic Normal - Taunt Dark - Round Normal 4 Encore Normal 8 Quash Dark 12 Uproar Normal 16 PaybackSTAB Dark 20 Epilogue Normal 24 Flatter Dark 28 Ominous Wind Ghost 32 Metal Sound Steel 36 Spotlight Normal 40 Strident EchoSTAB Dark 44 Mirror Coat Psychic 48 Dark PulseSTAB Dark 52 Perish Song Normal 60 Ear Split Normal 63 Memento Dark 72 Boomburst Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROUND,1),
                        new MoveLearnSetEntry(Move.ENCORE,4),
                        new MoveLearnSetEntry(Move.QUASH,8),
                        new MoveLearnSetEntry(Move.UPROAR,12),
                        new MoveLearnSetEntry(Move.PAYBACK,16),
                        new MoveLearnSetEntry(Move.EPILOGUE,20),
                        new MoveLearnSetEntry(Move.FLATTER,24),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,28),
                        new MoveLearnSetEntry(Move.METAL_SOUND,32),
                        new MoveLearnSetEntry(Move.SPOTLIGHT,36),
                        new MoveLearnSetEntry(Move.STRIDENTECHO,40),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,44),
                        new MoveLearnSetEntry(Move.DARK_PULSE,48),
                        new MoveLearnSetEntry(Move.PERISH_SONG,52),
                        new MoveLearnSetEntry(Move.EARSPLIT,60),
                        new MoveLearnSetEntry(Move.MEMENTO,63),
                        new MoveLearnSetEntry(Move.BOOMBURST,72),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.EMBARGO,"tm"),
                        new MoveLearnSetEntry(Move.ROYALDECREE,"tm"),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,"tm"),
                        new MoveLearnSetEntry(Move.RESONATE,"tm"),
                        new MoveLearnSetEntry(Move.SYNCHRONOISE,"tm"),
                        new MoveLearnSetEntry(Move.IMPRISON,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Xyloathone");

    }


}
