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
    SuperArray f = new SuperArray();
    SuperArray g = new SuperArray();
    d.add("a"); d.add("b"); d.add("c"); d.add("d"); d.add("e"); d.add("f");
    f.add("a"); f.add("b"); f.add("c"); f.add("d");
    g.add("0"); g.add("1"); g.add("2"); g.add("3");

    System.out.println(words.lastIndexOf("una"));
    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);
    System.out.println(findOverlap(a, b));
    System.out.println(a.equals(b));
    System.out.println(c.equals(b));
    System.out.println(zip(d, g));
    System.out.println(zip(g, d));
    System.out.println(zip(g, f));

    System.out.println();
    System.out.println("-------SuperArray IllegalArgumentException Testing-------");
    try {
      SuperArray close = new SuperArray(5);
      System.out.println("YAY 5");
    } catch (IllegalArgumentException e){
      e.printStackTrace();
    }
    try {
      SuperArray close = new SuperArray(0);
      System.out.println("YAY 0");
    } catch (IllegalArgumentException e){
      e.printStackTrace();
    }
    try {
      SuperArray close = new SuperArray(-5);
      System.out.println("Hold on one sec...");
    } catch (IllegalArgumentException e){
      e.printStackTrace();
    }
    System.out.println();
    System.out.println("-------get IndexOutOfBoundsException Testing-------");
    try {
      System.out.println(g.get(2));
      System.out.println("good get input works");
    } catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
    }
    try {
      System.out.println(g.get(4));
      System.out.println("this index is a bit too big, it shouldnt work! :(");
    } catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
    }
    try {
      System.out.println(g.get(-2));
      System.out.println("index is a bit to the left");
    } catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
    }
    System.out.println();
    System.out.println("-------set IndexOutOfBoundsException Testing-------");
    try {
      System.out.println(g.set(2, "yeah"));
      System.out.println("good set input works");
    } catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
    }
    try {
      System.out.println(g.set(4, "Bleh"));
      System.out.println("this index is a bit too big, it shouldnt work! :(");
    } catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
    }
    try {
      System.out.println(g.set(-2, "Blah"));
      System.out.println("index is a bit to the left");
    } catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
    }
    System.out.println();
    System.out.println("-------add IndexOutOfBoundsException Testing-------");
    try {
      g.add(4, "yeah");
      System.out.println("good add input works");
    } catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
    }
    try {
      g.add(6, "Bleh");
      System.out.println("this index is a bit too big, it shouldnt work! :(");
    } catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
    }
    try {
      g.add(-2, "Blah");
      System.out.println("index is a bit to the left");
    } catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
    }
    System.out.println();
    System.out.println("-------remove IndexOutOfBoundsException Testing-------");
    try {
      System.out.println(g.remove(4));
      System.out.println("good set input works");
    } catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
    }
    try {
      System.out.println(g.remove(4));
      System.out.println("this index is a bit too big, it shouldnt work! :(");
    } catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
    }
    try {
      System.out.println(g.remove(-2));
      System.out.println("index is a bit to the left");
    } catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
    }
    System.out.println(g.toString());
  }
}
