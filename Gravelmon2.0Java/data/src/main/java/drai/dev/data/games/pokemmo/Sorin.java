package drai.dev.data.games.pokemmo;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.srin.*;

import java.util.*;

public class Sorin extends drai.dev.data.games.registry.Game {
    public Sorin() {
        super("Sōrin");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Grascal());   
        pokemon.add(new Astoundent());   
        pokemon.add(new Cragwise());
        pokemon.add(new Ochrab());   
        pokemon.add(new Kraboxa());   
        pokemon.add(new Krushteichen());
        pokemon.add(new Burrblu());   
        pokemon.add(new Soulfowl());   
        pokemon.add(new Heronrei(new Stats(525, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        pokemon.add(new Mousu());   
        pokemon.add(new Mousei(new Stats(435, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Childi());
        pokemon.add(new Childei(new Stats(456, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Chidoni(new Stats(456, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Chabug());
        pokemon.add(new Chasmor());   
        pokemon.add(new Bataphyre(new Stats(467, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Ichu());   
        pokemon.add(new Ikachu());   
        pokemon.add(new Kuraichu(new Stats(510, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        pokemon.add(new Bakenya());
        pokemon.add(new Nyanyarn());   
        pokemon.add(new Aftamoth(new Stats(455, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Tinsugi(new Stats(411, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Dubdol(new Stats(411, StatArchetype.FAST_SUPPORT,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Lotten(new Stats(435, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPEED))));
        pokemon.add(new Shamikiri(new Stats(435, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.ATTACK))));
        pokemon.add(new Unjibee());   
        pokemon.add(new Tujibees());   
        pokemon.add(new Furubee(new Stats(467, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Kittim());
        pokemon.add(new Kitmoone(new Stats(489, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Flodeppo(new Stats(478, StatArchetype.FAST_PHYSICAL_WALL,
                List.of(StatType.HP))));
        pokemon.add(new Kabbema());
        pokemon.add(new Kabrookie(new Stats(465, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Airadaga(new Stats(465, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        pokemon.add(new Polyo());
        pokemon.add(new Toady(new Stats(456, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        pokemon.add(new Stunzeed(new Stats(411, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPEED))));
        pokemon.add(new Chitaki());   
        pokemon.add(new Chitossan(new Stats(435, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Coroseed());   
        pokemon.add(new Artifleur(new Stats(456, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        pokemon.add(new Geckayo());
        pokemon.add(new Suiboo());
        pokemon.add(new Suidra(new Stats(469, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Tenchick());
        pokemon.add(new Teffin(new Stats(445, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Driftzee(new Stats(410, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPEED))));
        pokemon.add(new Reefreith(new Stats(410, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Shriyago());
        pokemon.add(new Bulkyago());
        pokemon.add(new Gryago(new Stats(545, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE, StatType.ATTACK))));
        pokemon.add(new Smackarel());   
        pokemon.add(new Tontuna(new Stats(467, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.HP))));
        pokemon.add(new Monkiyo());   
        pokemon.add(new Macaukong(new Stats(487, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.HP))));
        pokemon.add(new Suzzbug());   
        pokemon.add(new Bambuzzle(new Stats(444, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPEED))));
        pokemon.add(new Batzu(new Stats(432, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        pokemon.add(new Shenbit());
        pokemon.add(new Shentar(new Stats(498, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Guuby());
        pokemon.add(new Cepiina(new Stats(476, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Snabami(new Stats(454, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        pokemon.add(new Subserow(new Stats(454, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        pokemon.add(new Furalem(new Stats(454, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Artishock(new Stats(433, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Dorofae(new Stats(433, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Kapkid());
        pokemon.add(new Kapripple(new Stats(478, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        pokemon.add(new Torex());
        pokemon.add(new Toriiment(new Stats(478, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Axolaki(new Stats(455, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE, StatType.HP))));
        pokemon.add(new Wyverth(new Stats(455, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE, StatType.HP))));
        pokemon.add(new Barknuckle());   
        pokemon.add(new Onwel(new Stats(476, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new Gnasher());   
        pokemon.add(new Abysshark(new Stats(489, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        pokemon.add(new Charmeira(new Stats(489, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Coltmer());
        pokemon.add(new Tomburd());   
        pokemon.add(new Storkscrew(new Stats(522, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        pokemon.add(new Slashtork(new Stats(522, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Tarpir());   
        pokemon.add(new Tarbaku(new Stats(490, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Yograde());
        pokemon.add(new Scubeetle(new Stats(476, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        pokemon.add(new Omuhelm(new Stats(476, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Hydrinju(new Stats(476, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Cholarva());
        pokemon.add(new Chorise());
        pokemon.add(new Chchitin(new Stats(600, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.DEFENCE, StatType.DEFENCE, StatType.ATTACK))));
        pokemon.add(new Tanukey(new Stats(435, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Bkon());   
        pokemon.add(new Barun());   
        pokemon.add(new Rydreki(new Stats(600, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE, StatType.SPECIAL_DEFENCE, StatType.ATTACK))));
        pokemon.add(new Nyokushi(new Stats(580, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Tsuchigu(new Stats(580, StatArchetype.FAST_PHYSICAL_WALL,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Sakurage(new Stats(580, StatArchetype.SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Kubaiyu(new Stats(580, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE, StatType.HP))));
        pokemon.add(new Honshroud(new Stats(580, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED, StatType.SPECIAL_ATTACK))));
        pokemon.add(new Garkitsu(new Stats(600, StatArchetype.ALL_ROUND,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Uruboatu(new Stats(660, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Dragangle(new Stats(660, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
    }

}
