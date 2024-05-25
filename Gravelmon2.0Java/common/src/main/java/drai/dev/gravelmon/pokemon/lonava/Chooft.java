package drai.dev.gravelmon.pokemon.lonava;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Chooft extends drai.dev.gravelmon.pokemon.Pokemon {
    public Chooft() {
        super("Chooft",
                Type.ELECTRIC, Type.NORMAL,
                new Stats(45,
                        60,
                        35,
                        50,
                        45,
                        60),
                List.of(Ability.LIGHTNING_ROD), Ability.STATIC,
                5, 165,
                new Stats(0,1,0,0,0,0), 190,
                0.5,
                58, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Chooft are docile Pokemon, and choose to spend most of their days asleep in a field or grazing. If mishandled, they may spit or refuse to move."),
                List.of(new EvolutionEntry("alpacurrent", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,5),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,9),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,13),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,17),
                        new MoveLearnSetEntry(Move.STOMP,21),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,25),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,29),
                        new MoveLearnSetEntry(Move.DISCHARGE,33),
                        new MoveLearnSetEntry(Move.SPIT_UP,37),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,41),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,47),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,53)                        ),
                List.of(Label.LONAVA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_HIGHLANDS, Biome.IS_PLATEAU)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Chooft");

    }


}
