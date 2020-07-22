public class Television extends Seihin {
	private int tvSeriaNumber;
	private String date;

	public void numberring() {
		tvSeriaNumber = Counter.getTvNumber();
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void print() {
		System.out.println("このテレビに関する情報:");
		System.out.println("製造番号:" + tvSeriaNumber);
		System.out.println("製造年月日" + date);
	}
}