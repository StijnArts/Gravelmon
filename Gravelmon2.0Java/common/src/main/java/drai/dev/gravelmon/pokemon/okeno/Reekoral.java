package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Reekoral extends drai.dev.gravelmon.pokemon.Pokemon {
    public Reekoral() {
        super("Reekoral",
                Type.POISON,
                new Stats(45,
                        45,
                        45,
                        45,
                        45,
                        78),
                List.of(Ability.SHED_SKIN,Ability.DRY_SKIN,Ability.MERCILESS), Ability.MERCILESS,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of("Despite its cute appearance, this Pokémon's fangs carry a deadly venom. Its rattle and bright colors..."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CONSTRICT,1),
                        new MoveLearnSetEntry(Move.ACID,5),
                        new MoveLearnSetEntry(Move.BITE,9),
                        new MoveLearnSetEntry(Move.GLARE,13),
                        new MoveLearnSetEntry(Move.POISON_TAIL,18),
                        new MoveLearnSetEntry(Move.SLAM,21),
                        new MoveLearnSetEntry(Move.SCARY_FACE,25),
                        new MoveLearnSetEntry(Move.POISON_FANG,30),
                        new MoveLearnSetEntry(Move.TOXIC,35),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,40),
                        new MoveLearnSetEntry(Move.CORROSIVEBITE,45),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,49),
                        new MoveLearnSetEntry(Move.WRING_OUT,53),
                        new MoveLearnSetEntry(Move.LICK,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.CAUSTIC_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.COIL,"tm"),
                        new MoveLearnSetEntry(Move.HYPNOSIS,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Reekoral");

    }


}
