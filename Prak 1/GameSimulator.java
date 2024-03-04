import java.util.Scanner;

public class GameSimulator{

    public static void main (String[] args){

        Scanner s = new Scanner (System.in);
        int player = Integer.parseInt(s.nextLine());
        String seeker = s.nextLine();
        HideNSeek hs = new HideNSeek(seeker, player);

        System.out.println("Game dimulai dengan "+player+ " pemain, seeker adalah " + seeker);
        while(hs.getPlayer()-1 != hs.getPlayerFound()){
            int n = Integer.parseInt(s.nextLine());
            if(n == hs.getPlayerFound()+1){
                System.out.println((hs.getPlayerFound()+1) +" Pemain ditemukan");
                hs.foundPlayer();
            }
        }
        System.out.println("Semua pemain telah ditemukan, permainan selesai.");
    }



}