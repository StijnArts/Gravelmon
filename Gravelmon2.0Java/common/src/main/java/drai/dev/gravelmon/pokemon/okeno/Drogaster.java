package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Drogaster extends drai.dev.gravelmon.pokemon.Pokemon {
    public Drogaster() {
        super("Drogaster",
                Type.POISON,Type.BUG,
                new Stats(126,
                        88,
                        55,
                        101,
                        55,
                        95),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                8, 165,
                new Stats(2,0,0,0,0,0), 75,
                0.5,
                165, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Drogaster are the result of a failed experiment that employed genetic coding. It's had a terrible impact on the environment, but the Pokemon has no intentions of harm."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,1),
                        new MoveLearnSetEntry(Move.ACID,5),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,10),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,15),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,20),
                        new MoveLearnSetEntry(Move.NEUROTOXIN,25),
                        new MoveLearnSetEntry(Move.SWAGGER,30),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,35),
                        new MoveLearnSetEntry(Move.AMNESIA,38),
                        new MoveLearnSetEntry(Move.VENOSHOCK,43),
                        new MoveLearnSetEntry(Move.PSYCHO_SHIFT,48),
                        new MoveLearnSetEntry(Move.PSYCHIC,50),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,55),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,60),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.DISABLE,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC_FANGS,"tm"),
                        new MoveLearnSetEntry(Move.BELCH,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Drogaster");

    }


}
