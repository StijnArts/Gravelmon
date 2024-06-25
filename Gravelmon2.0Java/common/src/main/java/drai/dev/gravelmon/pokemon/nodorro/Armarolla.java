package drai.dev.gravelmon.pokemon.nodorro;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Armarolla extends drai.dev.gravelmon.pokemon.Pokemon {
    public Armarolla() {
        super("Armarolla",
                Type.STEEL, Type.ROCK,
                new Stats(60,
                        90,
                        100,
                        40,
                        60,
                        70),
                List.of(Ability.STURDY,Ability.BATTLE_ARMOR), Ability.SOLID_ROCK,
                6, 320,
                new Stats(0,1,1,0,0,0), 120,
                0.5,
                137, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("- Sand Attack Ground - Tackle Normal - Leer Normal - Harden Normal - RolloutSTAB Rock 4 Headbutt Normal 6 Mud Shot Ground 11 RolloutSTAB Rock 16 Stealth Rock Rock 19 Sharpen Normal 24 Rock BlastSTAB Rock 27 Rock Polish Rock 29 Iron Defense Steel 31 Spiky Shield Grass 36 Rock Climb Normal 39 Metal BurstSTAB Steel 40 Rock SlideSTAB Rock 43 Iron HeadSTAB Steel 50 Horn Drill Normal 53 Earthquake Ground"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.HEADBUTT,4),
                        new MoveLearnSetEntry(Move.MUD_SHOT,6),
                        new MoveLearnSetEntry(Move.ROLLOUT,11),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,16),
                        new MoveLearnSetEntry(Move.SHARPEN,19),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,24),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,27),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,29),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,31),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB,36),
                        new MoveLearnSetEntry(Move.METAL_BURST,39),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,40),
                        new MoveLearnSetEntry(Move.IRON_HEAD,43),
                        new MoveLearnSetEntry(Move.HORN_DRILL,50),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,53),
                        new MoveLearnSetEntry(Move.BARRIER,"tm"),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,"tm"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,"tm"),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm")                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Armarolla");

    }


}
