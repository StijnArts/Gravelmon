package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Speyeder extends drai.dev.gravelmon.pokemon.Pokemon {
    public Speyeder() {
        super("Speyeder",
                Type.BUG,Type.GHOST,
                new Stats(55,
                        90,
                        35,
                        65,
                        70,
                        80),
                List.of(Ability.INTIMIDATE,Ability.HARVEST,Ability.FRISK), Ability.FRISK,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- Ingrain Grass - Leech LifeSTAB Bug - String Shot Bug - Sand Attack Ground 8 AstonishSTAB Ghost 11 InfestationSTAB Bug 13 Scary Face Normal 19 Bug BiteSTAB Bug 25 Sticky Web Bug 31 Shadow SneakSTAB Ghost 34 Spite Ghost 38 Dig Ground 41 Electroweb Electric 45 Skitter SmackSTAB Bug 50 Silk Trap Bug 55 Phantom ForceSTAB Ghost"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.ASTONISH,8),
                        new MoveLearnSetEntry(Move.INFESTATION,11),
                        new MoveLearnSetEntry(Move.SCARY_FACE,13),
                        new MoveLearnSetEntry(Move.BUG_BITE,19),
                        new MoveLearnSetEntry(Move.STICKY_WEB,25),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,31),
                        new MoveLearnSetEntry(Move.SPITE,34),
                        new MoveLearnSetEntry(Move.DIG,38),
                        new MoveLearnSetEntry(Move.ELECTROWEB,41),
                        new MoveLearnSetEntry(Move.SKITTER_SMACK,45),
                        new MoveLearnSetEntry(Move.SILK_TRAP,50),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,55),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.SAND_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,"tm"),
                        new MoveLearnSetEntry(Move.ROTOTILLER,"tm"),
                        new MoveLearnSetEntry(Move.SNATCH,"tm")                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Speyeder");

    }


}
