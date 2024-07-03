package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Boodoir extends drai.dev.gravelmon.pokemon.Pokemon {
    public Boodoir() {
        super("Boodoir",
                Type.GHOST, Type.FAIRY,
                new Stats(80,
                        100,
                        90,
                        65,
                        72,
                        85),
                List.of(Ability.MAGIC_BOUNCE), Ability.MAGIC_BOUNCE,
                18, 165,
                new Stats(0,2,0,0,0,0), 65,
                0.25,
                172, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Now more powerful, each 4 of its separate faces fight for control over what they will do. Boodoir tend to be indecisive which is hinders their ability to battle."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.REFLECT_TYPE,1),
                        new MoveLearnSetEntry(Move.TACKLE,6),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,10),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,14),
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,17),
                        new MoveLearnSetEntry(Move.METAL_SOUND,20),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,23),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,25),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,28),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,33),
                        new MoveLearnSetEntry(Move.HYPNOSIS,37),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,42),
                        new MoveLearnSetEntry(Move.WILLOWISP,45),
                        new MoveLearnSetEntry(Move.POLTERGEIST,51)                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 35, 53, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.MANSION),
                0.28, 0.3,
                List.of());
           setLangFileName("Boodoir");

    }


}
