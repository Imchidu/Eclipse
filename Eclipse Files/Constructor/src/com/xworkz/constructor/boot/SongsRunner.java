package program;

public class SongsRunner {

	public static void main(String[] args) {
		
		Songs Songs1=new Songs();
        
		System.out.println( Songs1.name);
		System.out.println( Songs1.lang);
		System.out.println( Songs1.singer);
		System.out.println( Songs1.lyric);
		System.out.println( Songs1.type);
		
		Songs1.name="3 peg";
		Songs1.lang="kannada";
		Songs1.singer="CS";
		Songs1.lyric="CS";
		Songs1.type="Rap";
		
		System.out.println("Details of song");
		
		System.out.println( Songs1.name);
		System.out.println( Songs1.lang);
		System.out.println( Songs1.singer);
		System.out.println( Songs1.lyric);
		System.out.println( Songs1.type);
		
		
		
		
	}

}
