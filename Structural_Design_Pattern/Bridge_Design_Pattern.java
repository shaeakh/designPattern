package Structural_Design_Pattern;

interface Video_Processor{
    void process(String videFIle);
}

class HD_processor implements Video_Processor{
    @Override
    public void process(String videFIle) {
        System.out.println("HD Resolution");
    }
}

class HD_4K_processor implements Video_Processor{
    @Override
    public void process(String videFIle) {
        System.out.println("4k Resolution");
    }
}

abstract class Video {
    protected Video_Processor video_Processor;

    public Video(Video_Processor video_Processor){
        this.video_Processor = video_Processor;
    }

    public abstract void play(String videoFile);
}

class Netflix extends Video{

    public Netflix(Video_Processor video_Processor) {
        super(video_Processor);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void play(String videoFile) {
        System.out.println( "\n" + videoFile + " is playeing in ");
        super.video_Processor.process(videoFile);        
    }
    
}

public class Bridge_Design_Pattern {
    public static void main(String[] args) {
        Video youVideo = new Netflix(new HD_processor());
        youVideo.play("abc.mp4");
    }
}
