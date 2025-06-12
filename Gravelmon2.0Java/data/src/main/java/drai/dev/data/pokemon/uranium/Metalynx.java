package drai.dev.data.pokemon.uranium;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Metalynx extends Pokemon {
    public Metalynx() {
        super("Metalynx",
                Type.GRASS, Type.STEEL,
                new Stats(85,95,115,70,100,65),
                List.of(Ability.BATTLE_ARMOR), Ability.OVERGROW,
                16, 1250,
                new Stats(0,0,1,0,1,0), 45,
                0.875,
                239, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.GRASS, EggGroup.FIELD),
                List.of("METALYNX stalk their prey in packs. Their brutally sharp tail blades are their main weapon."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.LEECH_SEED,1),
                        new MoveLearnSetEntry(Move.VINE_WHIP,1),
                        new MoveLearnSetEntry(Move.GROWL,4),
                        new MoveLearnSetEntry(Move.LEECH_SEED,7),
                        new MoveLearnSetEntry(Move.VINE_WHIP,9),
                        new MoveLearnSetEntry(Move.METAL_CLAW,13),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,18),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,20),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,25),
                        new MoveLearnSetEntry(Move.SLASH,28),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,31),
                        new MoveLearnSetEntry(Move.IRON_TAIL,34),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,38),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,41),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,46),
                        new MoveLearnSetEntry(Move.METEOR_MASH,51),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.CRUNCH,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.FRENZY_PLANT,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.POISON_FANG,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),

                        new MoveLearnSetEntry(Move.CHARM,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"egg"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"egg"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,"egg"),
                        new MoveLearnSetEntry(Move.MAGNET_BOMB,"egg"),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,"egg"),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,"egg")
                        ),
                List.of(Label.URANIUM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
