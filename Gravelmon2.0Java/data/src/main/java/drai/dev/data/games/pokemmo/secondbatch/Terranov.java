//package drai.dev.data.games.pokemmo.secondbatch;
//
//
//
//import drai.dev.data.pokemon.amavi.*;
//import drai.dev.data.pokemon.dhiome.*;
//import drai.dev.data.pokemon.mushi.*;
//import drai.dev.data.pokemon.theos.*;
//import drai.dev.data.pokemon.kuria.*;
//import drai.dev.data.pokemon.ottora.*;
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
//import drai.dev.data.pokemon.fliga.*;
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
//        pokemon.add(new Felyne());
//        pokemon.add(new Palico());
//        pokemon.add(new Canyne());
//        pokemon.add(new Palamute());
//        pokemon.add(new Spiribird());
//        pokemon.add(new Wiggler());
//        pokemon.add(new WigglerQueen(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Velocidrome(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Gendrome(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Iodrome(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Giadrome(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Izuchi());
//        pokemon.add(new GreatJaggi(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new GreatIzuchi());
//        pokemon.add(new Jagras());
//        pokemon.add(new GreatJagras());
//        pokemon.add(new Girros());
//        pokemon.add(new GreatGirros(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Dodogama(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Bulldrome(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Arzuros());
//        pokemon.add(new Lagombi(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new KuluYaKu());
//        pokemon.add(new Wailnard());
//        pokemon.add(new Qurupeco());
//        pokemon.add(new Melynx());
//        pokemon.add(new Konchu(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new YianKutKu());
//        pokemon.add(new YianGaruga());
//        pokemon.add(new VespoidQueen(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Ludroth());
//        pokemon.add(new RoyalLudroth());
//        pokemon.add(new Congalala(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new PukeiPukei());
//        pokemon.add(new Baggi());
//        pokemon.add(new GreatBaggi());
//        pokemon.add(new Giggi());
//        pokemon.add(new Gigginox());
//        pokemon.add(new Tetsupole());
//        pokemon.add(new Tetsucabra());
//        pokemon.add(new Aknosom(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Hypnocatrice(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Duffel(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Beotodus(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Hermitaur());
//        pokemon.add(new DaimyoHermitaur());
//        pokemon.add(new Ceanataur());
//        pokemon.add(new ShogunCeanataur());
//        pokemon.add(new GreatWroggi(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Barroth(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Malfestio(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Gobul(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Nibelsnarf(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Gajau(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Jyuratodus(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Paolumu());
//        pokemon.add(new Blango());
//        pokemon.add(new Blangonga(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Tetranadon(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Banbaro(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Khezu(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Nerscylla(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Zammie());
//        pokemon.add(new Zamite());
//        pokemon.add(new Zamtrios(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Bishaten(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Somnacanth(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Cephadrome(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Lavasioth(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Plesioth(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Seltas());
//        pokemon.add(new SeltasQueen(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new TobiKadachi(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Anjanath());
//        pokemon.add(new Odogaron(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Legiana());
//        pokemon.add(new Najarala(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Uragaan(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Nargacuga());
//        pokemon.add(new Rathian());
//        pokemon.add(new Rathalos());
//        pokemon.add(new Lagiacrus());
//        pokemon.add(new Popo(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Gammoth());
//        pokemon.add(new Astalos());
//        pokemon.add(new Mizutsune());
//        pokemon.add(new Glavenus());
//        pokemon.add(new Basarios());
//        pokemon.add(new Gravios());
//        pokemon.add(new Monoblos());
//        pokemon.add(new Diablos());
//        pokemon.add(new Barioth(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Zinogre());
//        pokemon.add(new Brachydios());
//        pokemon.add(new Duramboros());
//        pokemon.add(new Lunagaron());
//        pokemon.add(new Magnamalo());
//        pokemon.add(new Espinas(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Uroktor());
//        pokemon.add(new Agnaktor());
//        pokemon.add(new Tigrex());
//        pokemon.add(new GossHarag(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Rachnoid());
//        pokemon.add(new RaknaKadaki(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Seregios());
//        pokemon.add(new GoreMagala(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new ShagaruMagala(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Kirin());
//        pokemon.add(new Deviljho());
//        pokemon.add(new Bazelgeuse());
//        pokemon.add(new Rajang());
//        pokemon.add(new KushalaDaora(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Teostra());
//        pokemon.add(new Chameleos(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new LaoShanLung(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new ShenGaoren(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Nergigante());
//        pokemon.add(new VaalHazak());
//        pokemon.add(new Velkhana(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new JhenMohran(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new DahrenMohran(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new ZorahMagdaros());
//        pokemon.add(new Valstrax());
//        pokemon.add(new Malzeno(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Akantor(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Ukanlos(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new YamaTsukami(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Ceadeus(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Gogmazios(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Dalamadur(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new AhtalKa(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Ibushi());
//        pokemon.add(new Narwa(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Gaismagorm(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Xenojiiva(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Safijiiva(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Alatreon(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new DireMiralis(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//        pokemon.add(new Fatalis(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));
//    }
//
//}
