package drai.dev.data.games.pokemmo.secondbatch;


import drai.dev.data.pokemon.ionos.*;
import drai.dev.data.pokemon.ionos.Mimicorn;
import drai.dev.data.pokemon.ionos.Mushi;
import drai.dev.data.attributes.*;

import java.util.*;

import static org.graalvm.shadowed.org.jcodings.transcode.EConvResult.Finished;

public class Ionos extends drai.dev.data.games.registry.Game {
    public Ionos() {
        super("Ionos");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Shrubbie());   Missing Stats
        pokemon.add(new Herbelle());   Missing Stats
        pokemon.add(new Miralide()); Member of line Not Finished
        pokemon.add(new Radarent());   Missing Stats
        pokemon.add(new Sparkadillo());   Missing Stats
        pokemon.add(new Armadealo());Member of line Not Finished
        pokemon.add(new Chompper());   Missing Stats
        pokemon.add(new Crunchawtle());   Missing Stats
        pokemon.add(new Tormightier());Member of line Not Finished
        pokemon.add(new Sengishrew());   Missing Stats
        pokemon.add(new Plagarata(new Stats(421, StatArchetype.FAST_SUPPORT, List.of(StatType.ATTACK))));   Missing Stats
        pokemon.add(new Pomfly());   Missing Stats
        pokemon.add(new Snoutfly(new Stats(387, StatArchetype.BULKY_SUPPORT, List.of(StatType.SPECIAL_DEFENCE))));   Missing Stats
        pokemon.add(new Cockatoto());   Missing Stats
        pokemon.add(new Cockapoll());   Missing Stats
        pokemon.add(new Sheagull());Member of line Not Finished
        pokemon.add(new Pharature());Member of line Not Finished
        pokemon.add(new Gnurogo());
        pokemon.add(new Woomask());Member of line Not Finished
        pokemon.add(new Madogo(new Stats(398, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));   Missing Stats
        pokemon.add(new Sigiping(new Stats(217, StatArchetype.SPECIAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Meaniechu());
        pokemon.add(new Grubdew());
        pokemon.add(new Lohopper());
        pokemon.add(new Wisopotron());
        pokemon.add(new Dizzpin());
        pokemon.add(new Mobono());   Missing Stats
        pokemon.add(new Shinpanzee(new Stats(443, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK, StatType.SPEED))));   Missing Stats
        pokemon.add(new Suastalk(new Stats(376, StatArchetype.BULKY_SUPPORT, List.of(StatType.SPECIAL_DEFENCE))));   Missing Stats
        pokemon.add(new Spikish());   Missing Stats
        pokemon.add(new Nommogo(new Stats(432, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));   Missing Stats
        pokemon.add(new Felipom(new Stats(376, StatArchetype.BULKY_SUPPORT, List.of(StatType.HP))));   Missing Stats
//        pokemon.add(new Hogletwip());   Missing Art
//        pokemon.add(new Warhog()); Member of line Not Finished  Missing Stats
        pokemon.add(new Larveye());
        pokemon.add(new Eyecoon());
        pokemon.add(new Motholus());
        pokemon.add(new Golfish());   Missing Stats
        pokemon.add(new Jewereel(new Stats(442, StatArchetype.FAST_SUPPORT, List.of(StatType.SPECIAL_ATTACK))));  Missing Stats
//        pokemon.add(new Crabbot());   Missing Art
//        pokemon.add(new Crabmech());   Missing Stats
        pokemon.add(new Bubupole());   Missing Stats
        pokemon.add(new Geohertoad());   Missing Stats
        pokemon.add(new Phrynotoad(new Stats(521, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));   Missing Stats
        pokemon.add(new Jokaite(new Stats(365, StatArchetype.FAST_SPECIAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Lannatee(new Stats(365, StatArchetype.FAST_PHYSICAL_WALL, List.of(StatType.HP))));  Missing Stats
//        pokemon.add(new Ignipala());   Missing Stats
//        pokemon.add(new Blazellous());   Missing Stats
//        pokemon.add(new 141599());   Missing Art
        pokemon.add(new Acheeva()); MISSING STATS
        pokemon.add(new Phantrella(new Stats(354, StatArchetype.BULKY_SUPPORT, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Rockadoo(new Stats(365, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));   Missing Stats
        pokemon.add(new Stiltiwalka(new Stats(342, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));   Missing Stats
        pokemon.add(new Leaplip(new Stats(344, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));  Missing Name  Missing Stats
        pokemon.add(new Loafey());   Missing Stats
        pokemon.add(new Leonier(new Stats(476, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));   Missing Stats
        pokemon.add(new Leonet(new Stats(476, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));   Missing Stats
        pokemon.add(new Posschest(new Stats(345, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Figurina(new Stats(345, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))));   Missing Stats
        pokemon.add(new Cordachin());
//        pokemon.add(new 884872());  Missing Name  Missing Stats Member of line Not Finished
//        pokemon.add(new Tormid());   Missing Art
//        pokemon.add(new Bigboi());  Missing Name Missing Stats Member of line Not Finished
        pokemon.add(new Spothyena());
        pokemon.add(new Khaheena());
        pokemon.add(new Gormhyena());
//        pokemon.add(new Dungie());   Missing Art
//        pokemon.add(new Stageros());   Missing Stats
        pokemon.add(new Clubit());  Missing Stats
        pokemon.add(new Swingit());  Missing Stats
        pokemon.add(new Bonkeet(new Stats(523, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));  Missing Stats
        pokemon.add(new Kaidalope());  Missing Stats
        pokemon.add(new Faigalope(new Stats(487, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));   Missing Stats
//        pokemon.add(new 973305()); Missing Name   Missing Stats Member of line Not Finished
//        pokemon.add(new 568666()); Missing Name   Missing Stats Member of line Not Finished
//        pokemon.add(new 854996());   Missing Art
//        pokemon.add(new Sinimite());   Missing Art
//        pokemon.add(new Tripostite());   Missing Stats
//        pokemon.add(new 111049());   Missing Art
        pokemon.add(new Kubite());   Missing Stats
        pokemon.add(new Rokubandy(new Stats(457, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));  Missing Name  Missing Stats
        pokemon.add(new Sunling());   Missing Stats
        pokemon.add(new Sunatee(new Stats(458, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.HP))));    Missing Stats
        pokemon.add(new Exploroid());    Missing Stats
        pokemon.add(new Deoxavir(new Stats(341, StatArchetype.MIXED_ATTACKER, List.of(StatType.HP))));    Missing Stats
        pokemon.add(new Minore());   Missing Stats
        pokemon.add(new Orbiter());   Missing Stats
        pokemon.add(new Charger(new Stats(511, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Relido(new Stats(505, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE)))); Missing Name   Missing Stats
        pokemon.add(new Primecleon(new Stats(510, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));   Missing Stats
        pokemon.add(new Aquapo()); Missing Name   Missing Stats
        pokemon.add(new Aquadon(new Stats(478, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));   Missing Stats
        pokemon.add(new Tinosaur());   Missing Stats
        pokemon.add(new Eruptor(new Stats(478, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));   Missing Stats
//        pokemon.add(new 892993());   Missing Art
//        pokemon.add(new 473877());   Missing Art
//        pokemon.add(new 396609());   Missing Art
//        pokemon.add(new 765545());   Missing Art
//        pokemon.add(new 945());   Missing Art Member of line Not Finished
//        pokemon.add(new 387899());  Missing Name  Missing Stats
//        pokemon.add(new Pharaferno());   Missing Stats
        pokemon.add(new Heloisk(new Stats(512, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));   Missing Stats
        pokemon.add(new Mumby());
        pokemon.add(new Pharumm());
        pokemon.add(new Caconie());
        pokemon.add(new Tennestrian());   Missing Stats
        pokemon.add(new Knightmor());Member of line Not Finished
        pokemon.add(new Eevvee());Member of line Not Finished
        pokemon.add(new Pacemeon());Member of line Not Finished
        pokemon.add(new Pestileon(new Stats(530, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))));   Missing Stats
        pokemon.add(new Pupshi());   Missing Stats
        pokemon.add(new Typhur());   Missing Stats
        pokemon.add(new Typhoonos(new Stats(500, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPEED))));   Missing Stats
        pokemon.add(new Pottlin());  Missing Stats
        pokemon.add(new Pottyrm(new Stats(501, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));  Missing Stats
        pokemon.add(new Xinigen());
        pokemon.add(new Puffjinn());
        pokemon.add(new Minjin());
        pokemon.add(new Cerbenos(new Stats(570, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))));   Missing Stats
        pokemon.add(new Drahoggon());
        pokemon.add(new Oldeture());
        pokemon.add(new Faunler());  Missing Stats
        pokemon.add(new Satyrnus());  Missing Stats
        pokemon.add(new Tauracho());Member of line Not Finished
        pokemon.add(new Kinbat());   Missing Stats
        pokemon.add(new Garpyre());   Missing Stats
        pokemon.add(new Duabat(new Stats(526, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));   Missing Stats
        pokemon.add(new Fillybrum());   Missing Stats
        pokemon.add(new Corashu());Member of line Not Finished
        pokemon.add(new Campullion());Member of line Not Finished
        pokemon.add(new Tarsiboo());
        pokemon.add(new Peerhini());
        pokemon.add(new Velitite());   Missing Stats
        pokemon.add(new Onyssilade(new Stats(410, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Mushi());   Missing Stats
        pokemon.add(new Mutungus(new Stats(420, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));   Missing Stats
        pokemon.add(new MushShi(new Stats(420, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));   Missing Stats
        pokemon.add(new Mimicorn(new Stats(310, StatArchetype.BULKY_SUPPORT, List.of(StatType.DEFENCE))));   Missing Stats
        pokemon.add(new Grumchick());   Missing Stats
        pokemon.add(new Horribill(new Stats(425, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));   Missing Stats
        pokemon.add(new Moschievous());  Missing Stats
        pokemon.add(new Embush());   Missing Stats
        pokemon.add(new Yatatree(new Stats(510, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Humini());   Missing Stats
        pokemon.add(new Bellagon());Member of line Not Finished
        pokemon.add(new Palazy());   Missing Stats //renamed from smokebreak
        pokemon.add(new Palegon(new Stats(487, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));   Missing Stats
        pokemon.add(new Scubargon());  Missing Stats
        pokemon.add(new Sermurgon(new Stats(487, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));  Missing Stats
//        pokemon.add(new MrMind());   Missing Stats
//        pokemon.add(new Wiselicious());Member of line Not Finished
        pokemon.add(new Clownemone());   Missing Stats
        pokemon.add(new Clownfisk(new Stats(420, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Sprawniple(new Stats(360, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));   Missing Stats
        pokemon.add(new Angligh(new Stats(370, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.DEFENCE))));   Missing Stats
        pokemon.add(new Tranoler(new Stats(370, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));   Missing Stats
        pokemon.add(new Chatart(new Stats(498, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Minkin());
        pokemon.add(new Rivacal());
        pokemon.add(new Bultin());   Missing Stats
        pokemon.add(new Clusturb());   Missing Stats
        pokemon.add(new Shortulp(new Stats(512, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));   Missing Stats
        pokemon.add(new Antello(new Stats(341, StatArchetype.BULKY_SUPPORT, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new PorygonY());
        pokemon.add(new Duelleon(new Stats(525, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Fefae());   Missing Stats
        pokemon.add(new Safauna(new Stats(470, StatArchetype.FAST_SUPPORT, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Nimbat());
        pokemon.add(new Marbel());
        pokemon.add(new Marbelous());
        pokemon.add(new Destructos());
        pokemon.add(new Bubill());
        pokemon.add(new Daimonize());
        pokemon.add(new Gildthera(new Stats(580, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));   Missing Stats
        pokemon.add(new Pythion(new Stats(580, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));   Missing Stats
        pokemon.add(new Taurion(new Stats(580, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPEED))));   Missing Stats
        pokemon.add(new Regishard());
        pokemon.add(new Nightrogen());
    }

}
