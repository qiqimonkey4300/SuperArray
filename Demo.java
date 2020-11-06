public class Demo {
  public static void removeDuplicates(SuperArray s) {
    for (int i = s.size() - 1; i > 0; i--) {
      if (s.indexOf(s.get(i)) != i) {
        s.remove(i);
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    SuperArray overlaps = new SuperArray();
    for (int i = 0; i < a.size(); i++) {
      if (b.contains(a.get(i))) {
        overlaps.add(a.get(i));
      }
    }
    removeDuplicates(overlaps);
    return overlaps;
  }

  public static void main(String[] args) {
    SuperArray words = new SuperArray();
    words.add("kani"); words.add("uni"); words.add("ebi"); words.add("una");
    words.add("una"); words.add("ebi"); words.add("kani"); words.add("una");
    words.add("una"); words.add("ebi"); words.add("toro");
    SuperArray a = new SuperArray();
    SuperArray b = new SuperArray();
    a.add("9"); a.add("1"); a.add("2"); a.add("2"); a.add("3"); a.add("4");
    b.add("0"); b.add("4"); b.add("2"); b.add("2"); b.add("9");

    System.out.println(words.lastIndexOf("una"));
    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);
    System.out.println(findOverlap(a, b));
  }

}
