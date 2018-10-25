public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
  }

  public void clear(){
    data = new String[10];
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
    else {
      resize();
      return add(value);
    }
  }

  public String get(int index){
    if (index < 0 || index >= size())
      return null;
    else
      return data[index];
  }

  public String set(int index, String value){
    if (index < 0 || index >= size())
      return null;
    else
      data[index] = value;
    return "success!";
  }

  private void resize(){
    String[] temp = new String[size()];
    for (int i = 0 ; i < data.length ; i++){
      temp[i] = data[i];
    }
    data = new String[2 * size()];
    for (int i = 0 ; i < temp.length ; i++){
      data[i] = temp[i];
    }
  }

  public boolean contains(String target){
    return false;
  }

}
