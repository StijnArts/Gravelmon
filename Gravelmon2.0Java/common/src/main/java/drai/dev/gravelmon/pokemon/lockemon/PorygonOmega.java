package drai.dev.gravelmon.pokemon.lockemon;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class PorygonOmega extends Pokemon {
    public PorygonOmega() {
        super("PorygonOmega",
                Type.NORMAL,
                new Stats(100,
                        50,
                        90,
                        120,
                        90,
                        65),
                List.of(Ability.SURVEILLANCE, Ability.ENERGIZER), Ability.ANALYTIC,
                11, 1255,
                new Stats(0,0,0,3,0,0), 45,
                0.5,
                160, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CONVERSION,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,1),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,1),
                        new MoveLearnSetEntry(Move.RECYCLE,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,15),
                        new MoveLearnSetEntry(Move.PSYBEAM,20),
                        new MoveLearnSetEntry(Move.CONVERSION_2,25),
                        new MoveLearnSetEntry(Move.AGILITY,30),
                        new MoveLearnSetEntry(Move.RECOVER,35),
                        new MoveLearnSetEntry(Move.DISCHARGE,40),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,45),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,50),
                        new MoveLearnSetEntry(Move.LOCKON,55),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,60),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,65)
                        ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 29, 56, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD))
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
        setLangFileName("Porygon-Omega");
        setCanFly(true);
        addAdditionalEvolution("porygon2", new EvolutionEntry("porygonomega", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM,"\"gravelmon:amaze_drive\""))));
    }
}
