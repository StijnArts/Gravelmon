//package drai.dev.data.games.pokemmo.secondbatch;
//
//
//
//import drai.dev.data.pokemon.amavi.*;
//import drai.dev.data.pokemon.dhiome.*;
//import drai.dev.data.pokemon.mushi.*;
//import drai.dev.data.pokemon.theos.*;
//import drai.dev.data.pokemon.kuria.*;
//import drai.dev.data.pokemon.beginnings.*;
//import drai.dev.data.pokemon.mastenia.*;
//import drai.dev.data.pokemon.mongratis.*;
//import drai.dev.data.pokemon.ultraspace.*;
//import drai.dev.data.pokemon.urzavos.*;
//import drai.dev.data.pokemon.terranov.*;
//import drai.dev.data.pokemon.enjin.*;
//import drai.dev.data.pokemon.mystis.*;
//import drai.dev.data.pokemon.pastelisland.*;
//import drai.dev.data.pokemon.neonintendo.*;
//import drai.dev.data.pokemon.tokas.*;
//import drai.dev.data.pokemon.panjaea.*;
//import drai.dev.data.pokemon.cyare.*;
//import drai.dev.data.pokemon.olysos.*;
//import drai.dev.data.pokemon.nodorro.*;
//import drai.dev.data.pokemon.orbis.*;
//import drai.dev.data.pokemon.avalos.*;
//import drai.dev.data.pokemon.ruskow.*;
//import drai.dev.data.pokemon.otopo.*;
//import drai.dev.data.pokemon.goetia.*;
//import drai.dev.data.pokemon.ionos.*;
//import drai.dev.data.pokemon.lagoone.*;
//import drai.dev.data.pokemon.atlas.*;
//import drai.dev.data.pokemon.avoris.*;
//import drai.dev.data.pokemon.enriko.*;
//import drai.dev.data.pokemon.ferroa.*;
//import drai.dev.data.pokemon.hiza.*;
//import drai.dev.data.pokemon.hub.*;
//import drai.dev.data.pokemon.interregional.*;
//import drai.dev.data.pokemon.isiah.*;
//import drai.dev.data.pokemon.junnin.*;
//import drai.dev.data.pokemon.lonava.*;
//import drai.dev.data.pokemon.mythire.*;
//import drai.dev.data.pokemon.nosto.*;
//import drai.dev.data.pokemon.novrai.*;
//import drai.dev.data.pokemon.oceane.*;
//import drai.dev.data.pokemon.okeno.*;
//import drai.dev.data.pokemon.orohnhavai.*;
//import drai.dev.data.pokemon.qamor.*;
//import drai.dev.data.pokemon.rica.*;
//import drai.dev.data.pokemon.varitas.*;
//import drai.dev.data.pokemon.aristos.*;
//import drai.dev.data.pokemon.midamis.*;
//import drai.dev.data.pokemon.norheim.*;
//import drai.dev.data.pokemon.crozoic.*;
//import drai.dev.data.attributes.*;
//import drai.dev.data.pokemon.africanus.*;
//import drai.dev.data.pokemon.africanus.regional.*;
//import drai.dev.data.pokemon.ayrei.*;
//import drai.dev.data.pokemon.ayrei.regional.*;
//import drai.dev.gravelmon.pokemon.attributes.*;
//import drai.dev.data.pokemon.chaosinvestia.regional.*;
//import drai.dev.data.pokemon.soulstones.*;
//import drai.dev.data.pokemon.soulstones.regional.*;
//
//import java.util.*;
//
//public class Terranov extends drai.dev.data.games.registry.Game {
//    public Terranov() {
//        super("Terranov");
//    }
//
//    @Override
//    public void registerPokemon() {
//        addNewPokemon(new Felyne());
//        addNewPokemon(new Palico());
//        addNewPokemon(new Canyne());
//        addNewPokemon(new Palamute());
//        addNewPokemon(new Spiribird());
//        addNewPokemon(new Wiggler());
//        addNewPokemon(new WigglerQueen(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Velocidrome(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Gendrome(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Iodrome(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Giadrome(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Izuchi());
//        addNewPokemon(new GreatJaggi(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new GreatIzuchi());
//        addNewPokemon(new Jagras());
//        addNewPokemon(new GreatJagras());
//        addNewPokemon(new Girros());
//        addNewPokemon(new GreatGirros(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Dodogama(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Bulldrome(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Arzuros());
//        addNewPokemon(new Lagombi(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new KuluYaKu());
//        addNewPokemon(new Wailnard());
//        addNewPokemon(new Qurupeco());
//        addNewPokemon(new Melynx());
//        addNewPokemon(new Konchu(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new YianKutKu());
//        addNewPokemon(new YianGaruga());
//        addNewPokemon(new VespoidQueen(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Ludroth());
//        addNewPokemon(new RoyalLudroth());
//        addNewPokemon(new Congalala(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new PukeiPukei());
//        addNewPokemon(new Baggi());
//        addNewPokemon(new GreatBaggi());
//        addNewPokemon(new Giggi());
//        addNewPokemon(new Gigginox());
//        addNewPokemon(new Tetsupole());
//        addNewPokemon(new Tetsucabra());
//        addNewPokemon(new Aknosom(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Hypnocatrice(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Duffel(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Beotodus(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Hermitaur());
//        addNewPokemon(new DaimyoHermitaur());
//        addNewPokemon(new Ceanataur());
//        addNewPokemon(new ShogunCeanataur());
//        addNewPokemon(new GreatWroggi(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Barroth(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Malfestio(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Gobul(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Nibelsnarf(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Gajau(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Jyuratodus(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Paolumu());
//        addNewPokemon(new Blango());
//        addNewPokemon(new Blangonga(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Tetranadon(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Banbaro(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Khezu(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Nerscylla(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Zammie());
//        addNewPokemon(new Zamite());
//        addNewPokemon(new Zamtrios(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Bishaten(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Somnacanth(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Cephadrome(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Lavasioth(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Plesioth(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Seltas());
//        addNewPokemon(new SeltasQueen(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new TobiKadachi(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Anjanath());
//        addNewPokemon(new Odogaron(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Legiana());
//        addNewPokemon(new Najarala(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Uragaan(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Nargacuga());
//        addNewPokemon(new Rathian());
//        addNewPokemon(new Rathalos());
//        addNewPokemon(new Lagiacrus());
//        addNewPokemon(new Popo(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Gammoth());
//        addNewPokemon(new Astalos());
//        addNewPokemon(new Mizutsune());
//        addNewPokemon(new Glavenus());
//        addNewPokemon(new Basarios());
//        addNewPokemon(new Gravios());
//        addNewPokemon(new Monoblos());
//        addNewPokemon(new Diablos());
//        addNewPokemon(new Barioth(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Zinogre());
//        addNewPokemon(new Brachydios());
//        addNewPokemon(new Duramboros());
//        addNewPokemon(new Lunagaron());
//        addNewPokemon(new Magnamalo());
//        addNewPokemon(new Espinas(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Uroktor());
//        addNewPokemon(new Agnaktor());
//        addNewPokemon(new Tigrex());
//        addNewPokemon(new GossHarag(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Rachnoid());
//        addNewPokemon(new RaknaKadaki(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Seregios());
//        addNewPokemon(new GoreMagala(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new ShagaruMagala(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Kirin());
//        addNewPokemon(new Deviljho());
//        addNewPokemon(new Bazelgeuse());
//        addNewPokemon(new Rajang());
//        addNewPokemon(new KushalaDaora(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Teostra());
//        addNewPokemon(new Chameleos(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new LaoShanLung(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new ShenGaoren(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Nergigante());
//        addNewPokemon(new VaalHazak());
//        addNewPokemon(new Velkhana(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new JhenMohran(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new DahrenMohran(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new ZorahMagdaros());
//        addNewPokemon(new Valstrax());
//        addNewPokemon(new Malzeno(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Akantor(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Ukanlos(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new YamaTsukami(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Ceadeus(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Gogmazios(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Dalamadur(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new AhtalKa(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Ibushi());
//        addNewPokemon(new Narwa(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Gaismagorm(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Xenojiiva(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Safijiiva(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Alatreon(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new DireMiralis(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        addNewPokemon(new Fatalis(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//    }
//
//}
