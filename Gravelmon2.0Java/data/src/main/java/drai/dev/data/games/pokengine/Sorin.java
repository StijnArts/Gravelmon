package drai.dev.data.games.pokengine;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.srin.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Sorin extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Sorin();
    private Sorin() {
        super("Sorin", "https://pokengine.org/search?query=mons+region:03yqa2hk");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Grascal().addLabels(Label.STARTER));
        addNewPokemon(new Astoundent().addLabels(Label.STARTER));
        addNewPokemon(new Cragweise().addLabels(Label.STARTER));
        addNewPokemon(new Amartiste(new Stats(532, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))).addLabels(Label.STARTER));
        addNewPokemon(new Ochrab().addLabels(Label.STARTER));
        addNewPokemon(new Kraboxa().addLabels(Label.STARTER));
        addNewPokemon(new Krushteichen().addLabels(Label.STARTER));
        addNewPokemon(new Curstocean(new Stats(534, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Burrblu());
        addNewPokemon(new Soulfowl());   
        addNewPokemon(new Heronrei(new Stats(525, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Tengutsy(new Stats(525, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));

        addNewPokemon(new Mousu());   
        addNewPokemon(new Mousei(new Stats(435, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Childi());
        addNewPokemon(new Shimshrike(new Stats(456, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Dimshima(new Stats(456, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Chabug());
        addNewPokemon(new Chasmor());   
        addNewPokemon(new Bataphyre(new Stats(467, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Ichu());   
        addNewPokemon(new Ikachu());   
        addNewPokemon(new Kuraichu(new Stats(510, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Bakenya());
        addNewPokemon(new Nyanyarn());   
        addNewPokemon(new Aftamoth(new Stats(455, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Tinsugi(new Stats(411, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Dubdol(new Stats(411, StatArchetype.FAST_SUPPORT,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Lotten(new Stats(435, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPEED))));
        addNewPokemon(new Shamikiri(new Stats(435, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.ATTACK))).fishingSpawnFromExisting());
        addNewPokemon(new Unjibee());   
        addNewPokemon(new Tujibees());   
        addNewPokemon(new Furikuinn(new Stats(467, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Kittim());
        addNewPokemon(new Kitmoone(new Stats(489, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Ozonzu(new Stats(478, StatArchetype.FAST_PHYSICAL_WALL,
                List.of(StatType.HP))));
        addNewPokemon(new Kabbema());
        addNewPokemon(new Kabrookie());
        addNewPokemon(new Busheedo());
        addNewPokemon(new Airadaga());
        addNewPokemon(new Orecadia());
        addNewPokemon(new Shimpole());
        addNewPokemon(new Froggem());
        addNewPokemon(new Toady(new Stats(516, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Coroseed());
        addNewPokemon(new Artifleur(new Stats(456, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Stunzeed(new Stats(411, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPEED))));
        addNewPokemon(new Chitaki());   
        addNewPokemon(new Chitossan(new Stats(435, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Geckayo());
        addNewPokemon(new Suiboo());
        addNewPokemon(new Suidra(new Stats(469, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Dangsemble());
        addNewPokemon(new Gullpy());
        addNewPokemon(new Fauxget(new Stats(445, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Driftzee(new Stats(410, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPEED))).fishingSpawnFromExisting());
        addNewPokemon(new Reefreith(new Stats(410, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Shriyago());
        addNewPokemon(new Bulkyago());
        addNewPokemon(new Gryago(new Stats(545, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE, StatType.ATTACK))));
        addNewPokemon(new Smackarel().fishingSpawnFromExisting());
        addNewPokemon(new Tontuna(new Stats(467, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.HP))).fishingSpawnFromExisting());
        addNewPokemon(new Monkiyo());   
        addNewPokemon(new Macaukong(new Stats(487, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Suzzbug());   
        addNewPokemon(new Bambuzzle(new Stats(444, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPEED))));
        addNewPokemon(new Batzu(new Stats(432, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Turnabe());
        addNewPokemon(new Trtoise(new Stats(498, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Guuby());
        addNewPokemon(new Cepiina(new Stats(476, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Serpentern(new Stats(454, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Molton(new Stats(454, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Artishock(new Stats(433, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Dorofae(new Stats(433, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Liquiduck());
        addNewPokemon(new Ahirogue(new Stats(478, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Psykindle());
        addNewPokemon(new Toriiment(new Stats(478, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Nurwara(new Stats(455, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK, StatType.HP))));
        addNewPokemon(new Axolaki(new Stats(455, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE, StatType.HP))));
        addNewPokemon(new Wyverth(new Stats(455, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE, StatType.HP))));
        addNewPokemon(new Barknuckle());   
        addNewPokemon(new Onwel(new Stats(476, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Gnasher());   
        addNewPokemon(new Abysshark(new Stats(489, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Charmeira(new Stats(489, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Verpod());
        addNewPokemon(new Koolisopod(new Stats(489, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Pekinawa());
        addNewPokemon(new Tomburd());
        addNewPokemon(new Storkscrew(new Stats(522, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Ancestork(new Stats(522, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Tarpir());   
        addNewPokemon(new Morowreck(new Stats(490, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Yograde());
        addNewPokemon(new Scubeetle(new Stats(526, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Dollicuri(new Stats(526, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Omuhelm(new Stats(526, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Hydrinju(new Stats(476, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Cholarva().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Chorise().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Chchitin(new Stats(600, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.DEFENCE, StatType.DEFENCE, StatType.ATTACK))).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Tanukey(new Stats(435, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Dokaching(new Stats(508, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Oribil(new Stats(508, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Curosubil());
        addNewPokemon(new Otanesu(new Stats(508, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Dragangle(new Stats(588, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Kormini());
        addNewPokemon(new Krima(new Stats(548, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Uruboatu(new Stats(588, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Umiyomi());
        addNewPokemon(new Snorin().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Soarinne().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Sovereen(new Stats(600, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE, StatType.SPECIAL_DEFENCE, StatType.ATTACK))).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Bkon().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Barun().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Rydreki(new Stats(600, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK, StatType.SPECIAL_DEFENCE, StatType.ATTACK))).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Honshroud(new Stats(580, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED, StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Garkitsu(new Stats(600, StatArchetype.ALL_ROUND,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Shinimi(new Stats(580, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Sakurage(new Stats(680, StatArchetype.SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Banshugi(new Stats(580, StatArchetype.FAST_PHYSICAL_WALL,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Kubaiyu(new Stats(680, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE, StatType.HP))));
        addNewPokemon(new Akiddo());
        addNewPokemon(new Qirinity());
    }

}
