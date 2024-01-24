package drai.dev.gravelmon.pokemon.flux.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class AlteranZorua extends Pokemon {
    public AlteranZorua(int dexNo) {
        super(dexNo,"AlteranZorua",
                Type.GHOST,
                new Stats(40, 65, 40, 85, 45, 55),
                List.of(Ability.ILLUSION), Ability.INFILTRATOR,
                7, 13,
                new Stats(0,0,0,1,0,0), 75,
                0.5,
                59, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("An old fable describes a ZORUA cloaked in so many illusions that it turned into one itself. This form is said to be its descendant."),
                List.of(new EvolutionEntry("Zorotsune", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME,"\"night\"")))),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,1),
                        new MoveLearnSetEntry(Move.SPITE,4),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,8),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,12),
                        new MoveLearnSetEntry(Move.SCARY_FACE,16),
                        new MoveLearnSetEntry(Move.WILLOWISP,20),
                        new MoveLearnSetEntry(Move.HEX,24),
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,28),
                        new MoveLearnSetEntry(Move.CURSE,32),
                        new MoveLearnSetEntry(Move.IMPRISON,36),
                        new MoveLearnSetEntry(Move.CALM_MIND,44),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,48),
                        new MoveLearnSetEntry(Move.MEMENTO,"egg"),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,"egg"),
                        new MoveLearnSetEntry(Move.COPYCAT,"egg"),
                        new MoveLearnSetEntry(Move.HAZE,"egg")
                        ),
                List.of(Label.GEN5,Label.FLUX),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 15, 25, 9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        this.setLangFileName("Zorua");
        this.setPortraitXYZ(0,1.8,0);
    }
}
