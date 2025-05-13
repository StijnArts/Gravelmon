package drai.dev.data.games.instagram.fra;


import drai.dev.data.pokemon.aldao.*;
import drai.dev.data.pokemon.aldao.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;
public class Aldao extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Aldao();
    private Aldao() {
        super("aldao");
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
        addNewPokemon(new Pupfleur());
        addNewPokemon(new Corfleur());
        addNewPokemon(new Wolfleur());
        addNewPokemon(new Cubby());
        addNewPokemon(new Tigember());
        addNewPokemon(new Tigerage());
        addNewPokemon(new Nymbble().fishingSpawnFromExisting());
        addNewPokemon(new Nymbubble());
        addNewPokemon(new Dracodont());

        addNewPokemon(new Lilbil());
        addNewPokemon(new Megabil());
        addNewPokemon(new Gigabil());
        addNewPokemon(new Cinnaby());
        addNewPokemon(new Cinnaron());
        addNewPokemon(new Sewerunt());
        addNewPokemon(new Seweratt());
        addNewPokemon(new Dewtweet());
        addNewPokemon(new Saillard());
        addNewPokemon(new Aviatross());
        addNewPokemon(new Cormarine());
        addNewPokemon(new Gecroak());
        addNewPokemon(new Echogecko());
        addNewPokemon(new Chiwaw());
        addNewPokemon(new Foxairy());
        addNewPokemon(new Woltaic());
        addNewPokemon(new Furhound());
        addNewPokemon(new Intewoof());
        addNewPokemon(new Mangeyote());
        addNewPokemon(new Botachi());
        addNewPokemon(new Turbotachi());
        addNewPokemon(new Edgehog());
        addNewPokemon(new Porcipice());
        addNewPokemon(new Slugmud());
        addNewPokemon(new Mudsnail());
        addNewPokemon(new Pitohood());
        addNewPokemon(new Plaguwing());
        addNewPokemon(new Zenpole().fishingSpawnFromExisting()); //Renamed from psypole
        addNewPokemon(new Amphisage());
        addNewPokemon(new Dustear());
        addNewPokemon(new Bunnectric());
        addNewPokemon(new Pigchop());
        addNewPokemon(new Barbacon());
        addNewPokemon(new Conpine());
        addNewPokemon(new Pinegreen());
        addNewPokemon(new Frozymp());
        addNewPokemon(new Gifrost());
        addNewPokemon(new Cracklin());
        addNewPokemon(new Dracotecnic());
        addNewPokemon(new Frosling());
        addNewPokemon(new Angelaze());
        addNewPokemon(new Cafheft());
        addNewPokemon(new Buffaheft());
        addNewPokemon(new Howlamb());
        addNewPokemon(new Howolver());
        addNewPokemon(new Kakapalm());
        addNewPokemon(new Kapalma());
        addNewPokemon(new Kamiranda());
        addNewPokemon(new Groubble());
        addNewPokemon(new Groublin());
        addNewPokemon(new Granmine());
        addNewPokemon(new Shadowl());
        addNewPokemon(new Shamandor());
        addNewPokemon(new Shaodrake());
        addNewPokemon(new Rockid()); //renamed from rockid
        addNewPokemon(new Craggoat());
        addNewPokemon(new Goattain());
        addNewPokemon(new Shockitty());
        addNewPokemon(new Sprinther());
        addNewPokemon(new Nyalectic());
        addNewPokemon(new Chuchilla());
        addNewPokemon(new Sharpisc().fishingSpawnFromExisting());
        addNewPokemon(new Sharkerel().fishingSpawnFromExisting());
        addNewPokemon(new Sworlin());
        addNewPokemon(new Moorlock().fishingSpawnFromExisting());
        addNewPokemon(new Morlocking());
        addNewPokemon(new Merminni().fishingSpawnFromExisting());
        addNewPokemon(new Mariquinn());
        addNewPokemon(new Fairlion());
        addNewPokemon(new Skylion());
        addNewPokemon(new Hochiki());
        addNewPokemon(new Gorriotto());
        addNewPokemon(new Chawrecks()); //fossils
        addNewPokemon(new Radiwrecks());
        addNewPokemon(new Pternair()); //fossils
        addNewPokemon(new Pteragon());
        addNewPokemon(new Titanoth());
        addNewPokemon(new Digasdon());
        addNewPokemon(new Inkuid());
        addNewPokemon(new Gunkuid());
        addNewPokemon(new Snapcrock());
        addNewPokemon(new Snapdragg());
        addNewPokemon(new Chileed());
        addNewPokemon(new Chiligon());
        addNewPokemon(new Snowchic());
        addNewPokemon(new Snowroc());
        addNewPokemon(new Bowfish().fishingSpawnFromExisting());
        addNewPokemon(new Arrowanna());
        addNewPokemon(new Bascannon());
        addNewPokemon(new Panpot());
        addNewPokemon(new Gourmetal());
        addNewPokemon(new Bearboo());
        addNewPokemon(new Techlyte());
        addNewPokemon(new Technaut());
        addNewPokemon(new Coratle().fishingSpawnFromExisting());
        addNewPokemon(new Sedimarine());
        addNewPokemon(new Sheltle().fishingSpawnFromExisting());
        addNewPokemon(new Shelmount());
        addNewPokemon(new Chinder());
        addNewPokemon(new Blazilisk());
        addNewPokemon(new Vambat());
        addNewPokemon(new Vamperor());
        addNewPokemon(new Pricktus());
        addNewPokemon(new Spiklops());
        addNewPokemon(new Bes());
        addNewPokemon(new Ashaha());
        addNewPokemon(new Sawantina());
        addNewPokemon(new Gorgopy());
        addNewPokemon(new Chimeroar());
        addNewPokemon(new Manticrown());
        addNewPokemon(new Glowbug());
        addNewPokemon(new Glitterbulb());
        addNewPokemon(new Branceros()); //fossil
        addNewPokemon(new Trenceros());
        addNewPokemon(new Icephan()); //fossil
        addNewPokemon(new Mastogleys());
        addNewPokemon(new Scub());
        addNewPokemon(new Pangoleo());
        addNewPokemon(new Lacry());
        addNewPokemon(new Lacrymorsa());
        addNewPokemon(new Greedyme());
        addNewPokemon(new Avareich());
        addNewPokemon(new Kabaracco());
        addNewPokemon(new Centorby());
        addNewPokemon(new Bugleef());
        addNewPokemon(new Insleef());
        addNewPokemon(new Arnistix());
        addNewPokemon(new Chicomet());
        addNewPokemon(new Asterave());
        addNewPokemon(new Astradarna());
        addNewPokemon(new Lakankilat());
        addNewPokemon(new Lakandagat().fishingSpawnFromExisting());
        addNewPokemon(new Lakanlinog());
    }

}
