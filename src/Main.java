import java.util.ArrayList;

public class Main {
    public static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(1);
        list.add(4);
        System.out.println("Trước khi sắp xếp____________");
        showList(list);
        System.out.println("SAu khi sắp xếp_____________");
        selectionSort(list);
        showList(list);
    }

    public static void selectionSort(ArrayList<Integer> list) {

        for (int i = 0; i < list.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(min)) {
                    min = j;
                }
            }
            if (min != i) {
                int tem = list.get(min);
                list.set(min, list.get(i));
                list.set(i, tem);
            }

        }

    }

    public static void showList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
