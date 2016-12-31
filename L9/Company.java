public class Company {
  public static void main(String[] args) {
    SortedDoubleLinked<String> employees = new SortedDoubleLinked<String>();
    employees.addElement("Steve");
    employees.addElement("Sue");
    employees.addElement("Simon");
    employees.addElement("Louise");
    employees.addElement("Adrian");
    employees.addElement("Sharon");

    employees.checkList();
    employees.removeElement("Simon");
    employees.checkList();
    employees.removeElement("Sharon");
    employees.checkList();
    employees.removeElement("Steve");
    employees.checkList();

    SortedDoubleLinked<Integer> niNumbers = new SortedDoubleLinked<Integer>();
    niNumbers.addElement(5);
    niNumbers.addElement(2);
    niNumbers.addElement(4);
    niNumbers.addElement(1);
    niNumbers.addElement(3);

    niNumbers.checkList();
    niNumbers.removeElement(3);
    niNumbers.checkList();
  }
}
