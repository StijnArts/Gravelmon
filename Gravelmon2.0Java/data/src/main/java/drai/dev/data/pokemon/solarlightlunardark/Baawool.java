package drai.dev.data.pokemon.solarlightlunardark;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Baawool extends drai.dev.data.pokemon.Pokemon {
    public Baawool() {
        super("Baawool",
                Type.NORMAL,
                new Stats(55,
                        45,
                        55,
                        45,
                        45,
                        55),
                List.of(Ability.PICKUP), Ability.TANGLED_FEET,
                5, 72,
                new Stats(1,0,0,0,0,0), 75,
                0.875,
                55, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Baawool are famous for their soft wool which is used for all kinds of clothing. Baawool farms still thrive today due to the lack of artificial materials that can replace wool."),
                List.of(new EvolutionEntry("baabush", EvolutionType.ITEM_INTERACT, false, List.of(), 
 List.of(), List.of(), "cobblemon:leaf_stone"),
new EvolutionEntry("baablaze", EvolutionType.ITEM_INTERACT, false, List.of(), 
 List.of(), List.of(), "cobblemon:fire_stone"),
new EvolutionEntry("baabble", EvolutionType.ITEM_INTERACT, false, List.of(), 
 List.of(), List.of(), "cobblemon:water_stone"),
new EvolutionEntry("baabreeze", EvolutionType.ITEM_INTERACT, false, List.of(), 
 List.of(), List.of(), "gravelmon:air_stone"),
new EvolutionEntry("baablock", EvolutionType.ITEM_INTERACT, false, List.of(), 
 List.of(), List.of(), "gravelmon:solid_stone"),
new EvolutionEntry("baablizz", EvolutionType.ITEM_INTERACT, false, List.of(), 
 List.of(), List.of(), "cobblemon:ice_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.ENCORE,40),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,22),
                        new MoveLearnSetEntry(Move.ROUND,8),
                        new MoveLearnSetEntry(Move.CHARM,15),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,26),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,36),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,33),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,5),
                        new MoveLearnSetEntry(Move.PLAYFIGHT,1),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,47),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,19),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.BODY_SLAM,29),
                        new MoveLearnSetEntry(Move.HEADBUTT,12),
                        new MoveLearnSetEntry(Move.MILK_DRINK,43),
                        new MoveLearnSetEntry(Move.LAST_RESORT,50),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.TRAILBLAZE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.ALLURINGVOICE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.IMPRISON,"tm"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tm"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"tm"),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,"tm"),
                        new MoveLearnSetEntry(Move.ENCORE,"tm"),
                        new MoveLearnSetEntry(Move.CRACKLE_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tm"),
                        new MoveLearnSetEntry(Move.SWEET_KISS,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.AMNESIA,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tm"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tm"),
                        new MoveLearnSetEntry(Move.WISH,"tm")),
                List.of(Label.SOLARLIGHTLUNARDARK),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Baawool");

    }


}
