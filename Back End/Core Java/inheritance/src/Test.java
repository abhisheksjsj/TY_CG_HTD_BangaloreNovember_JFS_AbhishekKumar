
public class Test {
	public static void main(String[] args) {

		/*
		 * FirstGeneration fg = new FirstGeneration(); fg.call(); fg.msg();
		 * SecondGeneration sg = new SecondGeneration(); sg.call(); sg.msg();
		 * sg.radio(); sg.fm(); ThirdGeneration tg = new ThirdGeneration(); tg.call();
		 * tg.msg(); tg.radio(); tg.fm(); tg.camera();
		 */

		FirstGeneration fg = new ThirdGeneration();
		fg.call();
		fg.msg();
		SecondGeneration sg = new SecondGeneration();
		sg.call();
		sg.msg();
		sg.radio();
		ThirdGeneration tg = new ThirdGeneration();
		tg.call();
		tg.msg();
		tg.radio();
		tg.camera();
	}
}
