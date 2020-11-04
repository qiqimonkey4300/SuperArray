public class SuperArray {

  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean add(String element) {
    if (size == data.length) {
      resize();
    }
    data[size] = element;
    size++;
    return true;
  }

  public String get(int index) {
    return data[index];
  }

  public String set(int index, String element) {
    String old = get(index);
    data[index] = element;
    return old;
  }

  private void resize() {
    String[] replace = new String[size + 10];
    for (int i = 0; i < size; i++) {
      replace[i] = data[i];
    }
    data = replace;
  }

  public boolean isEmpty() {
    return (size == 0);
  }

  public void clear() {
    for (int i = 0; i < size; i++) {
      data[i] = null;
    }
    size = 0;
  }

  public String toString() {
    String x = "[";
    for (int i = 0; i < size - 1; i++) {
      x += data[i] + ", ";
    }
    if (size != 0) {
      x += data[size - 1];
    }
    x += "]";
    return x;
  }

  public boolean contains(String s) {
    int x = 0;
    for (int i = 0; i < data.length && x != 0; i++) {
      if (data[i] == s) x++;
    }
    return (x != 0);
  }

  public SuperArray(int initialCapacity) {
    data = new String[initialCapacity];
    size = 0;
  }

  public void add(int index, String element) {
    if (size == data.length) {
      resize();
    }
    for (int i = size; i > index; i--) {
      data[i] = data[i - 1];
    }
    data[index] = element;
  }

  public void remove(int index) {
    for (int i = index; i < size - 1; i++) {
      data[i] = data[i + 1];
    }
  }

  public int indexOf(String s) {
    int x = -1;
    for (int i = 0; i < size && x == -1; i++) {
      if (data[i].equals(s)) {
        x = i;
      }
    }
    return x;
  }

  public String[] toArray() {
    String[] x = new String[size];
    this.size = size;
    for (int i = 0; i < size; i++) {
      x[i] = data[i];
    }
    return x;
  }
}
