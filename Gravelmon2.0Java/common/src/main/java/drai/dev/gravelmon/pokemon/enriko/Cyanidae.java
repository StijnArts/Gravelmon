package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Cyanidae extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cyanidae() {
        super("Cyanidae",
                Type.BUG,Type.POISON,
                new Stats(75,
                        90,
                        50,
                        90,
                        50,
                        145),
                List.of(Ability.POISON_TOUCH), Ability.SIMPLE,
                14, 165,
                new Stats(0,0,0,0,0,2), 85,
                0.5,
                135, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.FLYING),
                List.of("Cyanidae venom is potent enough to knock out a Thermedary. They lance their prey and slurp up blood in under a second."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.PESTER,3),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,6),
                        new MoveLearnSetEntry(Move.ACID,9),
                        new MoveLearnSetEntry(Move.SILVER_WIND,14),
                        new MoveLearnSetEntry(Move.HARDEN,19),
                        new MoveLearnSetEntry(Move.SLUDGE,22),
                        new MoveLearnSetEntry(Move.AMNESIA,26),
                        new MoveLearnSetEntry(Move.WING_ATTACK,29),
                        new MoveLearnSetEntry(Move.AGILITY,33),
                        new MoveLearnSetEntry(Move.POISON_TAIL,36),
                        new MoveLearnSetEntry(Move.FELL_STINGER,41),
                        new MoveLearnSetEntry(Move.TAIL_GLOW,45),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,56)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 24, 42, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP, Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
