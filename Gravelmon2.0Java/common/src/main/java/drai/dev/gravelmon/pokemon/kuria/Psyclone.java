package drai.dev.gravelmon.pokemon.kuria;

public class Psyclone extends drai.dev.gravelmon.pokemon.Pokemon {
    public Psyclone() {
        super("Psyclone",
                Type.FLYING,Type.PSYCHIC,
                new Stats(75,
                        50,
                        60,
                        124,
                        89,
                        90),
                List.of(Ability.KEEN_EYE,Ability.FOREWARN), Ability.ALLSEEING,
                19, 404,
                new Stats(0,0,0,3,0,0), 45,
                0.875,
                216, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Psyclone are seen throughout the sky, watching over the world and learning from everything they see. Their loss of feet through evolution forces them to refine their wings and mind."),
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
           setLangFileName("Psyclone");

    }


}
