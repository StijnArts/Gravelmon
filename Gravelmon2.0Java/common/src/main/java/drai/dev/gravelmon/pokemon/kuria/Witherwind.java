package drai.dev.gravelmon.pokemon.kuria;

public class Witherwind extends drai.dev.gravelmon.pokemon.Pokemon {
    public Witherwind() {
        super("Witherwind",
                Type.BUG,Type.PSYCHIC,
                new Stats(78,
                        65,
                        65,
                        99,
                        108,
                        83),
                List.of(Ability.LEVITATE), Ability.MERCILESS,
                11, 152,
                new Stats(0,0,0,0,2,0), 45,
                0.5,
                158, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Witherwind are seen as bad omens to people and Pokémon. They are incredibly immune to disease, they use their psychic ability to neutralize viruses and then telepathically pass them on to fester in other organisms as a survival mechanic. Witherwind has the power to consume anything in its white belly, which is deeper than an Ultra Wormhole."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Witherwind");

    }


}
