package drai.dev.data.pokemon.chaosinvestia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VesitanBergmite extends drai.dev.data.pokemon.Pokemon {
    public VesitanBergmite(String name, Aspect aspect) {
        super(name, aspect, "VesitanBergmite",
                Type.ICE,Type.GROUND,
                new Stats(55,
                        69,
                        85,
                        40,
                        32,
                        60),
                List.of(Ability.OWN_TEMPO,Ability.ICE_BODY), null,
                10, 995,
                new Stats(0,0,1,0,0,0), 255,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Es wehrt gegnerische Angriffe mit seinem in Eis gehüllten Körper ab. Bruchstellen bessert es mit aus kalter Luft gewonnenem neuen Eis aus."),
                List.of(new EvolutionEntry("avalugg vesitan", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"37")))),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.BLIZZARD,43),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.CURSE,22),
                        new MoveLearnSetEntry(Move.ICE_BALL,30),
                        new MoveLearnSetEntry(Move.ICY_WIND,10),
                        new MoveLearnSetEntry(Move.SHARPEN,20),
                        new MoveLearnSetEntry(Move.AVALANCHE,39),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,49),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,5),
                        new MoveLearnSetEntry(Move.MUDSLAP,13),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,15),
                        new MoveLearnSetEntry(Move.RECOVER,47),
                        new MoveLearnSetEntry(Move.ICE_FANG,26),
                        new MoveLearnSetEntry(Move.BULLDOZE,27),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,35),
                        new MoveLearnSetEntry(Move.BARRIER,"egg"),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,"egg"),
                        new MoveLearnSetEntry(Move.MIST,"egg"),
                        new MoveLearnSetEntry(Move.RECOVER,"egg")                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(12)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_COLD_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);

           setLangFileName("Bergmite");

    }


}
