package drai.dev.data.pokemon.xenoverse;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class ShyleonXenoversal extends Pokemon {
    public ShyleonXenoversal(String name, Aspect aspect) {
        super(name, aspect,"ShyleonXenoversal",
                Type.GRASS, Type.FAIRY,
                new Stats(118, 54, 73, 108, 73, 124),
                List.of(Ability.MAJESTIC_AURA), Ability.JUNGLE_SPIRIT,
                27, 770,
                new Stats(0,0,0,0,0,2), 45,
                -1,
                64, ExperienceGroup.SLOW,
                70,
                41, List.of(EggGroup.UNDISCOVERED),
                List.of("It Aquired magic powers after absorbing the Blue Energy. It was revered as a deity by an ancient civilization."),
                List.of(new EvolutionEntry("shyleon xenoversal=false", EvolutionType.LEVEL_UP, false, List.of(),
                                List.of()),
                        new EvolutionEntry("shyleonterrestrial", EvolutionType.LEVEL_UP, false, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM, "gravelmon:terrestrial_ring"))).notOptional(),
                        new EvolutionEntry("shyleonastral", EvolutionType.LEVEL_UP, false, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM, "gravelmon:terrestrial_ring"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "50"))).notOptional(),
                        new EvolutionEntry("shyleonastral", EvolutionType.LEVEL_UP, false, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM, "gravelmon:xenoversal_ring"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "50"))).notOptional()),
                List.of(
                        new MoveLearnSetEntry(Move.FERAL_CLUTCH,1),
                        new MoveLearnSetEntry(Move.HAWTHORNS,1),
                        new MoveLearnSetEntry(Move.BENEVOLENCE,1),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,1),
                        new MoveLearnSetEntry(Move.HISS,1),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,1),
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,8),
                        new MoveLearnSetEntry(Move.GROWTH,13),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,17),
                        new MoveLearnSetEntry(Move.LEAF_TORNADO,21),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,25),
                        new MoveLearnSetEntry(Move.AGILITY,28),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,32),
                        new MoveLearnSetEntry(Move.FERAL_CLUTCH,36),
                        new MoveLearnSetEntry(Move.MAGIC_WALL,38),
                        new MoveLearnSetEntry(Move.SYNTHESIS,40),
                        new MoveLearnSetEntry(Move.MOONBLAST,45),
                        new MoveLearnSetEntry(Move.EARTH_POWER,48),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,51),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,56),
                        new MoveLearnSetEntry(Move.LEAF_STORM,61),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.BENEVOLENCE,"tutor"),
                        new MoveLearnSetEntry(Move.BIND,"tutor"),
                        new MoveLearnSetEntry(Move.COVET,"tutor"),
                        new MoveLearnSetEntry(Move.FAIRY_PLEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.FRENZY_PLANT,"tutor"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tutor"),
                        new MoveLearnSetEntry(Move.HAWTHORNS,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_ROOM,"tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_WALL,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.STAR_BURST,"tutor"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tutor"),
                        new MoveLearnSetEntry(Move.WORRY_SEED,"tutor")
                        ),
                List.of(Label.XENOVERSE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Shyleon");

    }
}
