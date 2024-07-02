package drai.dev.gravelmon;

import com.google.common.base.*;
import dev.architectury.registry.registries.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.registries.*;
import drai.dev.gravelsextendedbattles.*;

import java.util.*;

public class Gravelmon
{
	public static final String MOD_ID = "gravelmon";
	public static void init() {
		GravelmonBlocks.BLOCKS.register();
		GravelmonItems.ITEMS.register();
		GravelmonFormEvolutions();
	}

	private static void GravelmonFormEvolutions() {
		SpeciesManager.registerFormEvolution("sandslash alolan", new EvolutionEntry("sandridger alolan", EvolutionType.LEVEL_UP, List.of(),
				List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40"))));
	}
}
