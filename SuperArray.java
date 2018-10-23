public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
  }

  public void clear(){
    data = new String[0];
  }

  public int size(){
    int count = 0;

    for (int i = 0 ; i < data.length ; i++) {
      if (data[i] != null) {
        count++;
      }
    }
    return count;
  }

  public boolean isEmpty(){
    if (size() == 0) {
      return true;
    }
    return false;
  }

  public boolean add(String value){
    if (size() < data.length) {
      data[size()] = value;
      return true;
    }
    return false;
  }

  
}
