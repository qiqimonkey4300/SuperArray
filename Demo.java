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

  public static SuperArray zip(SuperArray a, SuperArray b) {
    SuperArray all = new SuperArray();
    for (int i = 0; i < a.size() && i < b.size(); i++) {
      all.add(a.get(i));
      all.add(b.get(i));
    }
    if (b.size() > a.size()) {
      for (int i = a.size(); i < b.size(); i++) {
        all.add(b.get(i));
      }
    } else {
      for (int i = b.size(); i < a.size(); i++) {
        all.add(a.get(i));
      }
    }
    return all;
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
    SuperArray c = new SuperArray();
    c.add("0"); c.add("4"); c.add("2"); c.add("2"); c.add("9");
    SuperArray d = new SuperArray();
    SuperArray e = new SuperArray();
    SuperArray f = new SuperArray();
    d.add("a"); d.add("b"); d.add("c"); d.add("d"); d.add("e"); d.add("f");
    e.add("0"); e.add("1"); e.add("2"); e.add("3");
    f.add("a"); f.add("b"); f.add("c"); f.add("d");

    System.out.println(words.lastIndexOf("una"));
    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);
    System.out.println(findOverlap(a, b));
    System.out.println(a.equals(b));
    System.out.println(c.equals(b));
    System.out.println(zip(d, e));
    System.out.println(zip(e, d));
    System.out.println(zip(e, f));

  }

}
