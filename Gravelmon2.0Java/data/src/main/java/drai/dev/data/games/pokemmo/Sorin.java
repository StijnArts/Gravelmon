package drai.dev.data.games.pokemmo;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.srin.*;

import java.util.*;

public class Sorin extends drai.dev.data.games.registry.Game {
    public Sorin() {
        super("Sorin");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Grascal());   
        addNewPokemon(new Astoundent());   
        addNewPokemon(new Cragwise());
        addNewPokemon(new Ochrab());   
        addNewPokemon(new Kraboxa());   
        addNewPokemon(new Krushteichen());
        addNewPokemon(new Burrblu());   
        addNewPokemon(new Soulfowl());   
        addNewPokemon(new Heronrei(new Stats(525, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Mousu());   
        addNewPokemon(new Mousei(new Stats(435, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Childi());
        addNewPokemon(new Childei(new Stats(456, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Chidoni(new Stats(456, StatArchetype.FAST_SPECIAL_ATTACKER,
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
                List.of(StatType.ATTACK))));
        addNewPokemon(new Unjibee());   
        addNewPokemon(new Tujibees());   
        addNewPokemon(new Furubee(new Stats(467, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Kittim());
        addNewPokemon(new Kitmoone(new Stats(489, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Flodeppo(new Stats(478, StatArchetype.FAST_PHYSICAL_WALL,
                List.of(StatType.HP))));
        addNewPokemon(new Kabbema());
        addNewPokemon(new Kabrookie(new Stats(465, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Airadaga(new Stats(465, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Polyo());
        addNewPokemon(new Toady(new Stats(456, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Stunzeed(new Stats(411, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPEED))));
        addNewPokemon(new Chitaki());   
        addNewPokemon(new Chitossan(new Stats(435, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Coroseed());   
        addNewPokemon(new Artifleur(new Stats(456, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Geckayo());
        addNewPokemon(new Suiboo());
        addNewPokemon(new Suidra(new Stats(469, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Tenchick());
        addNewPokemon(new Teffin(new Stats(445, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Driftzee(new Stats(410, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPEED))));
        addNewPokemon(new Reefreith(new Stats(410, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Shriyago());
        addNewPokemon(new Bulkyago());
        addNewPokemon(new Gryago(new Stats(545, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE, StatType.ATTACK))));
        addNewPokemon(new Smackarel());   
        addNewPokemon(new Tontuna(new Stats(467, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Monkiyo());   
        addNewPokemon(new Macaukong(new Stats(487, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Suzzbug());   
        addNewPokemon(new Bambuzzle(new Stats(444, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPEED))));
        addNewPokemon(new Batzu(new Stats(432, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Shenbit());
        addNewPokemon(new Shentar(new Stats(498, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Guuby());
        addNewPokemon(new Cepiina(new Stats(476, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Snabami(new Stats(454, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Subserow(new Stats(454, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Furalem(new Stats(454, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Artishock(new Stats(433, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Dorofae(new Stats(433, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Kapkid());
        addNewPokemon(new Kapripple(new Stats(478, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Torex());
        addNewPokemon(new Toriiment(new Stats(478, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
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
        addNewPokemon(new Coltmer());
        addNewPokemon(new Tomburd());   
        addNewPokemon(new Storkscrew(new Stats(522, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Slashtork(new Stats(522, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Tarpir());   
        addNewPokemon(new Tarbaku(new Stats(490, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Yograde());
        addNewPokemon(new Scubeetle(new Stats(476, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Omuhelm(new Stats(476, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Hydrinju(new Stats(476, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Cholarva());
        addNewPokemon(new Chorise());
        addNewPokemon(new Chchitin(new Stats(600, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.DEFENCE, StatType.DEFENCE, StatType.ATTACK))));
        addNewPokemon(new Tanukey(new Stats(435, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Bkon());   
        addNewPokemon(new Barun());   
        addNewPokemon(new Rydreki(new Stats(600, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE, StatType.SPECIAL_DEFENCE, StatType.ATTACK))));
        addNewPokemon(new Nyokushi(new Stats(580, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Tsuchigu(new Stats(580, StatArchetype.FAST_PHYSICAL_WALL,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Sakurage(new Stats(580, StatArchetype.SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Kubaiyu(new Stats(580, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE, StatType.HP))));
        addNewPokemon(new Honshroud(new Stats(580, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED, StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Garkitsu(new Stats(600, StatArchetype.ALL_ROUND,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Uruboatu(new Stats(660, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Dragangle(new Stats(660, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
    }

}
