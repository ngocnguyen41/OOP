package lap11.example.adapter;

public class PenAdapter implements PenBuyer {
	   Pen advancedMusicPlayer;

	   public PenAdapter(String penType){
	      if(penType.equalsIgnoreCase("pencil") ){
	         advancedMusicPlayer = new Pencil();

	      }else if (penType.equalsIgnoreCase("ballpointpen")){
	         advancedMusicPlayer = new BallpointPen();
	      }
	   }

	   @Override
	   public void buy(String audioType, String penColor) {
	      if(audioType.equalsIgnoreCase("pencil")){
	         advancedMusicPlayer.buyPencil(penColor);
	      }
	      else if(audioType.equalsIgnoreCase("ballpointpen")){
	         advancedMusicPlayer.buyBallpointPen(penColor);
	      }
	   }
	}
