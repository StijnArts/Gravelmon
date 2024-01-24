package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Dragamant extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dragamant() {
        super("Dragamant",
                Type.ROCK,Type.DRAGON,
                new Stats(80,
                        100,
                        160,
                        80,
                        65,
                        50),
                List.of(Ability.CLEAR_BODY,Ability.STURDY,Ability.MIRROR_ARMOR), Ability.MIRROR_ARMOR,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- Harden Normal - Dragon RageSTAB Dragon - Rock ThrowSTAB Rock - Stealth Rock Rock - Horn Attack Normal 8 Reflect Psychic 14 Rock TombSTAB Rock 18 Sharpen Normal 22 Mirror Shot Steel 28 Rock Polish Rock 32 Iron Defense Steel 36 Rock SlideSTAB Rock 40 Dragon ClawSTAB Dragon 44 Dragon Dance Dragon 48 Power GemSTAB Rock 54 Dragon RushSTAB Dragon 62 Stone EdgeSTAB Rock 68 Megahorn Bug"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HORN_ATTACK,1),
                        new MoveLearnSetEntry(Move.REFLECT,8),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,14),
                        new MoveLearnSetEntry(Move.SHARPEN,18),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,22),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,28),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,32),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,36),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,40),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,44),
                        new MoveLearnSetEntry(Move.POWER_GEM,48),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,54),
                        new MoveLearnSetEntry(Move.STONE_EDGE,62),
                        new MoveLearnSetEntry(Move.MEGAHORN,68)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dragamant");

    }


}
