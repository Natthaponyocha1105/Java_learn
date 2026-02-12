public class interfaceExample {
    public static void main(String[] args){
        //Game game = new Game(); ไม่ให้ทำแบบนี้
        //System.out.println(level);
        //level = 5; ทำไม่ได้

        Game tictac = new TictacToe();
        System.out.println("Level is: ");
        tictac.start();
        tictac.pause();
        tictac.toContinue();
        tictac.play();
        tictac.stop();
    }
}
