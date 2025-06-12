package drai.dev.data.pokemon.nosto;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Tilow extends drai.dev.data.pokemon.Pokemon {
    public Tilow() {
        super("Tilow",
                Type.FIRE, Type.GHOST,
                new Stats(30,
                        30,
                        32,
                        55,
                        55,
                        48),
                List.of(Ability.FLAME_BODY,Ability.ILLUMINATE,Ability.FIERYSPIRIT), Ability.FIERYSPIRIT,
                3, 165,
                new Stats(0,1,0,0,1,0), 190,
                0.5,
                55, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Tilow produce a small, warm flame on top of their head by using an oil they produce inside their bodies."),
                List.of(new EvolutionEntry("candhoul", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,1),
                        new MoveLearnSetEntry(Move.ASTONISH,4),
                        new MoveLearnSetEntry(Move.EMBER,6),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,9),
                        new MoveLearnSetEntry(Move.SINGE,12),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,14),
                        new MoveLearnSetEntry(Move.LIGHTUP,18),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,21),
                        new MoveLearnSetEntry(Move.INCINERATE,24),
                        new MoveLearnSetEntry(Move.WILLOWISP,28),
                        new MoveLearnSetEntry(Move.HEX,31),
                        new MoveLearnSetEntry(Move.CURSE,36),
                        new MoveLearnSetEntry(Move.FIRE_LASH,40),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,44),
                        new MoveLearnSetEntry(Move.MEMENTO,47),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,50),
                        new MoveLearnSetEntry(Move.POLTERGEIST,54)                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(7)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MAGICAL)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.MANSION)
    .build(), List.of());
	
           setLangFileName("Tilow");

    }


}
