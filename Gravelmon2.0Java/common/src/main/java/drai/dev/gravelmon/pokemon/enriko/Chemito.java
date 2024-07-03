package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Chemito extends drai.dev.gravelmon.pokemon.Pokemon {
    public Chemito() {
        super("Chemito",
                Type.BUG, Type.POISON,
                new Stats(35,
                        65,
                        35,
                        65,
                        35,
                        90),
                List.of(Ability.POISON_TOUCH), Ability.SIMPLE,
                7, 165,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.FLYING),
                List.of("Their abdomen contains dangerous chemicals that leach into the blood it drinks. It will only attack with it if absolutely necessary."),
                List.of(new EvolutionEntry("cyanidae", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"24")))
                ),
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
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP, Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
