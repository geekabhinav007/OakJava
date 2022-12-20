public class TowerofHanoi {
    static int i = 0;
    public static void towerOfHanoi(int noOfDisk,String Source, String Destination, String Helper){
        i = i +1;
        if(noOfDisk == 1){
            System.out.println("Disk No. "+ noOfDisk + " goes from " + Source + " to " + Destination);

            System.out.println("Total no of Moves "+ i );
            
            return;
        }
        towerOfHanoi(noOfDisk-1, Source,Helper,Destination);
        System.out.println("Disk No. "+ noOfDisk + " goes from " + Source + " to " + Destination);
        towerOfHanoi(noOfDisk-1, Helper, Destination, Source);
    }
    public static void main(String [] args){
        int noOfDisk = 3;

        towerOfHanoi(noOfDisk, "S", "D", "H");

    }
}
