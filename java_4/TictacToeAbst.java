public abstract class TictacToeAbst implements Game {

   @Override
    public void start(){
       System.out.println("Starting...");
   }
   @Override
    public void pause(){
       System.out.println("Pauseing...");
    }
    @Override
    public void play(){
       System.out.println("Play...");
    }
}
