package drai.dev.data.pokemon.varitas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Lectrosaur extends drai.dev.data.pokemon.Pokemon {
    public Lectrosaur() {
        super("Lectrosaur",
                Type.ROCK, Type.ELECTRIC,
                new Stats(70,
                        95,
                        50,
                        95,
                        65,
                        120),
                List.of(Ability.LIGHTNING_ROD), Ability.GALVANIZE,
                16, 165,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It can fire off powerful electrical attacks using its antenna-like horn. Massive groups of them were believed to congregate during thunderstorms in prehistoric times."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MEGAHORN,1),
                        new MoveLearnSetEntry(Move.SCREECH,5),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,10),
                        new MoveLearnSetEntry(Move.ACCELEROCK,15),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,20),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,25),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,30),
                        new MoveLearnSetEntry(Move.PARABOLIC_CHARGE,35),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,40),
                        new MoveLearnSetEntry(Move.JUMP_KICK,45),
                        new MoveLearnSetEntry(Move.SLASH,50),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,55),
                        new MoveLearnSetEntry(Move.THUNDER,60),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,65)                        ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 41, 58, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                List.of());
           setLangFileName("Lectrosaur");

    }


}
