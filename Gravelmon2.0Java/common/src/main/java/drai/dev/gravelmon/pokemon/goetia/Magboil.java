package drai.dev.gravelmon.pokemon.goetia;

public class Magboil extends drai.dev.gravelmon.pokemon.Pokemon {
    public Magboil() {
        super("Magboil",
                Type.PSYCHIC,Type.BUG,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Looking into its eye-like organs as they pulsate causes its thoughts to be transmitted telepathically. However, its mind is so alien that whatever it communicates ranges from cryptic to incomprehensible. It makes consistent reference to “headfriends”, presumed to be the mysterious larvae-like beings visible inside its sacs."),
                List.of(),
                List.of(                        ),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Magboil");

    }


}
