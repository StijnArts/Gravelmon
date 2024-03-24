package drai.dev.gravelmon.pokemon.urzavos;

public class Hilaribat extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hilaribat() {
        super("Hilaribat",
                Type.DARK,Type.FLYING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                4, 59,
                new Stats(0,0,0,0,0,0), 130,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.AMORPHOUS),
                List.of("They love to fly around during any large gathering-- Be it carnivals, festivals or parties-- And make people laugh or smile. You can always hear them coming by the soft jingling of their bells."),
                List.of(),
                List.of(                        ),
                List.of(Label.URZAVOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hilaribat");

    }


}
