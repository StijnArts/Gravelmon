package drai.dev.data.games.instagram.eldark;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.raian.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Trizor extends drai.dev.data.games.registry.Game {
    public Trizor() {
        super("Trizor");
    }

    @Override
    public void init() {
        super.init();
        pokemon.forEach(pokemon1 -> {
            pokemon1.getLabels().remove(Label.RAIAN);
            pokemon1.getLabels().add(Label.TRIZOR);
        });
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Babear().setUsesBigModel());
        pokemon.add(new Roybear().setUsesBigModel());
        pokemon.add(new Beroxic(new Stats(530, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))).setUsesBigModel());
        pokemon.add(new Tecanbear(new Stats(530, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());

        pokemon.add(new Gorire().setUsesBigModel());
        pokemon.add(new Gorajack().setUsesBigModel());
        pokemon.add(new Gorisulfa(new Stats(530, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Tecnorilla(new Stats(530, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());

        pokemon.add(new Spactrish().setUsesBigModel());
        pokemon.add(new Spacteel().setUsesBigModel());
        pokemon.add(new Whaleist(new Stats(530, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Tecnophin(new Stats(530, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());

        pokemon.add(new Woolorm().setUsesBigModel());
        pokemon.add(new Blancoon().setUsesBigModel());
        pokemon.add(new Mushlanket(new Stats(480, StatArchetype.BULKY_SUPPORT, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        pokemon.add(new Chowl().setUsesBigModel());
        pokemon.add(new Kickowl(new Stats(480, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Zokinub().setUsesBigModel());
        pokemon.add(new Zilozwine().setUsesBigModel());
        pokemon.add(new Zazozwine(new Stats(530, StatArchetype.PHYSICAL_WALL, List.of(StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Orbavil().setUsesBigModel());
        pokemon.add(new Earyvil().setUsesBigModel());
        pokemon.add(new Morevil(new Stats(490, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Plasmar().setUsesBigModel());
        pokemon.add(new Plateach(new Stats(450, StatArchetype.BULKY_SUPPORT, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Spikuch().setUsesBigModel());
        pokemon.add(new Sprunch(new Stats(460, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Baparo().setUsesBigModel());
        pokemon.add(new Bigparro(new Stats(450, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Kittone().setUsesBigModel());
        pokemon.add(new Cattwo().setUsesBigModel());
        pokemon.add(new Fetrio(new Stats(510, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Alyops().setUsesBigModel());
        pokemon.add(new Teenops().setUsesBigModel());
        pokemon.add(new Eyesult(new Stats(500, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        pokemon.add(new Ugduck().setUsesBigModel());
        pokemon.add(new Swaqueen(new Stats(470, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new Binthmar().setUsesBigModel());
        pokemon.add(new Umhmar(new Stats(460, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Orlic().setUsesBigModel());
        pokemon.add(new Electroll().setUsesBigModel());
        pokemon.add(new Magnetroll(new Stats(490, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Bapixie().setUsesBigModel());
        pokemon.add(new Toxipixie(new Stats(460, StatArchetype.BULKY_SUPPORT, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Parapixie(new Stats(460, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Burnpixie(new Stats(460, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        pokemon.add(new Polaby().setUsesBigModel());
        pokemon.add(new Prirog().setUsesBigModel());
        pokemon.add(new Froprince(new Stats(520, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        pokemon.add(new Maggenrola().setUsesBigModel());
        pokemon.add(new Flydore().setUsesBigModel());
        pokemon.add(new Gigascath(new Stats(515, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new Chilleti().setUsesBigModel());
        pokemon.add(new Icyety(new Stats(470, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))).setUsesBigModel());
        pokemon.add(new Gecgon().setUsesBigModel());
        pokemon.add(new Phrygon().setUsesBigModel());
        pokemon.add(new Igunagon(new Stats(540, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Azagger(new Stats(545, StatArchetype.SPECIAL_WALL, List.of(StatType.SPECIAL_DEFENCE, StatType.DEFENCE))).setUsesBigModel());

        pokemon.add(new Azmory(new Stats(534, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Rosper().setUsesBigModel());
        pokemon.add(new Vetesper().setUsesBigModel());
        pokemon.add(new Masper(new Stats(520, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());

        pokemon.add(new Lizaflage().setUsesBigModel());
        pokemon.add(new Camoflora().setUsesBigModel());
        pokemon.add(new Camottle(new Stats(524, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        pokemon.add(new Kapalze().setUsesBigModel());
        pokemon.add(new Tutolar().setUsesBigModel());
        pokemon.add(new Locanel(new Stats(530, StatArchetype.FAST_SPECIAL_WALL, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        pokemon.add(new Dropico().setUsesBigModel());
        pokemon.add(new Droprock().setUsesBigModel());
        pokemon.add(new Rexdew(new Stats(528, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());

        pokemon.add(new Stoni().setUsesBigModel());
        pokemon.add(new Waraoni(new Stats(480, StatArchetype.BULKY_SUPPORT, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Wanyoni(new Stats(480, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Suikoni(new Stats(480, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Raioni(new Stats(480, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Gakioni(new Stats(480, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new Chooni(new Stats(480, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Engoni(new Stats(480, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Mikoni(new Stats(480, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        pokemon.add(new Ofoni(new Stats(480, StatArchetype.BULKY_SUPPORT, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new Kanazoni(new Stats(480, StatArchetype.BULKY_SUPPORT, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Suchoni(new Stats(480, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Nupponi(new Stats(480, StatArchetype.SPECIAL_WALL, List.of(StatType.HP  ))).setUsesBigModel());
        pokemon.add(new Bulkoni(new Stats(480, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP, StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Atsoni(new Stats(480, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Ushioni(new Stats(480, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Hitotsoni(new Stats(480, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.HP))).setUsesBigModel());
        pokemon.add(new Ikarioni(new Stats(480, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Leapug().setUsesBigModel());
        pokemon.add(new Kingpug(new Stats(470, StatArchetype.PHYSICAL_WALL, List.of(StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Elephire().setUsesBigModel());
        pokemon.add(new Elephlaze(new Stats(470, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Telvant(new Stats(310, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Scrwant(new Stats(310, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Bulbant(new Stats(310, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Collecjunk(new Stats(410, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Rexagon(new Stats(580, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());

        pokemon.add(new Rayqunix(new Stats(510, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        pokemon.add(new Cyrok().setUsesBigModel());
        pokemon.add(new Golasma().setUsesBigModel());
        pokemon.add(new Crimsagon(new Stats(600, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
    }
}
