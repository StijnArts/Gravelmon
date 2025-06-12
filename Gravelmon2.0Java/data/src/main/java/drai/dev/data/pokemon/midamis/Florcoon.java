package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Florcoon extends drai.dev.data.pokemon.Pokemon {
    public Florcoon() {
        super("Florcoon",
                Type.GRASS, Type.NORMAL,
                new Stats(45,
                        55,
                        45,
                        50,
                        45,
                        40),
                List.of(Ability.OVERGROW), Ability.SCRAPPY,
                4, 165,
                new Stats(0,1,0,0,0,0), 45,
                0.875,
                54, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.MONSTER),
                List.of("Florcoon are rather energetic Pokemon, who like foraging through small forests for fallen berries and such. They are generally friendly, but upon evolution it can grow a rather aggressive nature. A Florcoon likes nothing better than to walk up to a person's behind and poke them with their horns."),
                List.of(new EvolutionEntry("bufaroon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.LEECH_SEED,6),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,9),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,12),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,15),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,21),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,26),
                        new MoveLearnSetEntry(Move.BODY_SLAM,31),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,36),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,41),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,46),
                        new MoveLearnSetEntry(Move.LEAF_STORM,51),
                        new MoveLearnSetEntry(Move.VINE_WHIP,"tm"),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,"tm"),
                        new MoveLearnSetEntry(Move.POISON_POWDER,"tm"),
                        new MoveLearnSetEntry(Move.STUN_SPORE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,"tm"),
                        new MoveLearnSetEntry(Move.SPORE,"tm"),
                        new MoveLearnSetEntry(Move.CRUNCH,"tm"),
                        new MoveLearnSetEntry(Move.INGRAIN,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NEAR_BERRY_BUSH)
    .build(), List.of());
	
           setLangFileName("Florcoon");

    }


}
