String[] idLijst = {"8b3", "4bf", "9h0"};

void setup() {
  plakCodeVoorIdLijst(idLijst, "NL");
  println(plakCodeVoorId(idLijst[0], "NL"));
}

void plakCodeVoorIdLijst(String[] idLijst, String code) {
  String[] idLijstje = new String[idLijst.length];
  for (int i = 0; i < idLijst.length; i++) {
    idLijstje[i] = code + idLijst[i];
    println(idLijstje[i].equals(code + idLijst[i]));
  }
}

String plakCodeVoorId(String id, String code) {
  return code + id;
}