//Onderdeel A
int[] lijstje = {16, 331, 279, 561, 939, 10, 0, 27, 777, 1};
int a = 776;
int b = 777;

void setup() {
  println(komtGetalVoorIn(a, lijstje));
  println(komtGetalVoorIn(b, lijstje));
}

//Onderdeel B
boolean komtGetalVoorIn(int getal, int[] lijst) {
  boolean r = false;
  for(int i = 0; i < lijst.length; i++) {
    if(lijst[i] == getal) {
      r = true;
      break;
    } else if (lijst[i] != getal) {
      r = false;
    }
  }
  return r;
}