package drai.dev.gravelmon.pokemon.ionos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Minjin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Minjin() {
        super("Minjin",
                Type.FLYING, Type.FAIRY,
                new Stats(100,
                        80,
                        50,
                        130,
                        60,
                        130),
                List.of(Ability.AERILATE), Ability.AERILATE,
                16, 0,
                new Stats(0,0,0,0,0,0), 3,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A close relative to Chingling and Chimecho. Minjin was chosen by another legendary Pokémon of extraordinary power to provide the air of Ionos with the remaining natural gases that makes up the atmosphere. Despite being small in size it can create incredibly loud noises, often when angered or feeling threatened. The sounds this Pokémon makes is created when it splits its body into two separate parts, collecting massive amounts of air between each part and relases it all at once with a vocal blast"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.HEALING_WISH,1),
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.GROWL,4),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,8),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,12),
                        new MoveLearnSetEntry(Move.HELPING_HAND,15),
                        new MoveLearnSetEntry(Move.ASSIST,15),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,19),
                        new MoveLearnSetEntry(Move.HEAL_BELL,24),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,32),
                        new MoveLearnSetEntry(Move.UPROAR,36),
                        new MoveLearnSetEntry(Move.SING,42),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,50),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,59),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,72),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,80),
                        new MoveLearnSetEntry(Move.BOOMBURST,88)                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 75, .0012, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Minjin");

    }


}
