public class Radio extends Seihin {
	private int radioSeriaNumber;

	public void numberring() {
		radioSeriaNumber = Counter.getRadioNumber();
	}
	public void print() {
		System.out.println("このラジオに関する情報:");
		System.out.println("製造番号" + radioSeriaNumber)
;	}
}