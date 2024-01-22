package drai.dev.gravelmon.pokemon.lockemon;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Catteraxe extends Pokemon {
    public Catteraxe() {
        super("Catteraxe",
                Type.STEEL, Type.NORMAL,
                new Stats(55,
                        60,
                        85,
                        60,
                        75,
                        55),
                List.of(Ability.RECKLESS, Ability.SCRAPPY), Ability.LIMBER,
                5, 134,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                71, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Catteraxe swing their axe like tail to clear anything in it's path. They are wild and uncontrollable pokemon, although many older women have a fondness for it."),
                List.of(new EvolutionEntry("catatomb", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"gravelmon:keybone")),
                List.of(
                        new MoveLearnSetEntry(Move.FAKE_OUT,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.TACKLE,4),
                        new MoveLearnSetEntry(Move.METAL_CLAW,7),
                        new MoveLearnSetEntry(Move.ATTRACT,10),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,13),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,16),
                        new MoveLearnSetEntry(Move.COPYCAT,19),
                        new MoveLearnSetEntry(Move.PAYBACK,22),
                        new MoveLearnSetEntry(Move.CHARM,25),
                        new MoveLearnSetEntry(Move.IRON_TAIL,31),
                        new MoveLearnSetEntry(Move.COVET,34),
                        new MoveLearnSetEntry(Move.HEAL_BELL,37),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,40),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,43),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,46),
                        new MoveLearnSetEntry(Move.BATON_PASS,"egg"),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,"egg"),
                        new MoveLearnSetEntry(Move.FAKE_OUT,"egg"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,"egg"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"egg"),
                        new MoveLearnSetEntry(Move.LAST_RESORT,"egg"),
                        new MoveLearnSetEntry(Move.SIMPLE_BEAM,"egg"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.TICKLE,"egg"),
                        new MoveLearnSetEntry(Move.UPROAR,"egg"),
                        new MoveLearnSetEntry(Move.WISH,"egg"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"egg")
                        ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 2, 34, 8.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        this.setHasGenderDifferences(true);
    }
}
