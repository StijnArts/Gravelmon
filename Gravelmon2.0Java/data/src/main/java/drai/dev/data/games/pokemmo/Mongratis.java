package drai.dev.data.games.pokemmo;


import drai.dev.data.pokemon.ayrei.Firomenis;
import drai.dev.data.pokemon.ayrei.Merlicun;
import drai.dev.data.pokemon.mongratis.*;
import drai.dev.data.pokemon.mongratis.Baobaraffe;
import drai.dev.data.pokemon.mongratis.Baoby;
import drai.dev.data.pokemon.mongratis.Baulder;
import drai.dev.data.pokemon.mongratis.Cobarett;
import drai.dev.data.pokemon.mongratis.Hissiorite;
import drai.dev.data.pokemon.mongratis.Lavare;
import drai.dev.data.pokemon.mongratis.Lavee;
import drai.dev.data.pokemon.mongratis.Pythonova;
import drai.dev.data.pokemon.mongratis.Tekagon;
import drai.dev.data.pokemon.myth.*;
import drai.dev.data.attributes.*;

import java.util.*;

public class Mongratis extends drai.dev.data.games.registry.Game {
    public Mongratis() {
        super("Mongratis");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Geckrow());
        pokemon.add(new Goanopy());
        pokemon.add(new Varanitor());
        pokemon.add(new Hissiorite());
        pokemon.add(new Cobarett());
        pokemon.add(new Pythonova());
        pokemon.add(new Ninoala());   
        pokemon.add(new Koaninja(new Stats(430, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Anu(new Stats(340, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))));
        pokemon.add(new Merlicun());
        pokemon.add(new Firomenis());
        pokemon.add(new Baoby());
        pokemon.add(new Baobaraffe());
        pokemon.add(new Nuenflu(new Stats(360, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Drashimi());   
        pokemon.add(new Tsushimi());   
        pokemon.add(new Tobishimi(new Stats(523, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Baulder());
        pokemon.add(new Dredrock());
        pokemon.add(new Tekagon());
        pokemon.add(new Nymbi());   
        pokemon.add(new Deember(new Stats(489, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Lavee());
        pokemon.add(new Lavare());
        pokemon.add(new Lavarator());
        pokemon.add(new Efflutal(new Stats(370, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))));
        pokemon.add(new Hayog());   
        pokemon.add(new Hogouse());   
        pokemon.add(new Hogriks(new Stats(480, StatArchetype.PHYSICAL_WALL, List.of(StatType.DEFENCE))));
        pokemon.add(new Webruiser(new Stats(410, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Pilfetch());   
        pokemon.add(new Criminalis(new Stats(390, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Pasturlo());
        pokemon.add(new Brambull());
        pokemon.add(new Maizotaur());
        pokemon.add(new Minamai());   
        pokemon.add(new Marelstorm(new Stats(450, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Tormine());
        pokemon.add(new Sunnydra());
        pokemon.add(new Cryscross());
        pokemon.add(new Trantima(new Stats(410, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));
        pokemon.add(new Gireamer(new Stats(520, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPEED, StatType.DEFENCE))));
        pokemon.add(new Nitmarig(new Stats(520, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED, StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Moosid());
        pokemon.add(new Egoelk());
        pokemon.add(new Suprago());
        pokemon.add(new Timberry());   
        pokemon.add(new Howliage());   
        pokemon.add(new Botanine(new Stats(520, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Bonfur());   
        pokemon.add(new Tindursa());   
        pokemon.add(new Sizzly(new Stats(520, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Saurky());   
        pokemon.add(new Crestaka());   
        pokemon.add(new Avipex(new Stats(520, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Lollybog());   
        pokemon.add(new Brewtrid());   
        pokemon.add(new Forbiddron(new Stats(510, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Plushion());   
        pokemon.add(new Rocotton());   
        pokemon.add(new Tuffettry(new Stats(500, StatArchetype.SPECIAL_WALL, List.of(StatType.HP))));
        pokemon.add(new Raskit());   
        pokemon.add(new Scruffian(new Stats(430, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Dynabit());
        pokemon.add(new Pompet());   
        pokemon.add(new Pomprim(new Stats(460, StatArchetype.PHYSICAL_WALL, List.of(StatType.DEFENCE))));
        pokemon.add(new Droopig());   
        pokemon.add(new Hoolihog(new Stats(430, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Kankwart());   
        pokemon.add(new Kankryst());   
        pokemon.add(new Kankersaur(new Stats(524, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))));
        pokemon.add(new Impurp());
        pokemon.add(new Nymfusha());
        pokemon.add(new Samoald());   
        pokemon.add(new Bombustoad(new Stats(450, StatArchetype.PHYSICAL_WALL, List.of(StatType.DEFENCE))));
        pokemon.add(new Sligment());   
        pokemon.add(new Viscolor());   
        pokemon.add(new Gelescent(new Stats(500, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Dripwirt());   
        pokemon.add(new Pourka(new Stats(460, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Umbreeze(new Stats(460, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Lumini());   
        pokemon.add(new Lumedi());   
        pokemon.add(new Lumaxi(new Stats(510, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Skelleks());   
        pokemon.add(new Negagen(new Stats(480, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Sillennium(new Stats(350, StatArchetype.PHYSICAL_WALL, List.of(StatType.DEFENCE))));
        pokemon.add(new Mivota(new Stats(350, StatArchetype.SPECIAL_WALL, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Beeheave());   
        pokemon.add(new Hivernor(new Stats(470, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.HP))));
        pokemon.add(new Blonk());   
        pokemon.add(new Colobble());   
        pokemon.add(new Colobbus(new Stats(490, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))));
        pokemon.add(new Dialapis(new Stats(490, StatArchetype.SPECIAL_WALL, List.of(StatType.DEFENCE))));
        pokemon.add(new Chickite());   
        pokemon.add(new Kitiary());   
        pokemon.add(new Turbatic(new Stats(511, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Mondrog(new Stats(460, StatArchetype.SPECIAL_WALL, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Anxiust());
        pokemon.add(new Curiust());   
        pokemon.add(new Dustfully(new Stats(460, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.HP))));
        pokemon.add(new Embat());   
        pokemon.add(new Fumbat());   
        pokemon.add(new Chimbat(new Stats(490, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Crucibat(new Stats(490, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Flixtrix(new Stats(390, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Chartail());   
        pokemon.add(new Strivane());   
        pokemon.add(new Navigale(new Stats(360, StatArchetype.FAST_SPECIAL_WALL, List.of(StatType.SPEED))));
        pokemon.add(new Oppwold(new Stats(39, StatArchetype.SPECIAL_WALL, List.of(StatType.HP))));
        pokemon.add(new Triastick());   
        pokemon.add(new Jurasper());   
        pokemon.add(new Cretassom(new Stats(521, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))));
        pokemon.add(new Juncko());   
        pokemon.add(new Scavengila(new Stats(490, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Scalamber());   
        pokemon.add(new Scragorge(new Stats(490, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Vampingo(new Stats(420, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Scarambi());   
        pokemon.add(new Scaroptu(new Stats(440, StatArchetype.SPECIAL_WALL, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Snowly());
        pokemon.add(new Strunk());   
        pokemon.add(new Kalaxodon(new Stats(445, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.HP))));
        pokemon.add(new Curlusk());   
        pokemon.add(new Spiralusk());   
        pokemon.add(new Abbylusk(new Stats(550, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Industove(new Stats(390, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Larvalpha());   
        pokemon.add(new Puteba());   
        pokemon.add(new Imagamma(new Stats(460, StatArchetype.FAST_SUPPORT, List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Plantid());
        pokemon.add(new Reaphid(new Stats(450, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Rootsy());   
        pokemon.add(new Roogilist(new Stats(430, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Petalcher(new Stats(380, StatArchetype.BULKY_SUPPORT, List.of(StatType.DEFENCE))));
        pokemon.add(new Littoril());   
        pokemon.add(new Exspunge());   
        pokemon.add(new Tidoral(new Stats(510, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Upspark());   
        pokemon.add(new Shockfull(new Stats(420, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))));
        pokemon.add(new Sporkupine(new Stats(420, StatArchetype.PHYSICAL_WALL, List.of(StatType.ATTACK))));
        pokemon.add(new Clowee());   
        pokemon.add(new Clolly());   
        pokemon.add(new Clodiva(new Stats(470, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.HP))));
        pokemon.add(new Asterish());   
        pokemon.add(new Gilactic(new Stats(500, StatArchetype.SPECIAL_WALL, List.of(StatType.HP))));
        pokemon.add(new Chryspark());   
        pokemon.add(new Chrysurge(new Stats(470, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Chrycirc(new Stats(470, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))));
        pokemon.add(new Luxp());   
        pokemon.add(new Leazury(new Stats(474, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Winkip());   
        pokemon.add(new Winkap());   
        pokemon.add(new Winkarni(new Stats(510, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Qwirm(new Stats(370, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));
        pokemon.add(new Shadeleon());   
        pokemon.add(new Chromeleon(new Stats(460, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Searpent(new Stats(420, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Synopede());   
        pokemon.add(new Lunapede(new Stats(450, StatArchetype.PHYSICAL_WALL, List.of(StatType.DEFENCE))));
        pokemon.add(new Brayd());   
        pokemon.add(new Brushle());   
        pokemon.add(new Velamour(new Stats(490, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Adepht());   
        pokemon.add(new Squizard());   
        pokemon.add(new Sorcepher(new Stats(480, StatArchetype.SPECIAL_WALL, List.of(StatType.DEFENCE))));
        pokemon.add(new Boistaur());   
        pokemon.add(new Robustaur(new Stats(470, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Majestaur(new Stats(470, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Blockodile(new Stats(350, StatArchetype.SPECIAL_WALL, List.of(StatType.HP))));
        pokemon.add(new Sanda());   
        pokemon.add(new Dansakoi(new Stats(370, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Subyss(new Stats(340, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.HP))));
        pokemon.add(new Flooie());   
        pokemon.add(new Flobal(new Stats(450, StatArchetype.SPECIAL_WALL, List.of(StatType.HP))));
        pokemon.add(new Snagatoof());   
        pokemon.add(new Snagajin(new Stats(410, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Burrb());   
        pokemon.add(new Spikonsia(new Stats(440, StatArchetype.SPECIAL_WALL, List.of(StatType.HP))));
        pokemon.add(new Varmot(new Stats(370, StatArchetype.BULKY_SUPPORT, List.of(StatType.SPEED))));
        pokemon.add(new Trablur());   
        pokemon.add(new Vizitid(new Stats(430, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.DEFENCE))));
        pokemon.add(new Thissblade(new Stats(380, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Snpme());   
        pokemon.add(new Froll(new Stats(430, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE, StatType.HP))));
        pokemon.add(new Flyrry());   
        pokemon.add(new Wyntry(new Stats(440, StatArchetype.SPECIAL_WALL, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Gardial(new Stats(410, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))));
        pokemon.add(new Appalyp());   
        pokemon.add(new Sycoral());   
        pokemon.add(new Nemesusa(new Stats(520, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.DEFENCE))));
        pokemon.add(new Fencival(new Stats(430, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Enderbird(new Stats(410, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Lizquent());
    }

}