package drai.dev.gravelmon.pokemon.lockemon;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Botnyak extends Pokemon {
    public Botnyak() {
        super("Botnyak",
                Type.STEEL,
                new Stats(55,
                        30,
                        70,
                        110,
                        105,
                        116),
                List.of(Ability.TRACE, Ability.SURVEILLANCE), Ability.ANALYTIC,
                3, 125,
                new Stats(0,0,0,0,0,3), 90,
                0.5,
                143, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Originally created by Tom Bezzle as a companion Pokemon, Botnyak were engineered to be extremely marketable. When the product flopped, Botnyak were repurposed by Amaze-All for other projects."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FAKE_OUT,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,1),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,1),
                        new MoveLearnSetEntry(Move.METAL_BURST,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,12),
                        new MoveLearnSetEntry(Move.METAL_CLAW,16),
                        new MoveLearnSetEntry(Move.TAUNT,20),
                        new MoveLearnSetEntry(Move.SWAGGER,24),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,31),
                        new MoveLearnSetEntry(Move.SCREECH,36),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,42),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,48),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,54),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"egg"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"egg")
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 22, 45, 6.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
    }
}
