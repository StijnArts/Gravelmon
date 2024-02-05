package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Artreelery extends drai.dev.gravelmon.pokemon.Pokemon {
    public Artreelery() {
        super("Artreelery",
                Type.GRASS,Type.FIRE,
                new Stats(65,
                        105,
                        110,
                        67,
                        80,
                        63),
                List.of(Ability.LONG_REACH), Ability.SKILL_LINK,
                14, 165,
                new Stats(0,1,1,0,0,0), 75,
                0.5,
                161, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("It is able to shoot out fruits with its cannon, including Pomegrenade. When fighting a rival Artreelery, their battlefield usually end completely destroyed."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,5),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,9),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,12),
                        new MoveLearnSetEntry(Move.BULLET_SEED,17),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,20),
                        new MoveLearnSetEntry(Move.BIDE,23),
                        new MoveLearnSetEntry(Move.FLAME_BURST,27),
                        new MoveLearnSetEntry(Move.SEED_BOMB,34),
                        new MoveLearnSetEntry(Move.EXPLOSION,38),
                        new MoveLearnSetEntry(Move.INFERNO,44),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD,47),
                        new MoveLearnSetEntry(Move.SYNTHESIS,53)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 28, 54, .6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Artreelery");

    }


}
