package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Troupican extends drai.dev.gravelmon.pokemon.Pokemon {
    public Troupican() {
        super("Troupican",
                Type.NORMAL,Type.FLYING,
                new Stats(80,
                        70,
                        72,
                        102,
                        85,
                        71),
                List.of(Ability.BIG_PECKS,Ability.COMPETITIVE,Ability.OWN_TEMPO), Ability.OWN_TEMPO,
                8, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.75,
                163, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("- PeckSTAB Flying - Flatter Dark - Roost Flying - Chirp Normal 6 Encore Normal 10 Sing Normal 15 RoundSTAB Normal 19 Disarming Voice Fairy 23 Swagger Normal 27 UproarSTAB Normal 30 Mirror Move Flying 34 Echoed VoiceSTAB Normal 39 Drill PeckSTAB Flying 43 Feather Dance Flying 46 Role Play Psychic 50 Hyper VoiceSTAB Normal 55 Paradise DisplaySTAB Flying 59 Perish Song Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CHIRP,1),
                        new MoveLearnSetEntry(Move.ENCORE,6),
                        new MoveLearnSetEntry(Move.SING,10),
                        new MoveLearnSetEntry(Move.ROUND,15),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,19),
                        new MoveLearnSetEntry(Move.SWAGGER,23),
                        new MoveLearnSetEntry(Move.UPROAR,27),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,30),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,34),
                        new MoveLearnSetEntry(Move.DRILL_PECK,39),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,43),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,46),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,50),
                        new MoveLearnSetEntry(Move.PARADISEDISPLAY,55),
                        new MoveLearnSetEntry(Move.PERISH_SONG,59),
                        new MoveLearnSetEntry(Move.MYSTICSONG,"tm"),
                        new MoveLearnSetEntry(Move.WINDBLAST,"tm"),
                        new MoveLearnSetEntry(Move.WING_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tm"),
                        new MoveLearnSetEntry(Move.BOOMBURST,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Troupican");

    }


}
