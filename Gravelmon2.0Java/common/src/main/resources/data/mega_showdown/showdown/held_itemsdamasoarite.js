{
    name: "Damasoarite",
    spritenum: 620,
    megaStone: "damasoar-mega",
    megaEvolves: "damasoar",
    itemUser: ["damasoar"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10195: 760,
    gen: 6,
    isNonstandard: "Past"
}
