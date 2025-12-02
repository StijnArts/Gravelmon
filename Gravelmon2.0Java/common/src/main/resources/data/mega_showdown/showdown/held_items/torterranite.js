{
    name: "Torterranite",
    spritenum: 620,
    megaStone: "torterra-mega",
    megaEvolves: "torterra",
    itemUser: ["torterra"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10262: 760,
    gen: 6,
    isNonstandard: "Past"
}
