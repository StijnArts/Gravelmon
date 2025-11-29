package drai.dev.data.games.instagram.fra;


import drai.dev.data.pokemon.aldao.*;
import drai.dev.data.pokemon.aldao.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

//DONE
public class Aldao extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Aldao();
    private Aldao() {
        super("aldao", "https://www.instagram.com/_fra.2.0/?hl=en");
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
        addNewPokemon(new Pupfleur().addLabels(Label.STARTER));
        addNewPokemon(new Corfleur().addLabels(Label.STARTER));
        addNewPokemon(new Wolfleur().addLabels(Label.STARTER));
        addNewPokemon(new Cubby().addLabels(Label.STARTER));
        addNewPokemon(new Tigember().addLabels(Label.STARTER));
        addNewPokemon(new Tigerage().addLabels(Label.STARTER));
        addNewPokemon(new Nymbble().fishingSpawnFromExisting().addLabels(Label.STARTER));
        addNewPokemon(new Nymbubble().addLabels(Label.STARTER));
        addNewPokemon(new Dracodont().addLabels(Label.STARTER));

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
        addNewPokemon(new Spitohood());
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
        addNewPokemon(new Bahcrag()); //renamed from rockid
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
        addNewPokemon(new Branceros().addLabels(Label.FOSSIL)); //fossil
        addNewPokemon(new Trenceros().addLabels(Label.FOSSIL));
        addNewPokemon(new Icephan().addLabels(Label.FOSSIL)); //fossil
        addNewPokemon(new Mastogleys().addLabels(Label.FOSSIL));
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
        addNewPokemon(new Chicomet().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Asterave().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Astradarna().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Lakankilat().addLabels(Label.LEGENDARY));
        addNewPokemon(new Lakandagat().fishingSpawnFromExisting().addLabels(Label.LEGENDARY));
        addNewPokemon(new Lakanlinog().addLabels(Label.LEGENDARY));
    }

}
