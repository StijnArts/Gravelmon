package drai.dev.data.pokemon.infinity;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Nidorook extends Pokemon {
    public Nidorook() {
        super("Nidorook",
                Type.POISON, Type.GROUND,
                new Stats(78, 97, 75, 85, 70, 100),
                List.of(Ability.POISON_POINT, Ability.MERCILESS), Ability.SHEER_FORCE,
                14, 768,
                new Stats(0,2,0,0,0,2), 45,
                0.5,
                214, ExperienceGroup.MEDIUM_SLOW,
                70,
                52, List.of(EggGroup.FIELD, EggGroup.MONSTER),
                List.of("When a Nidorino or Nidorina evolve into Nidorook, they maintain their quadruped form. This evolutionary branch has an emphasis on speed."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BARBED_TACKLE,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,1),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,1),
                        new MoveLearnSetEntry(Move.HELPING_HAND,1),
                        new MoveLearnSetEntry(Move.BITE,23),
                        new MoveLearnSetEntry(Move.BODY_SLAM,35),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,40),
                        new MoveLearnSetEntry(Move.FLATTER,43),
                        new MoveLearnSetEntry(Move.EARTH_POWER,45),
                        new MoveLearnSetEntry(Move.POISON_JAB,48),
                        new MoveLearnSetEntry(Move.POISON_FANG,55),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,58),
                        new MoveLearnSetEntry(Move.MEGAHORN,62),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.QUASH,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tutor"),
                        new MoveLearnSetEntry(Move.DRILL_RUN,"tutor"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.MEGA_KICK,"tutor"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tutor"),
                        new MoveLearnSetEntry(Move.BEAT_UP,"egg"),
                        new MoveLearnSetEntry(Move.CHARM,"egg"),
                        new MoveLearnSetEntry(Move.CHIP_AWAY,"egg"),
                        new MoveLearnSetEntry(Move.COUNTER,"egg"),
                        new MoveLearnSetEntry(Move.DISABLE,"egg"),
                        new MoveLearnSetEntry(Move.ENDURE,"egg"),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,"egg"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"egg"),
                        new MoveLearnSetEntry(Move.POISON_TAIL,"egg"),
                        new MoveLearnSetEntry(Move.PURSUIT,"egg"),
                        new MoveLearnSetEntry(Move.SKULL_BASH,"egg"),
                        new MoveLearnSetEntry(Move.SUPERSONIC,"egg"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"egg"),
                        new MoveLearnSetEntry(Move.VENOM_SWIPE,"egg")
                        ),
                List.of(Label.INFINITY),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(36)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .duringDaytime()
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setPreEvolution("nidorino");
        addAdditionalEvolution("nidorina", new EvolutionEntry("nidorook", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"gravelmon:astral_stone"));
        addAdditionalEvolution("nidorino", new EvolutionEntry("nidorook", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"gravelmon:astral_stone"));

        this.setBaseScale(1);
        this.setHitbox(1.2,1.3);
        getSpeciesFileData().addBasicVariation("SkyWolf");
        getPosingFileData().setPortraitData( 1.2f, new Vector3(-.7, 0.4, 0));
        getPosingFileData().setProfileData( .5f, new Vector3(0, 1, 0));
        getPosingFileData().setBasicHead();
        getPosingFileData().head = "other_head_bone";
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().withLook().withBlink().markAsBackupPose(),
                AnimationData.walkingAnimation().withLook().withBlink(),
                AnimationData.sleepingAnimation()
                ));
        getPosingFileData().setCry("q.bedrock_stateful('nidorook', 'cry')");
    }
}
