package drai.dev.gravelmon.pokemon.sage;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Crakling extends Pokemon {
    public Crakling() {
        super("Crakling",
                Type.FIRE,
                new Stats(50, 75, 48, 85, 55, 62),
                List.of(Ability.AFTERMATH, Ability.OVERGROW), Ability.FLASH_FIRE,
                10, 204,
                new Stats(0,0,0,1,0,0), 45,
                0.5,
                75, ExperienceGroup.SLOW,
                70,
                100, List.of(EggGroup.DRAGON, EggGroup.MONSTER),
                List.of("If one hears sharp explosions with no one around, it might be a Crakling, blowing up pebbles for fun. Its tail constantly shoots bright sparks."),
                List.of(new EvolutionEntry("fuelong", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"43")))),
                List.of(
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.CAUSTIC_BREATH,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,5),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,10),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,15),
                        new MoveLearnSetEntry(Move.WORK_UP,19),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,24),
                        new MoveLearnSetEntry(Move.UPROAR,29),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,33),
                        new MoveLearnSetEntry(Move.FLAME_BURST,38),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,43),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,47),
                        new MoveLearnSetEntry(Move.EXPLOSION,52),
                        new MoveLearnSetEntry(Move.HEALING_WISH,57),
                        new MoveLearnSetEntry(Move.OVERHEAT,61),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.INCINERATE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tutor"),
                        new MoveLearnSetEntry(Move.FIRE_PLEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tutor"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tutor"),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.SWIFT,"tutor"),
                        new MoveLearnSetEntry(Move.UPROAR,"tutor"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tutor")
                        ),
                List.of(Label.SAGE),
                2, List.of(
                        new ItemDrop("minecraft:gunpowder",50, 1,2)
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 3, 28, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BAMBOO)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.35, 0.3,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
