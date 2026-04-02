package Jobsheet5;
public class Sorting09 {
    
    int data[], jumData;

    public Sorting09(int Data[], int jmlData) {
        jumData = jmlData;
        data = new int [jmlData];
        for (int i = 0; i < jumData; i++) {
            data[i] = Data[i];
        }
    }

    void bubblesort(){
        int temp = 0;
        for (int i = 0; i < jumData; i++) {
            for (int j = 1; j < jumData; j++) {
                if (data[j - 1] > data[j]){
                    temp = data[j];
                    data[j] = data [j-1];
                    data [j-1] = temp;
                }
            }
        }
    }
    void tampil(){
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
