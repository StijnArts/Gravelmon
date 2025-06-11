package drai.dev.data.pokemon.azure.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class MysticStufful extends Pokemon {
    public MysticStufful(String name, Aspect aspect) {
        super(name, aspect,"MysticStufful",
                Type.NORMAL, Type.GHOST,
                new Stats(75, 70, 50, 50, 50, 45),
                List.of(Ability.CURSED_BODY, Ability.UNAWARE), Ability.CUTE_CHARM,
                5, 68,
                new Stats(1,0,0,0,0,0), 140,
                0.5,
                68, ExperienceGroup.MEDIUM_SLOW,
                70,
                51,  List.of(EggGroup.FIELD),
                List.of(""),
                List.of(new EvolutionEntry("mysticbewear", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"27")))),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.TORMENT,4),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,8),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,12),
                        new MoveLearnSetEntry(Move.CURSE,16),
                        new MoveLearnSetEntry(Move.TAUNT,20),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,24),
                        new MoveLearnSetEntry(Move.SPITE,28),
                        new MoveLearnSetEntry(Move.AGILITY,32),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,36),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,40),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,44),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,48)
                        ),
                List.of(Label.AZURE, Label.GEN7),
                0, List.of(),
                new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(27)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Stufful");

    }
}
