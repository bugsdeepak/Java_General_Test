package designpattern.decorator;

public class BallDecorator extends Decorator {

	public BallDecorator(ChristmasTree ct) {
		Branch br = ct.getBranch();
		decorate(br);
	}
	
	@Override
	public void decorate(Branch br) {
		br.put("Balls");
	}

}
