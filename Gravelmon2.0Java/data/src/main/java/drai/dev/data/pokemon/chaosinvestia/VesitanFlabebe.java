package drai.dev.data.pokemon.chaosinvestia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VesitanFlabebe extends drai.dev.data.pokemon.Pokemon {
    public VesitanFlabebe(String name, Aspect aspect) {
        super(name, aspect, "Flabebe",
                Type.FAIRY,Type.GRASS,
                new Stats(44,
                        45,
                        36,
                        41,
                        62,
                        80),
                List.of(Ability.FLOWER_VEIL,Ability.SYMBIOSIS), null,
                1, 1,
                new Stats(0,0,0,0,0,1), 255,
                0.0,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of("Hat es eine Blume gefunden, die ihm gefällt, lebt es sein Leben lang in Symbiose mit ihr. Es lässt sich unbekümmert vom Wind treiben."),
                List.of(new EvolutionEntry("floette vesitan", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"19")))),
                List.of(
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,10),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,45),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,48),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,22),
                        new MoveLearnSetEntry(Move.MOONBLAST,41),
                        new MoveLearnSetEntry(Move.WISH,20),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,15),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD,28),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,33),
                        new MoveLearnSetEntry(Move.VINE_WHIP,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,6),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,24),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,37),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,"egg"),
                        new MoveLearnSetEntry(Move.CAPTIVATE,"egg"),
                        new MoveLearnSetEntry(Move.COPYCAT,"egg")                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 4, 23, 9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_SNOWY))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Flabebe");

    }


}
