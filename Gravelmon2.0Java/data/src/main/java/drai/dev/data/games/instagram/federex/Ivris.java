package drai.dev.data.games.instagram.federex;


import drai.dev.data.pokemon.ivris.*;
import drai.dev.gravelmon.pokemon.attributes.*;

public class Ivris extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Ivris();
    private Ivris() {
        super("ivris");
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
        addNewPokemon(new Hezard());
        addNewPokemon(new Vereaf());
        addNewPokemon(new Varanion());
        addNewPokemon(new Calburn());
        addNewPokemon(new Caligni());
        addNewPokemon(new Meluros());
        addNewPokemon(new Amppo());
        addNewPokemon(new Mudppo());
        addNewPokemon(new Hipposh());
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
        addPokedexPokemon("riolu-ivrisian");
        addNewPokemon(new Lucumbra());
        addPokedexPokemon("magikarp-ivrisian");
        addPokedexPokemon("gyarados-ivrisian");
        addPokedexPokemon("spritzee-ivrisian");
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
        addPokedexPokemon("smeargle-ivrisian");
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
        addPokedexPokemon("meowth-ivrisian");
        addPokedexPokemon("perrserker-ivrisian");
        addPokedexPokemon("clawncher-ivrisian");
        addNewPokemon(new Clawkilno());
        addNewPokemon(new Rhyqualo().fishingSpawnFromExisting());
        addNewPokemon(new Rhylodon().fishingSpawnFromExisting());
        addNewPokemon(new Rhyptide());
        addNewPokemon(new Chariolin());
        addNewPokemon(new Pancery());
        addNewPokemon(new Harlecream());
        addPokedexPokemon("pikipek-ivrisian");
        addPokedexPokemon("trumbeak-ivrisian");
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
        addNewPokemon(new Belleon());
        addNewPokemon(new Ferreon());
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
        addNewPokemon(new Drastell());
        addNewPokemon(new Soldarise());
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
        addNewPokemon(new Wrrazal()); //fossil
        addNewPokemon(new Specterzal());
        addNewPokemon(new IronJaws().fishingSpawnFromExisting());
        addNewPokemon(new AbyssalHunger().fishingSpawnFromExisting());
        addNewPokemon(new IronFists());
        addNewPokemon(new FuriousPunches());
        addNewPokemon(new IronSail());
        addNewPokemon(new DustyFangs());
        addNewPokemon(new IronDinosaur());
        addNewPokemon(new ColossalLeaf());
        addNewPokemon(new IronSaber());
        addNewPokemon(new RoughBlades());
        addNewPokemon(new IronFrill());
        addNewPokemon(new VenomousCrest());
        addNewPokemon(new IronBones());
        addNewPokemon(new RagingSpikes());
        addNewPokemon(new IronIncinerator());
        addNewPokemon(new FlamingTongue());
        addNewPokemon(new IronPurifier());
        addNewPokemon(new SpikyMushroom());
        addNewPokemon(new IronPrankster());
        addNewPokemon(new DemonicChains());
        addNewPokemon(new IronDrone());
        addNewPokemon(new DeadlyPincers());
        addNewPokemon(new IronJet());
        addNewPokemon(new FerociousFins());
        addNewPokemon(new IronDragon());
    }

}
