package Praktikum05;

public class Sorting28 {
    
    int [] data;
    int jumData;

    Sorting28 (int Data[], int jumDat){
        jumData = jumDat;
        data = new int[jumDat];
        for (int i = 0; i < jumData; i++) {
            data[i] = Data[i];
        }
    }

    void bubbleSort(){
        int temp = 0;
        for (int i = 0; i < jumData; i++) {
            for (int j = 1; j < jumData; j++) {
                if (data[j-1]> data[j]) {
                    temp = data[j];
                    data[j]=data[j-1];
                    data[j-1]=temp;
                }
            }
        }
    }

    void tampil(){
        for (int i = 0; i < jumData; i++) {
            System.out.println(data[i]+"");
        }
        System.out.println();
    }

    
}
