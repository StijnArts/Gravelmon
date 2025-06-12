package drai.dev.data.pokemon.ayrei.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AyreianHitmonchan extends drai.dev.data.pokemon.Pokemon {
    public AyreianHitmonchan(String name, Aspect aspect) {
        super(name, aspect, "AyreianHitmonchan",
                Type.FIGHTING,Type.DARK,
                new Stats(50,
                        120,
                        99,
                        56,
                        35,
                        95),
                List.of(Ability.KEEN_EYE,Ability.IRON_FIST), null,
                14, 502,
                new Stats(0,0,0,0,0,2), 45,
                1.0,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("Its punches slice the air. They are launched at such high speed, even a slight graze could cause a burn."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.QUICK_GUARD,21),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,24),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,28),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,0),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,36),
                        new MoveLearnSetEntry(Move.HELPING_HAND,1),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,24),
                        new MoveLearnSetEntry(Move.FEINT,1),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,8),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                        new MoveLearnSetEntry(Move.VACUUM_WAVE,1),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,44),
                        new MoveLearnSetEntry(Move.REVENGE,16),
                        new MoveLearnSetEntry(Move.ASSURANCE,8),
                        new MoveLearnSetEntry(Move.DARKEST_LARIAT,40),
                        new MoveLearnSetEntry(Move.FAKE_OUT,1),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,24),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,4),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,1),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,32),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,1),
                        new MoveLearnSetEntry(Move.DETECT,12),
                        new MoveLearnSetEntry(Move.AGILITY,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,"tm"),
                        new MoveLearnSetEntry(Move.COACHING,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.COVET,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.LASER_FOCUS,"tm"),
                        new MoveLearnSetEntry(Move.LOW_KICK,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.MEGA_KICK,"tm"),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.METRONOME,"tm"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETALIATE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.REVENGE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.UPROAR,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm")                        ),
                List.of(Label.VANGUARD),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(20)
    .setWeight(SpawnWeight.ULTRA_RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Hitmonchan");
        setPreEvolution("tyrogue");
        addAdditionalEvolution("tyrogue", new EvolutionEntry("hitmonchan ayreian", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"cobblemon:dusk_stone") );

    }


}
