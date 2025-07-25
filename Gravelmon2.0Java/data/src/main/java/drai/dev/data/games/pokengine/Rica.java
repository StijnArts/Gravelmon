package drai.dev.data.games.pokengine;


import drai.dev.data.pokemon.atlas.Arsinge;
import drai.dev.data.pokemon.atlas.Bunfin;
import drai.dev.data.pokemon.atlas.Pichip;
import drai.dev.data.pokemon.atlas.Rupsen;
import drai.dev.data.pokemon.atlas.Shifuu;
import drai.dev.data.pokemon.rica.*;
import drai.dev.data.pokemon.rica.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

//done
public class Rica extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Rica();
    private Rica() {
        super("Rica");
    }
    //tODO get missing art from https://www.deviantart.com/fuzzball288
    @Override
    public void registerPokemon() {
        addNewPokemon(new Cotylit().addLabels(Label.STARTER));
        addNewPokemon(new Cotyleaf().addLabels(Label.STARTER));
        addNewPokemon(new Nymphlora().addLabels(Label.STARTER));
        addNewPokemon(new Bunfin().addLabels(Label.STARTER));
        addNewPokemon(new Arsinge().addLabels(Label.STARTER));
        addNewPokemon(new Rupsen().addLabels(Label.STARTER));
        addNewPokemon(new Mirmoor().fishingSpawnFromExisting().addLabels(Label.STARTER));
        addNewPokemon(new Sloowin().addLabels(Label.STARTER));
        addNewPokemon(new Atrocean().addLabels(Label.STARTER));
        addNewPokemon(new Skurrel());
        addNewPokemon(new Sparskia());
        addNewPokemon(new Sparruff());
        addNewPokemon(new Wingale());
        addNewPokemon(new Yuvirro());
        addNewPokemon(new Archick());
        addNewPokemon(new Terundra());
        addNewPokemon(new Pupsea());
        addNewPokemon(new Blubbark());
        addNewPokemon(new Sealord());
        addNewPokemon(new Merjestic());
        addNewPokemon(new Cyton());
        addNewPokemon(new Kaidon());
        addNewPokemon(new Skunfume());
        addNewPokemon(new Perfessence());
        addNewPokemon(new Tinion());
        addNewPokemon(new Akoni());
        addNewPokemon(new Leekadon());
        addNewPokemon(new Larmidge());
        addNewPokemon(new Dormidge());
        addNewPokemon(new Chirmidge());
        addNewPokemon(new Ostrodd().fishingSpawnFromExisting());
        addNewPokemon(new Orbizarre());
        addNewPokemon(new Tadport());
        addNewPokemon(new Psionewt());
        addNewPokemon(new Desmodon());
        addNewPokemon(new Leaflit());
        addNewPokemon(new Fauxiage());
        addNewPokemon(new Fluffaux());
        addNewPokemon(new Lepillusion());
        addNewPokemon(new Tapirunt());
        addNewPokemon(new Voltapir());
        addNewPokemon(new Odonymph());
        addNewPokemon(new Nymbide());
        addNewPokemon(new Dranax());
        addNewPokemon(new Skulmet());
        addNewPokemon(new Femurk());
        addNewPokemon(new Foromen());
        addNewPokemon(new Chirpunch());
        addNewPokemon(new Taekowl());
        addNewPokemon(new Minilith());
        addNewPokemon(new Bolstone());
        addNewPokemon(new Terrouldite());
        addNewPokemon(new Cosmite());
        addNewPokemon(new Shiverel());
        addNewPokemon(new Stoatzen());
        addNewPokemon(new Trinctite());
        addNewPokemon(new Crystallier());
        addNewPokemon(new Garrachnid());
        addNewPokemon(new Anau());
        addNewPokemon(new Sunole());
        addNewPokemon(new Baskilisk());
        addNewPokemon(new Solana());
        addNewPokemon(new Tusslett());
        addNewPokemon(new Rufooster());
        addNewPokemon(new Odorable());
        addNewPokemon(new Rabite());
        addNewPokemon(new Bubbweed().fishingSpawnFromExisting());
        addNewPokemon(new Drifsea());
        addNewPokemon(new Starphin().fishingSpawnFromExisting());
        addNewPokemon(new Lunorca().fishingSpawnFromExisting());
        addNewPokemon(new Gupplash().fishingSpawnFromExisting());
        addNewPokemon(new Arowish().fishingSpawnFromExisting());
        addNewPokemon(new Tarspook());
        addNewPokemon(new Spookaye());

        addNewPokemon(new Fleetle());
        addNewPokemon(new Vorasect());
        addNewPokemon(new Crabot());
        addNewPokemon(new Craborg());
        addNewPokemon(new Mambolt());
        addNewPokemon(new Anaconduct());
        addNewPokemon(new Colobud());
        addNewPokemon(new Makakari());
        addNewPokemon(new Embear());
        addNewPokemon(new Bearserk());
        addNewPokemon(new Fumabor());
        addNewPokemon(new Crocoil().fishingSpawnFromExisting());
        addNewPokemon(new Platypoint());
        addNewPokemon(new Platoxic());
        addNewPokemon(new Siamouth().fishingSpawnFromExisting());
        addNewPokemon(new Toxito());
        addNewPokemon(new Leaflow());
        addNewPokemon(new Plecobble());
        addNewPokemon(new Granikan());
        addNewPokemon(new Spinox());
        addNewPokemon(new Impuck());
        addNewPokemon(new Impifaun());
        addNewPokemon(new Leptric().fishingSpawnFromExisting());
        addNewPokemon(new Energeel().fishingSpawnFromExisting());
        addNewPokemon(new Mermew());
        addNewPokemon(new Clampurr());
        addNewPokemon(new Welking());
        addNewPokemon(new Amourish());
        addNewPokemon(new Glamoreef());
        addNewPokemon(new RicanShellos("", Aspect.RICAN));
        addNewPokemon(new RicanGastrodon("", Aspect.RICAN));
        addNewPokemon(new Sweetoad());
        addNewPokemon(new Spoocap());
        addNewPokemon(new Sporror());
        addNewPokemon(new Bloogoo());
        addNewPokemon(new Lazyrd());
        addNewPokemon(new Ampeck());
        addNewPokemon(new Boombird());
        addNewPokemon(new Amara());
        addNewPokemon(new Torkit());
        addNewPokemon(new Scimitear());
//        addNewPokemon(new Seroseed());//Missing Art
//        addNewPokemon(new Conipine());//Missing Art
        addNewPokemon(new Ailember());
        addNewPokemon(new Genetorch());
        addNewPokemon(new Wasplode());
        addNewPokemon(new Pichip());
        addNewPokemon(new Shifuu());
        addNewPokemon(new Delibo());
        addNewPokemon(new Helibo());
        addNewPokemon(new Drocopter());
        addNewPokemon(new Slitharjo());
        addNewPokemon(new Coliber());
        addNewPokemon(new Coliboom());
//        addNewPokemon(new Dracoma()); //Missing Art
//        addNewPokemon(new Atmotail()); //Missing Art
//        addNewPokemon(new Predapex()); //Missing Art
//        addNewPokemon(new Bactiny());//Member of Line not Finished
//        addNewPokemon(new Liquphage());//Member of Line not Finished
//        addNewPokemon(new Calcichor()); //Missing Art
        addNewPokemon(new Barnub());
        addNewPokemon(new Detritan());
        addNewPokemon(new Moreel());
        addNewPokemon(new Darscale());
//        addNewPokemon(new tubeworm()); //Missing Art
//        addNewPokemon(new Toratoll().fishingSpawnFromExisting()); //Member of Line not Finished
//        addNewPokemon(new Arcain()); //Missing Art
        addNewPokemon(new Fridgid().fishingSpawnFromExisting());
        addNewPokemon(new Cirritwirl());
        addNewPokemon(new Torricane());
        addNewPokemon(new Pixiflake());
        addNewPokemon(new Wyvet());
        addNewPokemon(new Draybow());
        addNewPokemon(new Delphair());
        addNewPokemon(new Aerocea());
        addNewPokemon(new Tardidure());
        addNewPokemon(new Etornal());
//        addNewPokemon(new Hyaenom()); //Member of Line not Finished
//        addNewPokemon(new Ravidont()); //Missing Art
//        addNewPokemon(new Sarcrush()); //Member of Line not Finished
//        addNewPokemon(new Inami()); //Missing Art
//        addNewPokemon(new Rainu()); //Missing Art

//        addNewPokemon(new Tsuchinu()); //Missing Art
//        addNewPokemon(new Darabble().addLabels(Label.PSEUDO_LEGENDARY)); TODO
//        addNewPokemon(new Rovorage().addLabels(Label.PSEUDO_LEGENDARY));
//        addNewPokemon(new Helluster().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Tunnelid().addLabels(Label.SUB_LEGENDARY));
//        addNewPokemon(new Yamiju().addLabels(Label.SUB_LEGENDARY)); //Missing Art
//        addNewPokemon(new Taranturem().addLabels(Label.SUB_LEGENDARY)); //Missing Art
        addNewPokemon(new Solios().addLabels(Label.MYTHICAL));

    }

}
