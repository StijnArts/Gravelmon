package drai.dev.data.games.instagram.eldark;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.raian.*;
import drai.dev.data.pokemon.raian.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Trizor extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Trizor();
    private Trizor() {
        super("Trizor");
    }

    @Override
    public void init(String resourcesDir) {
        super.init(resourcesDir);
        newPokemon.forEach(pokemon1 -> {
            pokemon1.getLabels().remove(Label.RAIAN);
            pokemon1.getLabels().add(Label.TRIZOR);
            pokemon1.getLabels().add(Label.INSTAGRAM);
        });
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Babear().addLabels(Label.STARTER));
        addNewPokemon(new Roybear().addLabels(Label.STARTER));
        addNewPokemon(new Beroxic(new Stats(530, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))).addLabels(Label.STARTER));
        addNewPokemon(new Tecanbear(new Stats(530, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).addLabels(Label.STARTER));

        addNewPokemon(new Gorire().addLabels(Label.STARTER));
        addNewPokemon(new Gorajack().addLabels(Label.STARTER));
        addNewPokemon(new Gorisulfa(new Stats(530, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).addLabels(Label.STARTER));
        addNewPokemon(new Tecnorilla(new Stats(530, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).addLabels(Label.STARTER));

        addNewPokemon(new Spactrish().fishingSpawnFromExisting().addLabels(Label.STARTER));
        addNewPokemon(new Spacteel().addLabels(Label.STARTER));
        addNewPokemon(new Whaleist(new Stats(530, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).addLabels(Label.STARTER));
        addNewPokemon(new Tecnophin(new Stats(530, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPEED))).addLabels(Label.STARTER));

        addNewPokemon(new Woolorm());
        addNewPokemon(new Blancoon());
        addNewPokemon(new Mushlanket(new Stats(480, StatArchetype.BULKY_SUPPORT, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Chowl());
        addNewPokemon(new Kickowl(new Stats(480, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Zokinub());
        addNewPokemon(new Zilozwine());
        addNewPokemon(new Zazozwine(new Stats(530, StatArchetype.PHYSICAL_WALL, List.of(StatType.ATTACK))));
        addNewPokemon(new Orbavil());
        addNewPokemon(new Earyvil());
        addNewPokemon(new Morevil(new Stats(490, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Plasmar());
        addNewPokemon(new Plateach(new Stats(450, StatArchetype.BULKY_SUPPORT, List.of(StatType.DEFENCE))));
        addNewPokemon(new Spikuch());
        addNewPokemon(new Sprunch(new Stats(460, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Baparo());
        addNewPokemon(new Bigparro(new Stats(450, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Kittone());
        addNewPokemon(new Cattwo());
        addNewPokemon(new Fetrio(new Stats(510, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Alyops());
        addNewPokemon(new Teenops());
        addNewPokemon(new Eyesult(new Stats(500, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Ugduck());
        addNewPokemon(new Swaqueen(new Stats(470, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Binthmar());
        addNewPokemon(new Umhmar(new Stats(460, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));
        addNewPokemon(new Orlic());
        addNewPokemon(new Electroll());
        addNewPokemon(new Magnetroll(new Stats(490, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Bapixie());
        addNewPokemon(new Toxipixie(new Stats(460, StatArchetype.BULKY_SUPPORT, List.of(StatType.DEFENCE))));
        addNewPokemon(new Parapixie(new Stats(460, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Burnpixie(new Stats(460, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Polaby());
        addNewPokemon(new Prirog());
        addNewPokemon(new Froprince(new Stats(520, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Maggenrola());
        addNewPokemon(new Flydore());
        addNewPokemon(new Gigascath(new Stats(515, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Chilleti());
        addNewPokemon(new Icyety(new Stats(470, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))));
        addNewPokemon(new Gecgon());
        addNewPokemon(new Phrygon());
        addNewPokemon(new Igunagon(new Stats(540, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addPokedexPokemon("baltoy, claydol");
        addNewPokemon(new Azagger(new Stats(545, StatArchetype.SPECIAL_WALL, List.of(StatType.SPECIAL_DEFENCE, StatType.DEFENCE))));

        addNewPokemon(new TrizoranSkarmory("", Aspect.TRIZORAN));
        addNewPokemon(new Azmory(new Stats(534, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Rosper());
        addNewPokemon(new Vetesper());
        addNewPokemon(new Masper(new Stats(520, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.DEFENCE))));

        addNewPokemon(new Lizaflage().addLabels(Label.STARTER));
        addNewPokemon(new Camoflora().addLabels(Label.STARTER));
        addNewPokemon(new Camottle(new Stats(524, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).addLabels(Label.STARTER));
        addNewPokemon(new Kapalze().addLabels(Label.STARTER));
        addNewPokemon(new Tutolar().addLabels(Label.STARTER));
        addNewPokemon(new Locanel(new Stats(530, StatArchetype.FAST_SPECIAL_WALL, List.of(StatType.SPECIAL_ATTACK))).addLabels(Label.STARTER));
        addNewPokemon(new Dropico().fishingSpawnFromExisting().addLabels(Label.STARTER));
        addNewPokemon(new Droprock().addLabels(Label.STARTER));
        addNewPokemon(new Rexdew(new Stats(528, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).addLabels(Label.STARTER));

        addNewPokemon(new Stoni());
        addNewPokemon(new Waraoni(new Stats(480, StatArchetype.BULKY_SUPPORT, List.of(StatType.DEFENCE))));
        addNewPokemon(new Wanyoni(new Stats(480, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Suikoni(new Stats(480, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Raioni(new Stats(480, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Gakioni(new Stats(480, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Chooni(new Stats(480, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));
        addNewPokemon(new Engoni(new Stats(480, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Mikoni(new Stats(480, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Ofoni(new Stats(480, StatArchetype.BULKY_SUPPORT, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Kanazoni(new Stats(480, StatArchetype.BULKY_SUPPORT, List.of(StatType.DEFENCE))));
        addNewPokemon(new Suchoni(new Stats(480, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Nupponi(new Stats(480, StatArchetype.SPECIAL_WALL, List.of(StatType.HP  ))));
        addNewPokemon(new Bulkoni(new Stats(480, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP, StatType.ATTACK))));
        addNewPokemon(new Atsoni(new Stats(480, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Ushioni(new Stats(480, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Hitotsoni(new Stats(480, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.HP))));
        addNewPokemon(new Ikarioni(new Stats(480, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Leapug());
        addNewPokemon(new Kingpug(new Stats(470, StatArchetype.PHYSICAL_WALL, List.of(StatType.ATTACK))));
        addNewPokemon(new Elephire());
        addNewPokemon(new Elephlaze(new Stats(470, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Telvant(new Stats(310, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));
        addNewPokemon(new Scrwant(new Stats(310, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Bulbant(new Stats(310, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Collecjunk(new Stats(410, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Rexagon(new Stats(580, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.DEFENCE))));

        addNewPokemon(new TrizoranGible("", Aspect.TRIZORAN).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new TrizoranGabite("", Aspect.TRIZORAN).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new TrizoranGarchomp("", Aspect.TRIZORAN, new Stats(600,
                StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED, StatType.SPECIAL_ATTACK))).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new TrizoranAbsol("", Aspect.TRIZORAN, new Stats(465,
                StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new TrizoranOnix("", Aspect.TRIZORAN));
        addNewPokemon(new Rayqunix(new Stats(510, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Cyrok().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Golasma().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Crimsagon(new Stats(600, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).addLabels(Label.PSEUDO_LEGENDARY));
    }
}
