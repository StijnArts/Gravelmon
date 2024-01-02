package drai.dev.gravelmon.pokemon.flux.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class AlteranShroomish extends Pokemon {
    public AlteranShroomish(int dexNo) {
        super(dexNo,"AlteranShroomish",
                Type.GRASS, Type.POISON,
                new Stats(60, 40, 60, 40, 60, 35),
                List.of(Ability.EFFECT_SPORE, Ability.POISON_TOUCH), Ability.MOLD_BREAKER,
                4, 41,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                59, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.GRASS, EggGroup.FAIRY),
                List.of("With its striking red cap, it sticks out in its forest habitat. Because it carries such a potent toxin, predators know to leave it alone."),
                List.of(new EvolutionEntry("AlteranBreloom", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"23")))),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.POISON_POWDER,5),
                        new MoveLearnSetEntry(Move.STUN_SPORE,8),
                        new MoveLearnSetEntry(Move.INGRAIN,12),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,15),
                        new MoveLearnSetEntry(Move.CURSE,19),
                        new MoveLearnSetEntry(Move.HEADBUTT,22),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,26),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,29),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,33),
                        new MoveLearnSetEntry(Move.TOXIC,36),
                        new MoveLearnSetEntry(Move.SPORE,36),
                        new MoveLearnSetEntry(Move.CHARM,"egg"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,"egg"),
                        new MoveLearnSetEntry(Move.MOONBLAST,"egg"),
                        new MoveLearnSetEntry(Move.MOONLIGHT,"egg")
                        ),
                List.of(Label.GEN3,Label.FLUX),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 5, 30, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        this.setLangFileName("Shroomish");
        this.setPortraitXYZ(0,1.8,0);
    }
}
