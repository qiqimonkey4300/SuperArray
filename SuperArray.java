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
    if (index < 0) {
      throw new IndexOutOfBoundsException("The index can't be negative!");
    }
    if (index >= size()) {
      throw new IndexOutOfBoundsException("The index must be less than the size. Size: "+size());
    }
    return data[index];
  }

  public String set(int index, String element) {
    if (index < 0) {
      throw new IndexOutOfBoundsException("The index can't be negative!");
    }
    if (index >= size()) {
      throw new IndexOutOfBoundsException("The index must be less than the size. Size: "+size());
    }
    String old = get(index);
    data[index] = element;
    return old;
  }

  private void resize() {
    String[] replace = new String[size * 2 + 1];
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
    for (int i = 0; i < size && x == 0; i++) {
      if (data[i].equals(s)) {
        x++;
      }
    }
    return (x != 0);
  }

  public SuperArray(int initialCapacity) {
    if (initialCapacity < 0) {
      throw new IllegalArgumentException("The initial capacity cannot be negative!");
    }
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
    size += 1;
  }

  public String remove(int index) {
    String x = data[index];
    size -= 1;
    for (int i = index; i < size; i++) {
      data[i] = data[i + 1];
    }
    return x;
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
    for (int i = 0; i < size; i++) {
      x[i] = data[i];
    }
    System.out.println(x);
    System.out.println(data);
    return x;
  }

  public int lastIndexOf(String value) {
    int x = -1;
    for (int i = size - 1; i >= 0 && x == -1; i--) {
      if (data[i].equals(value)) {
        x = i;
      }
    }
    return x;
  }

  public boolean equals(SuperArray other) {
    int x = 0;
    for (int i = 0; i < other.size(); i++) {
      if (data[i] == null || !data[i].equals(other.get(i))) {
        x++;
      }
    }
    return x == 0;
  }
}
