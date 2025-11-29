package drai.dev.data.games.instagram.federex;


import drai.dev.data.pokemon.ivris.*;
import drai.dev.data.pokemon.ivris.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

public class Ivris extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Ivris();
    private Ivris() {
        super("ivris", "https://www.instagram.com/_trainer_rex/?hl=en");
    }

    @Override
    public void init(String resourcesDir) {
        super.init(resourcesDir);
        newPokemon.forEach(pokemon1 -> {
            pokemon1.getLabels().add(Label.INSTAGRAM);
        });
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new IvrisianSinistea("", Aspect.IVRISIAN));

        addNewPokemon(new Hezard().addLabels(Label.STARTER));
        addNewPokemon(new Vereaf().addLabels(Label.STARTER));
        addNewPokemon(new Varanion().addLabels(Label.STARTER));
        addNewPokemon(new Calburn().addLabels(Label.STARTER));
        addNewPokemon(new Caligni().addLabels(Label.STARTER));
        addNewPokemon(new Meluros().addLabels(Label.STARTER));
        addNewPokemon(new Amppo().addLabels(Label.STARTER));
        addNewPokemon(new Mudppo().addLabels(Label.STARTER));
        addNewPokemon(new Hipposh().addLabels(Label.STARTER));
        addNewPokemon(new Spinhog());
        addNewPokemon(new Galhog());
        addNewPokemon(new Gruchick());
        addNewPokemon(new Grusabbia());
        addNewPokemon(new Tembbluster());
        addNewPokemon(new Chippunki());
        addNewPokemon(new Eepog());
        addNewPokemon(new Streepog());
        addNewPokemon(new Classel());
        addNewPokemon(new Stogith());
        addNewPokemon(new Lizat());
        addNewPokemon(new Tatzelgon());
        addNewPokemon(new Cinish());
        addNewPokemon(new Vesushes());
        addNewPokemon(new Fluloo());
        addNewPokemon(new Dubflow());
        addNewPokemon(new Spander());
        addNewPokemon(new Kamhiragon());
        addNewPokemon(new Citini());
        addNewPokemon(new Citreen());
        addNewPokemon(new Citrabella());
        addNewPokemon(new Dhovy());
        addNewPokemon(new Dontiff());
        addNewPokemon(new Nuve());
        addNewPokemon(new Marbeast());
        addNewPokemon(new Marmera());
        addNewPokemon(new Marbellezza());
        addNewPokemon(new IvrisianRiolu("", Aspect.IVRISIAN));
        addNewPokemon(new Lucumbra());
        addNewPokemon(new IvrisianMagikarp("", Aspect.IVRISIAN).fishingSpawnFromExisting());
        addNewPokemon(new IvrisianGyarados("", Aspect.IVRISIAN).fishingSpawnFromExisting());
        addNewPokemon(new IvrisianSpritzee("", Aspect.IVRISIAN));
        addNewPokemon(new Demictor());
        addNewPokemon(new Scissect());
        addNewPokemon(new Drassors());
        addNewPokemon(new Keletta().fishingSpawnFromExisting());
        addNewPokemon(new Kelpelago());
        addNewPokemon(new Faumo());
        addNewPokemon(new Druidigo());
        addNewPokemon(new Bavis().fishingSpawnFromExisting());
        addNewPokemon(new Monsarella());
        addNewPokemon(new Cycliwasp());
        addNewPokemon(new Bachist()); //fossil
        addNewPokemon(new Braxanist());
        addNewPokemon(new Ciprowd());//fossil
        addNewPokemon(new Mastooth());//fossil
        addNewPokemon(new Ferosail());
        addNewPokemon(new Deepuanax());//fossil
        addNewPokemon(new Happizz());
        addNewPokemon(new Tortelizza());
        addNewPokemon(new Winetergeist());
        addNewPokemon(new Barbelli());
        addNewPokemon(new Lasarcean());
        addNewPokemon(new Lirvug());
        addNewPokemon(new Buire());
        addNewPokemon(new Flammurai());
        addNewPokemon(new Sparcink());
        addNewPokemon(new Oilittle());
        addNewPokemon(new Olince());
        addNewPokemon(new Phingon().fishingSpawnFromExisting());
        addNewPokemon(new Lyviasma().fishingSpawnFromExisting());
        addNewPokemon(new Lyviajira());
        addNewPokemon(new Poetiny());
        addNewPokemon(new Compoet());
        addNewPokemon(new Poeternal());
        addNewPokemon(new Prophesin());
        addNewPokemon(new Salamaial());
        addNewPokemon(new Prosciuthough());
        addNewPokemon(new Cubwood());
        addNewPokemon(new Silvursa());
        addNewPokemon(new IvrisianSmeargle("", Aspect.IVRISIAN));
        addNewPokemon(new Renaisspect());
        addNewPokemon(new Fridgegg());
        addNewPokemon(new Phrosant());
        addNewPokemon(new Froskatrice());
        addNewPokemon(new Balocket());
        addNewPokemon(new Giocchio());
        addNewPokemon(new Farocchio());
        addNewPokemon(new Spoonedge());
        addNewPokemon(new Doublery());
        addNewPokemon(new Pizzalash());
        addNewPokemon(new Fibichou());
        addNewPokemon(new Lanterror());
        addNewPokemon(new IvrisianMeowth("", Aspect.IVRISIAN));
        addNewPokemon(new IvrisianPerrserker("", Aspect.IVRISIAN));
        addNewPokemon(new IvrisianClauncher("", Aspect.IVRISIAN));
        addNewPokemon(new Clawkilno());
        addNewPokemon(new Rhyqualo().fishingSpawnFromExisting());
        addNewPokemon(new Rhylodon().fishingSpawnFromExisting());
        addNewPokemon(new Rhyptide());
        addNewPokemon(new Chariolin());
        addNewPokemon(new Pancery());
        addNewPokemon(new Harlecream());
        addNewPokemon(new IvrisianPikipek("", Aspect.IVRISIAN));
        addNewPokemon(new IvrisianTrumbeak("", Aspect.IVRISIAN));
        addNewPokemon(new Brawlbeak());
        addPokedexPokemon(
                "eevee," +
                        "vaporeon," +
                        "jolteon," +
                        "flareon," +
                        "espeon," +
                        "umbreon," +
                        "leafeon," +
                        "glaceon," +
                        "sylveon");
        addNewPokemon(new Belleon().addLabels(Label.EEVEELUTION));
        addNewPokemon(new Ferreon().addLabels(Label.EEVEELUTION));
        addPokedexPokemon("combee");
        addPokedexPokemon("vespiquen");
        addNewPokemon(new Gladavius());
        addPokedexPokemon("smoliv");
        addPokedexPokemon("dolliv");
        addPokedexPokemon("arboliva");
        addNewPokemon(new Wollivana());
        addPokedexPokemon("torkoal");
        addNewPokemon(new Torkuoco());
        addPokedexPokemon("kapsakid");
        addPokedexPokemon("scovillain");
        addNewPokemon(new DraNduja());
        addPokedexPokemon("dunsparce");
        addPokedexPokemon("dudunsparce");
        addNewPokemon(new Daudausparce());
        addPokedexPokemon("klawf");
        addNewPokemon(new Klawlosseus());
        addPokedexPokemon("clobbopus");
        addPokedexPokemon("grapploct");
        addNewPokemon(new Krattleoct());
        addPokedexPokemon("falinks");
        addNewPokemon(new Falegion());
        addPokedexPokemon("zangoose");
        addNewPokemon(new Zangrave());
        addPokedexPokemon("seviper");
        addNewPokemon(new Viperoyal());
        addNewPokemon(new Crokull());
        addNewPokemon(new Gluttogator());
        addNewPokemon(new Maschodile());
        addNewPokemon(new Pixsea().fishingSpawnFromExisting());
        addNewPokemon(new Equarea());
        addNewPokemon(new Hydrocampa());
        addNewPokemon(new Orchagon());
        addNewPokemon(new Chivapplir());
        addNewPokemon(new Ciderpent());
        addNewPokemon(new Strudlung());
        addNewPokemon(new Sapplamander());
        addNewPokemon(new Rosavern());
        addNewPokemon(new Crispae());
        addNewPokemon(new Corekatrisp());
        addNewPokemon(new Chipzalcoatl());
        addNewPokemon(new Moroller());
        addNewPokemon(new Strinmmer());
        addNewPokemon(new Nartana());

        addNewPokemon(new Wrrazal().addLabels(Label.FOSSIL)); //fossil
        addNewPokemon(new Specterzal().addLabels(Label.FOSSIL));
        addNewPokemon(new Drastell());
        addNewPokemon(new Soldarise());
        //Paradox
        addNewPokemon(new IronJaws().fishingSpawnFromExisting().addLabels(Label.PARADOX));
        addNewPokemon(new AbyssalHunger().fishingSpawnFromExisting().addLabels(Label.PARADOX));
        addNewPokemon(new IronFists().addLabels(Label.PARADOX));
        addNewPokemon(new FuriousPunches().addLabels(Label.PARADOX));
        addNewPokemon(new IronSail().addLabels(Label.PARADOX));
        addNewPokemon(new DustyFangs().addLabels(Label.PARADOX));
        addNewPokemon(new IronDinosaur().addLabels(Label.PARADOX));
        addNewPokemon(new ColossalLeaf().addLabels(Label.PARADOX));
        addNewPokemon(new IronSaber().addLabels(Label.PARADOX));
        addNewPokemon(new RoughBlades().addLabels(Label.PARADOX));
        addNewPokemon(new IronFrill().addLabels(Label.PARADOX));
        addNewPokemon(new VenomousCrest().addLabels(Label.PARADOX));
        addNewPokemon(new IronBones().addLabels(Label.PARADOX));
        addNewPokemon(new RagingSpikes().addLabels(Label.PARADOX));
        addNewPokemon(new IronIncinerator().addLabels(Label.PARADOX));
        addNewPokemon(new FlamingTongue().addLabels(Label.PARADOX));
        addNewPokemon(new IronPurifier().addLabels(Label.PARADOX));
        addNewPokemon(new SpikyMushroom().addLabels(Label.PARADOX));
        addNewPokemon(new IronPrankster().addLabels(Label.PARADOX));
        addNewPokemon(new DemonicChains().addLabels(Label.PARADOX));
        addNewPokemon(new IronDrone().addLabels(Label.PARADOX));
        addNewPokemon(new DeadlyPincers().addLabels(Label.PARADOX));
        addNewPokemon(new IronJet().addLabels(Label.PARADOX));
        addNewPokemon(new FerociousFins().addLabels(Label.PARADOX));
        addNewPokemon(new IronDragon().addLabels(Label.PARADOX));
    }

}
