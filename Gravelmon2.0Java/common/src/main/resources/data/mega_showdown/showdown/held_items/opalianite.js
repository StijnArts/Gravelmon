{
    name: "Opalianite",
    spritenum: 620,
    megaStone: "opalian-mega",
    megaEvolves: "opalian",
    itemUser: ["opalian"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10209: 760,
    gen: 6,
    isNonstandard: "Past"
}
