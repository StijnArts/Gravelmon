{
    name: "Deltafroslassite",
    spritenum: 620,
    megaStone: "froslass-delta_mega",
    megaEvolves: "froslass",
    itemUser: ["froslass"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== delta)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10062: 760,
    gen: 6,
    isNonstandard: "Past"
}
