package prog.imper.Lab2;

import org.apache.log4j.Logger;

public class XOR {
	@Override
	public String toString() {
		return "XOR [x=" + x + ", y=" + y + "]";
	}
	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	public Integer getY() {
		return y;
	}
	public void setY(Integer y) {
		this.y = y;
	}
	
	public static final Logger logger=Logger.getLogger(XOR.class);
	
	private Integer x;
	private Integer y;
	
	public  void Swap()
	{
		if(x!=y)
		{
			x=x^y;
			y=x^y;
			x=x^y;
		}
	}
	
	public XOR(Integer x, Integer y) {
		super();
		this.x = x;
		this.y = y;
	}
	public static void main(String[] args)
	{
		XOR sn=new XOR(10,20);
		sn.setX(15);
		logger.info(sn);
		sn.Swap();
		logger.info(sn);
	}


}

