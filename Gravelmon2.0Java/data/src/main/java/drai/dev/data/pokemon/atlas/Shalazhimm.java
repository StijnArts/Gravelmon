package drai.dev.data.pokemon.atlas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Shalazhimm extends drai.dev.data.pokemon.Pokemon {
    public Shalazhimm() {
        super("Shalazhimm",
                Type.PSYCHIC,
                new Stats(105,
                        125,
                        103,
                        80,
                        82,
                        40),
                List.of(Ability.MAGICIAN), Ability.SUPER_LUCK,
                21, 165,
                new Stats(0,3,0,0,0,0), 45,
                0.5,
                220, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Shalazhimm are typically seen at any places emanating magic, as it feeds off of it. They're also typically found terrorizing magic shows, as they're upset by false acts of magician-ry."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,1),
                        new MoveLearnSetEntry(Move.TELEPORT,1),
                        new MoveLearnSetEntry(Move.SHARPEN,1),
                        new MoveLearnSetEntry(Move.SLASH,1),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,1),
                        new MoveLearnSetEntry(Move.IMPRISON,1),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,1),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,1),
                        new MoveLearnSetEntry(Move.WONDER_ROOM,1),
                        new MoveLearnSetEntry(Move.MAGIC_ROOM,1),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,1),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,1),
                        new MoveLearnSetEntry(Move.TWIN_BLADE,1),
                        new MoveLearnSetEntry(Move.JAB,1),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.PSIBULLET,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HYPNOSIS,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.TRICK,"tm"),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,"tm"),
                        new MoveLearnSetEntry(Move.SACRED_SWORD,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(38)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MAGICAL)
    .canSeeSky()
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Shalazhimm");

    }


}
